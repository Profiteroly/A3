
package view;

import dao.UsuarioDAO;
import javax.swing.JOptionPane;
import model.Usuario;


public class LoginView extends javax.swing.JFrame {


    public LoginView() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtEmail = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        botaoCadastrar = new javax.swing.JButton();
        botaoEntrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMaximumSize(new java.awt.Dimension(2560, 1440));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1900, 1080));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEmail.setBackground(new java.awt.Color(216, 217, 210));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(105, 99, 71));
        txtEmail.setBorder(null);
        txtEmail.setCaretColor(new java.awt.Color(105, 99, 71));
        txtEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtEmail.setDisabledTextColor(new java.awt.Color(0, 51, 0));
        txtEmail.setSelectedTextColor(new java.awt.Color(105, 99, 71));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 374, 540, 66));

        txtSenha.setBackground(new java.awt.Color(216, 217, 210));
        txtSenha.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(105, 99, 71));
        txtSenha.setBorder(null);
        txtSenha.setCaretColor(new java.awt.Color(105, 99, 71));
        txtSenha.setDisabledTextColor(new java.awt.Color(0, 51, 0));
        txtSenha.setSelectedTextColor(new java.awt.Color(105, 99, 71));
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        jPanel1.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 495, 540, 66));

        botaoCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botaoCadastrar.setForeground(new java.awt.Color(51, 51, 0));
        botaoCadastrar.setText("»»CADASTRAR-SE«");
        botaoCadastrar.setBorder(null);
        botaoCadastrar.setContentAreaFilled(false);
        botaoCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(botaoCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 710, 160, 20));

        botaoEntrar.setContentAreaFilled(false);
        botaoEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(botaoEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 615, 320, 74));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 55)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/login.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(1900, 1080));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1921, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarActionPerformed

     String email = txtEmail.getText();
     String senha = new String(txtSenha.getPassword());

    // Verificar se os campos de login e senha estão vazios
      if (email.isEmpty() || senha.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, preencha o campo de email e senha.");
      } else {
          

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        // Verificar no banco de dados se o login e a senha estão corretos
        if (usuarioDAO.verificarLoginSenha(email, senha)) {
            // Se o login e a senha estiverem corretos 
            Usuario model = new Usuario();
            model.setEmail(txtEmail.getText());
            //redirecione para o MenuView
            InicioView telaInicio = new InicioView();
            telaInicio.exportarEmail(model);
            this.dispose();
             telaInicio.setVisible(true);    }                                        
    else {
        // Se o login e a senha estiverem incorretos, exiba uma mensagem de erro
        JOptionPane.showMessageDialog(this, "Email ou senha incorretos. Por favor, tente novamente.");
    }
   }
    }     
      private boolean verificarLoginSenha(String senha) {  
          
        return true;   
    }//GEN-LAST:event_botaoEntrarActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
       CadastroView teladecadastro = new CadastroView();
       teladecadastro.setVisible(true);
       dispose();
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
