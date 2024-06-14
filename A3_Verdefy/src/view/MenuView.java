
package view;

import dao.UsuarioDAO;
import java.awt.CardLayout;


public class MenuView extends javax.swing.JFrame {
    
    CardLayout cardLayout;
    
    public MenuView() {
        initComponents();  
        
        cardLayout = (CardLayout)(jPanel.getLayout());
    }
    
    public void exportarEmail(model.Usuario model){
        UsuarioDAO usuarioDAO = new UsuarioDAO();
  
        String userName = usuarioDAO.obterNomePorEmail(model.getEmail());
        labelNome.setText(userName);
        labelBemVindo.setText("Bem-Vindo(a) " + userName + "!");
        

}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        panelMenu = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        buttoInicio = new javax.swing.JButton();
        buttonColeta = new javax.swing.JButton();
        buttonDescarte = new javax.swing.JButton();
        buttonEco = new javax.swing.JButton();
        buttonLocaliza = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel = new javax.swing.JPanel();
        panelInicio = new javax.swing.JPanel();
        labelBemVindo = new javax.swing.JLabel();
        labelInicio1 = new javax.swing.JLabel();
        panelColeta = new javax.swing.JPanel();
        labelColeta = new javax.swing.JLabel();
        panelLocaliza = new javax.swing.JPanel();
        labelLocaliza = new javax.swing.JLabel();
        panelDescarte = new javax.swing.JPanel();
        labelDescarte = new javax.swing.JLabel();
        panelEco = new javax.swing.JPanel();
        labelEco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane.setBackground(new java.awt.Color(178, 171, 109));
        jSplitPane.setDividerSize(0);
        jSplitPane.setForeground(new java.awt.Color(178, 171, 109));

