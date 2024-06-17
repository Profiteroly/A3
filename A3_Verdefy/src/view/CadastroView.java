
package view;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import dao.UsuarioDAO;

public class CadastroView extends javax.swing.JFrame {


    public CadastroView() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtConfirme = new javax.swing.JPasswordField();
        txtEmail = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        txtNome = new javax.swing.JTextField();
        botaoCadastrar = new javax.swing.JButton();
        botaoLogar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(jLabel1.getMinimumSize());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtConfirme.setBackground(new java.awt.Color(216, 217, 210));
        txtConfirme.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtConfirme.setForeground(new java.awt.Color(105, 99, 71));
        txtConfirme.setBorder(null);
        txtConfirme.setCaretColor(new java.awt.Color(105, 99, 71));
        txtConfirme.setDisabledTextColor(new java.awt.Color(0, 51, 0));
        txtConfirme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmeActionPerformed(evt);
            }
        });
        jPanel2.add(txtConfirme, new org.netbeans.lib.awtextra.AbsoluteConstraints(833, 606, 495, 59));

        txtEmail.setBackground(new java.awt.Color(216, 217, 210));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(105, 99, 71));
        txtEmail.setBorder(null);
        txtEmail.setCaretColor(new java.awt.Color(105, 99, 71));
        txtEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtEmail.setDisabledTextColor(new java.awt.Color(105, 99, 71));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(833, 443, 495, 59));

        txtSenha.setBackground(new java.awt.Color(216, 217, 210));
        txtSenha.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(105, 99, 71));
        txtSenha.setBorder(null);
        txtSenha.setCaretColor(new java.awt.Color(105, 99, 71));
        txtSenha.setDisabledTextColor(new java.awt.Color(0, 51, 0));
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        jPanel2.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(833, 525, 495, 59));

        txtNome.setBackground(new java.awt.Color(216, 217, 210));
        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtNome.setForeground(new java.awt.Color(105, 99, 71));
        txtNome.setBorder(null);
        txtNome.setCaretColor(new java.awt.Color(105, 99, 71));
        txtNome.setDisabledTextColor(new java.awt.Color(105, 99, 71));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        jPanel2.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(833, 363, 495, 59));

        botaoCadastrar.setContentAreaFilled(false);
        botaoCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });
        jPanel2.add(botaoCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 705, 305, 65));

        botaoLogar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botaoLogar.setForeground(new java.awt.Color(51, 51, 0));
        botaoLogar.setContentAreaFilled(false);
        botaoLogar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoLogar.setLabel("»»Log in««");
        botaoLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLogarActionPerformed(evt);
            }
        });
        jPanel2.add(botaoLogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 790, 110, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/cadastro.png"))); // NOI18N
        jLabel1.setText(" 4rrrfju");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 2580, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtConfirmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmeActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        String userName = txtNome.getText();
        String senha = new String(txtSenha.getPassword());
        String email = txtEmail.getText();
        String confirmacaoSenha = new String(txtConfirme.getPassword());
        
        if (userName.isEmpty() || senha.isEmpty() || confirmacaoSenha.isEmpty() || email.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.");
        return; // Não continua com o processo de cadastro
    }
        if (UsuarioDAO.verificarEmailEmUso(email)) {
        JOptionPane.showMessageDialog(this, "Email já está em uso. Por favor, tente outro email.");
        return;
    }

        if (!senha.equals(confirmacaoSenha)) {
        JOptionPane.showMessageDialog(this, "As senhas não correspondem. Por favor, digite novamente.");
        return; 
        }

        String sql = "INSERT INTO usuarios (login, senha, email) VALUES (?, ?, ?)";

        try (Connection conexao = Conexao.getConnection();
             PreparedStatement pstmt = conexao.prepareStatement(sql)) {

            pstmt.setString(1, userName);
            pstmt.setString(2, senha);
            pstmt.setString(3, email);

            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Dados inseridos com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao inserir os dados: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(() -> {
        new CadastroView().setVisible(true);
    });

     
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void botaoLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLogarActionPerformed
       LoginView teladelogin = new LoginView();
       teladelogin.setVisible(true);
       dispose();
    }//GEN-LAST:event_botaoLogarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoLogar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtConfirme;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
