
package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;




public class UsuarioDAO {

    public static boolean verificarEmailEmUso;

    public boolean verificarLoginSenha(String email, String senha) {
        Connection conexao = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        boolean valido = false;
        
        try {
            conexao = Conexao.getConnection();
            String sql = "SELECT * FROM usuarios WHERE email = ? AND senha = ?";
            pstmt = conexao.prepareStatement(sql);
            pstmt.setString(1, email);
            pstmt.setString(2, senha);
            rs = pstmt.executeQuery();
            
            valido = rs.next(); // Se houver um resultado, o login e senha são válidos
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conexao != null) conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return valido;
    }
    
    public String obterNomePorEmail(String email) {
    String userName = null;
    String sql = "SELECT login FROM usuarios WHERE email = ?";

    try (Connection conexao = Conexao.getConnection();
         PreparedStatement pstmt = conexao.prepareStatement(sql)) {

        pstmt.setString(1, email);
        try (ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                userName = rs.getString("login");
            }
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }

    return userName;
}
    
    public boolean verificarEmailEmUso(String email) {
        String sql = "SELECT COUNT(*) FROM usuarios WHERE email = ?";

        try (Connection conexao = Conexao.getConnection();
            PreparedStatement pstmt = conexao.prepareStatement(sql)) {

            pstmt.setString(1, email);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next() && rs.getInt(1) > 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}