        panelMenu.setBackground(new java.awt.Color(178, 171, 109));
        panelMenu.setForeground(new java.awt.Color(178, 171, 109));
        panelMenu.setToolTipText("");
        panelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelNome.setForeground(new java.awt.Color(249, 249, 247));
        panelMenu.add(labelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 270, 50));

        buttoInicio.setBorder(null);
        buttoInicio.setContentAreaFilled(false);
        buttoInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttoInicio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/button.png"))); // NOI18N
        buttoInicio.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttonSelect.png"))); // NOI18N
        buttoInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoInicioActionPerformed(evt);
            }
        });
        panelMenu.add(buttoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 420, 110));

        buttonColeta.setBorder(null);
        buttonColeta.setContentAreaFilled(false);
        buttonColeta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonColeta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/button.png"))); // NOI18N
        buttonColeta.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttonSelect.png"))); // NOI18N
        buttonColeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonColetaActionPerformed(evt);
            }
        });
        panelMenu.add(buttonColeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 420, 110));

        buttonDescarte.setBorder(null);
        buttonDescarte.setContentAreaFilled(false);
        buttonDescarte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonDescarte.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/button.png"))); // NOI18N
        buttonDescarte.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttonSelect.png"))); // NOI18N
        buttonDescarte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDescarteActionPerformed(evt);
            }
        });
        panelMenu.add(buttonDescarte, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 420, 110));

        buttonEco.setBorder(null);
        buttonEco.setContentAreaFilled(false);
        buttonEco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonEco.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/button.png"))); // NOI18N
        buttonEco.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttonSelect.png"))); // NOI18N
        buttonEco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEcoActionPerformed(evt);
            }
        });
        panelMenu.add(buttonEco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 420, 110));

        buttonLocaliza.setBorder(null);
        buttonLocaliza.setContentAreaFilled(false);
        buttonLocaliza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLocaliza.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/button.png"))); // NOI18N
        buttonLocaliza.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttonSelect.png"))); // NOI18N
        buttonLocaliza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLocalizaActionPerformed(evt);
            }
        });
        panelMenu.add(buttonLocaliza, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 420, 110));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/menu.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        panelMenu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 432, -1));

        jSplitPane.setLeftComponent(panelMenu);

        jPanel.setBackground(new java.awt.Color(178, 171, 109));
        jPanel.setLayout(new java.awt.CardLayout());

        panelInicio.setBackground(new java.awt.Color(178, 171, 109));

        labelBemVindo.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        labelBemVindo.setForeground(new java.awt.Color(249, 249, 247));

        labelInicio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/inicio.png"))); // NOI18N
        labelInicio1.setToolTipText("");

        javax.swing.GroupLayout panelInicioLayout = new javax.swing.GroupLayout(panelInicio);
        panelInicio.setLayout(panelInicioLayout);
        panelInicioLayout.setHorizontalGroup(
            panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInicioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelBemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(labelInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 1482, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelInicioLayout.setVerticalGroup(
            panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInicioLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(labelBemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(labelInicio1)
        );

        jPanel.add(panelInicio, "inicio");

        panelColeta.setBackground(new java.awt.Color(178, 171, 109));

        labelColeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/coleta.png"))); // NOI18N
        labelColeta.setToolTipText("");

        javax.swing.GroupLayout panelColetaLayout = new javax.swing.GroupLayout(panelColeta);
        panelColeta.setLayout(panelColetaLayout);
        panelColetaLayout.setHorizontalGroup(
            panelColetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelColetaLayout.createSequentialGroup()
                .addComponent(labelColeta, javax.swing.GroupLayout.PREFERRED_SIZE, 1474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        panelColetaLayout.setVerticalGroup(
            panelColetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelColeta, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel.add(panelColeta, "coleta");

        panelLocaliza.setBackground(new java.awt.Color(178, 171, 109));

        labelLocaliza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/localiza.png"))); // NOI18N
        labelLocaliza.setToolTipText("");

        javax.swing.GroupLayout panelLocalizaLayout = new javax.swing.GroupLayout(panelLocaliza);
        panelLocaliza.setLayout(panelLocalizaLayout);
        panelLocalizaLayout.setHorizontalGroup(
            panelLocalizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLocalizaLayout.createSequentialGroup()
                .addComponent(labelLocaliza, javax.swing.GroupLayout.PREFERRED_SIZE, 1480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        panelLocalizaLayout.setVerticalGroup(
            panelLocalizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelLocaliza)
        );

        jPanel.add(panelLocaliza, "localiza");

        panelDescarte.setBackground(new java.awt.Color(178, 171, 109));

        labelDescarte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/descarte.png"))); // NOI18N
        labelDescarte.setToolTipText("");

        javax.swing.GroupLayout panelDescarteLayout = new javax.swing.GroupLayout(panelDescarte);
        panelDescarte.setLayout(panelDescarteLayout);
        panelDescarteLayout.setHorizontalGroup(
            panelDescarteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDescarteLayout.createSequentialGroup()
                .addComponent(labelDescarte, javax.swing.GroupLayout.PREFERRED_SIZE, 1474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        panelDescarteLayout.setVerticalGroup(
            panelDescarteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelDescarte, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel.add(panelDescarte, "descarte");

        panelEco.setBackground(new java.awt.Color(178, 171, 109));

        labelEco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/eco.png"))); // NOI18N
        labelEco.setToolTipText("");

        javax.swing.GroupLayout panelEcoLayout = new javax.swing.GroupLayout(panelEco);
        panelEco.setLayout(panelEcoLayout);
        panelEcoLayout.setHorizontalGroup(
            panelEcoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEcoLayout.createSequentialGroup()
                .addComponent(labelEco, javax.swing.GroupLayout.PREFERRED_SIZE, 1474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        panelEcoLayout.setVerticalGroup(
            panelEcoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelEco, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel.add(panelEco, "eco");

        jSplitPane.setRightComponent(jPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttoInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoInicioActionPerformed
        cardLayout.show(jPanel, "inicio");
    }//GEN-LAST:event_buttoInicioActionPerformed

    private void buttonColetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonColetaActionPerformed
        cardLayout.show(jPanel, "coleta");
    }//GEN-LAST:event_buttonColetaActionPerformed

    private void buttonDescarteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDescarteActionPerformed
        cardLayout.show(jPanel, "descarte");
    }//GEN-LAST:event_buttonDescarteActionPerformed

    private void buttonEcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEcoActionPerformed
        cardLayout.show(jPanel, "eco");
    }//GEN-LAST:event_buttonEcoActionPerformed

    private void buttonLocalizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLocalizaActionPerformed
        cardLayout.show(jPanel, "localiza");
    }//GEN-LAST:event_buttonLocalizaActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttoInicio;
    private javax.swing.JButton buttonColeta;
    private javax.swing.JButton buttonDescarte;
    private javax.swing.JButton buttonEco;
    private javax.swing.JButton buttonLocaliza;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JLabel labelBemVindo;
    private javax.swing.JLabel labelColeta;
    private javax.swing.JLabel labelDescarte;
    private javax.swing.JLabel labelEco;
    private javax.swing.JLabel labelInicio1;
    private javax.swing.JLabel labelLocaliza;
    private javax.swing.JLabel labelNome;
    private javax.swing.JPanel panelColeta;
    private javax.swing.JPanel panelDescarte;
    private javax.swing.JPanel panelEco;
    private javax.swing.JPanel panelInicio;
    private javax.swing.JPanel panelLocaliza;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
}
