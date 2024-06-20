
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
        interfaceDescarte = new javax.swing.JPanel();
        buttonSelecionar = new javax.swing.JButton();
        labelSelecione = new javax.swing.JLabel();
        cbLixo = new javax.swing.JComboBox<>();
        buttonEletronicos = new javax.swing.JButton();
        buttonVidrus = new javax.swing.JButton();
        buttonPlasticos = new javax.swing.JButton();
        buttonResiduos = new javax.swing.JButton();
        buttonOrganicos = new javax.swing.JButton();
        buttonPapeis = new javax.swing.JButton();
        labeldescarte = new javax.swing.JLabel();
        papel = new javax.swing.JPanel();
        papel1 = new javax.swing.JPanel();
        buttonVoltar3 = new javax.swing.JButton();
        labelPapel = new javax.swing.JLabel();
        residuos = new javax.swing.JPanel();
        residuos1 = new javax.swing.JPanel();
        buttonVoltar = new javax.swing.JButton();
        labelResiduos = new javax.swing.JLabel();
        organicos = new javax.swing.JPanel();
        organicos1 = new javax.swing.JPanel();
        buttonVoltar1 = new javax.swing.JButton();
        labelOrganicos = new javax.swing.JLabel();
        plasticos = new javax.swing.JPanel();
        plasticos1 = new javax.swing.JPanel();
        buttonVoltar2 = new javax.swing.JButton();
        labelPlasticos = new javax.swing.JLabel();
        eletronicos = new javax.swing.JPanel();
        eletronicos1 = new javax.swing.JPanel();
        buttonVoltar4 = new javax.swing.JButton();
        labelEletronicos = new javax.swing.JLabel();
        vidroComum = new javax.swing.JPanel();
        scrollPane4 = new java.awt.ScrollPane();
        labeltxtVidroComum1 = new javax.swing.JLabel();
        buttonVoltar5 = new javax.swing.JButton();
        vidros = new javax.swing.JPanel();
        vidross = new javax.swing.JPanel();
        buttonVoltar6 = new javax.swing.JButton();
        buttonVidroComum = new javax.swing.JButton();
        buttonLampada = new javax.swing.JButton();
        labelvidross = new javax.swing.JLabel();
        panelEco = new javax.swing.JPanel();
        eco1 = new javax.swing.JPanel();
        buttonLixos = new javax.swing.JButton();
        buttonVoceSabia = new javax.swing.JButton();
        buttonDicas = new javax.swing.JButton();
        labelEco = new javax.swing.JLabel();
        dica1 = new javax.swing.JPanel();
        scrollPane2 = new java.awt.ScrollPane();
        labeltxtLixo = new javax.swing.JLabel();

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
        buttoInicio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/button/button.png"))); // NOI18N
        buttoInicio.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/button/buttonSelect.png"))); // NOI18N
        buttoInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoInicioActionPerformed(evt);
            }
        });
        panelMenu.add(buttoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 420, 110));

        buttonColeta.setBorder(null);
        buttonColeta.setContentAreaFilled(false);
        buttonColeta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonColeta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/button/button.png"))); // NOI18N
        buttonColeta.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/button/buttonSelect.png"))); // NOI18N
        buttonColeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonColetaActionPerformed(evt);
            }
        });
        panelMenu.add(buttonColeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 420, 110));

        buttonDescarte.setBorder(null);
        buttonDescarte.setContentAreaFilled(false);
        buttonDescarte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonDescarte.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/button/button.png"))); // NOI18N
        buttonDescarte.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/button/buttonSelect.png"))); // NOI18N
        buttonDescarte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDescarteActionPerformed(evt);
            }
        });
        panelMenu.add(buttonDescarte, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 420, 110));

        buttonEco.setBorder(null);
        buttonEco.setContentAreaFilled(false);
        buttonEco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonEco.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/button/buttonSelect.png"))); // NOI18N
        buttonEco.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/button/buttonSelect.png"))); // NOI18N
        buttonEco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEcoActionPerformed(evt);
            }
        });
        panelMenu.add(buttonEco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 420, 110));

        buttonLocaliza.setBorder(null);
        buttonLocaliza.setContentAreaFilled(false);
        buttonLocaliza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLocaliza.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/button/button.png"))); // NOI18N
        buttonLocaliza.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/button/buttonSelect.png"))); // NOI18N
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
                .addGap(0, 16307, Short.MAX_VALUE))
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
                .addGap(0, 0, 0))
        );
        panelLocalizaLayout.setVerticalGroup(
            panelLocalizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelLocaliza)
        );

        jPanel.add(panelLocaliza, "localiza");

        interfaceDescarte.setBackground(new java.awt.Color(178, 171, 109));
        interfaceDescarte.setForeground(new java.awt.Color(178, 171, 109));
        interfaceDescarte.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonSelecionar.setBackground(new java.awt.Color(232, 228, 146));
        buttonSelecionar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        buttonSelecionar.setForeground(new java.awt.Color(135, 141, 112));
        buttonSelecionar.setText("SELECIONAR");
        buttonSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSelecionarActionPerformed(evt);
            }
        });
        interfaceDescarte.add(buttonSelecionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 190, 40));

        labelSelecione.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelSelecione.setForeground(new java.awt.Color(249, 249, 247));
        labelSelecione.setText("Selecione o lixo a ser descartado:");
        interfaceDescarte.add(labelSelecione, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 630, 50));

        cbLixo.setBackground(new java.awt.Color(216, 217, 210));
        cbLixo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cbLixo.setForeground(new java.awt.Color(51, 51, 0));
        cbLixo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum", "Lâmpada", "Vidro comum", "Papelão", "papel", "Celular", "Televisão", "Plástico PET(1)", "Plástico PEAD(2)", "Plástico PVC(3)", "Plástico PEBD(4)", "Plástico PP(5)", "Plástico PS(6)" }));
        cbLixo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLixoActionPerformed(evt);
            }
        });
        interfaceDescarte.add(cbLixo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 610, 80));

        buttonEletronicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/eletronicos.png"))); // NOI18N
        buttonEletronicos.setBorder(null);
        buttonEletronicos.setContentAreaFilled(false);
        buttonEletronicos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonEletronicos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/eletronicoss.png"))); // NOI18N
        buttonEletronicos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/eletronicosselect.png"))); // NOI18N
        buttonEletronicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEletronicosActionPerformed(evt);
            }
        });
        interfaceDescarte.add(buttonEletronicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 330, 410, 320));

        buttonVidrus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/vidros.png"))); // NOI18N
        buttonVidrus.setBorder(null);
        buttonVidrus.setContentAreaFilled(false);
        buttonVidrus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonVidrus.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/vidross.png"))); // NOI18N
        buttonVidrus.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/vidrosselect.png"))); // NOI18N
        buttonVidrus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVidrusActionPerformed(evt);
            }
        });
        interfaceDescarte.add(buttonVidrus, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 410, 320));

        buttonPlasticos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/plasticos.png"))); // NOI18N
        buttonPlasticos.setBorder(null);
        buttonPlasticos.setContentAreaFilled(false);
        buttonPlasticos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonPlasticos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/plasticoss.png"))); // NOI18N
        buttonPlasticos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/plasticosselect.png"))); // NOI18N
        buttonPlasticos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlasticosActionPerformed(evt);
            }
        });
        interfaceDescarte.add(buttonPlasticos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 670, 410, 320));

        buttonResiduos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/residuos.png"))); // NOI18N
        buttonResiduos.setBorder(null);
        buttonResiduos.setContentAreaFilled(false);
        buttonResiduos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonResiduos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/residuoss.png"))); // NOI18N
        buttonResiduos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/residuosselect.png"))); // NOI18N
        buttonResiduos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResiduosActionPerformed(evt);
            }
        });
        interfaceDescarte.add(buttonResiduos, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 670, 410, 320));

        buttonOrganicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/organicos.png"))); // NOI18N
        buttonOrganicos.setBorder(null);
        buttonOrganicos.setContentAreaFilled(false);
        buttonOrganicos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonOrganicos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/organicoss.png"))); // NOI18N
        buttonOrganicos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/organicosselect.png"))); // NOI18N
        buttonOrganicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOrganicosActionPerformed(evt);
            }
        });
        interfaceDescarte.add(buttonOrganicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 670, 410, 320));

        buttonPapeis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/papeis.png"))); // NOI18N
        buttonPapeis.setBorder(null);
        buttonPapeis.setContentAreaFilled(false);
        buttonPapeis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonPapeis.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/papeiss.png"))); // NOI18N
        buttonPapeis.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/papeisselect.png"))); // NOI18N
        buttonPapeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPapeisActionPerformed(evt);
            }
        });
        interfaceDescarte.add(buttonPapeis, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 410, 320));

        labeldescarte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/fundo.png"))); // NOI18N
        labeldescarte.setToolTipText("");
        interfaceDescarte.add(labeldescarte, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -10, 1860, -1));

        javax.swing.GroupLayout panelDescarteLayout = new javax.swing.GroupLayout(panelDescarte);
        panelDescarte.setLayout(panelDescarteLayout);
        panelDescarteLayout.setHorizontalGroup(
            panelDescarteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDescarteLayout.createSequentialGroup()
                .addComponent(interfaceDescarte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15901, Short.MAX_VALUE))
        );
        panelDescarteLayout.setVerticalGroup(
            panelDescarteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDescarteLayout.createSequentialGroup()
                .addComponent(interfaceDescarte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3001, Short.MAX_VALUE))
        );

        jPanel.add(panelDescarte, "descarte");

        papel.setBackground(new java.awt.Color(178, 171, 109));

        papel1.setBackground(new java.awt.Color(178, 171, 109));
        papel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonVoltar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/button/buttonVoltar.png"))); // NOI18N
        buttonVoltar3.setBorder(null);
        buttonVoltar3.setContentAreaFilled(false);
        buttonVoltar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonVoltar3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/button/buttonVoltars.png"))); // NOI18N
        buttonVoltar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltar3ActionPerformed(evt);
            }
        });
        papel1.add(buttonVoltar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 0, 110, 110));

        labelPapel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/interfacceDescarte/interfacePapeis.png"))); // NOI18N
        labelPapel.setToolTipText("");
        papel1.add(labelPapel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1480, 1090));

        javax.swing.GroupLayout papelLayout = new javax.swing.GroupLayout(papel);
        papel.setLayout(papelLayout);
        papelLayout.setHorizontalGroup(
            papelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(papelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(papel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        papelLayout.setVerticalGroup(
            papelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(papelLayout.createSequentialGroup()
                .addComponent(papel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jPanel.add(papel, "papeis");

        residuos.setBackground(new java.awt.Color(178, 171, 109));

        residuos1.setBackground(new java.awt.Color(178, 171, 109));
        residuos1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/button/buttonVoltar.png"))); // NOI18N
        buttonVoltar.setBorder(null);
        buttonVoltar.setContentAreaFilled(false);
        buttonVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonVoltar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/button/buttonVoltars.png"))); // NOI18N
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
            }
        });
        residuos1.add(buttonVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 10, 110, 110));

        labelResiduos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/interfacceDescarte/interfaceResiduos.png"))); // NOI18N
        labelResiduos.setToolTipText("");
        residuos1.add(labelResiduos, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 1472, -1));

        javax.swing.GroupLayout residuosLayout = new javax.swing.GroupLayout(residuos);
        residuos.setLayout(residuosLayout);
        residuosLayout.setHorizontalGroup(
            residuosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(residuosLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(residuos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        residuosLayout.setVerticalGroup(
            residuosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(residuosLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(residuos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jPanel.add(residuos, "residuos");

        organicos.setBackground(new java.awt.Color(178, 171, 109));

        organicos1.setBackground(new java.awt.Color(178, 171, 109));
        organicos1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonVoltar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/button/buttonVoltar.png"))); // NOI18N
        buttonVoltar1.setBorder(null);
        buttonVoltar1.setContentAreaFilled(false);
        buttonVoltar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonVoltar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/button/buttonVoltars.png"))); // NOI18N
        buttonVoltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltar1ActionPerformed(evt);
            }
        });
        organicos1.add(buttonVoltar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 10, 110, 110));

        labelOrganicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/interfacceDescarte/interfaceOrganicos.png"))); // NOI18N
        labelOrganicos.setToolTipText("");
        organicos1.add(labelOrganicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 1470, -1));

        javax.swing.GroupLayout organicosLayout = new javax.swing.GroupLayout(organicos);
        organicos.setLayout(organicosLayout);
        organicosLayout.setHorizontalGroup(
            organicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(organicosLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(organicos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        organicosLayout.setVerticalGroup(
            organicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(organicosLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(organicos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jPanel.add(organicos, "organicos");

        plasticos1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonVoltar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/button/buttonVoltar.png"))); // NOI18N
        buttonVoltar2.setBorder(null);
        buttonVoltar2.setContentAreaFilled(false);
        buttonVoltar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonVoltar2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/button/buttonVoltars.png"))); // NOI18N
        buttonVoltar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltar2ActionPerformed(evt);
            }
        });
        plasticos1.add(buttonVoltar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 0, 110, 110));

        labelPlasticos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/interfacceDescarte/interfacePlasticos.png"))); // NOI18N
        labelPlasticos.setToolTipText("");
        plasticos1.add(labelPlasticos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1470, 1080));

        javax.swing.GroupLayout plasticosLayout = new javax.swing.GroupLayout(plasticos);
        plasticos.setLayout(plasticosLayout);
        plasticosLayout.setHorizontalGroup(
            plasticosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plasticosLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(plasticos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        plasticosLayout.setVerticalGroup(
            plasticosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plasticosLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(plasticos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jPanel.add(plasticos, "plasticos");

        eletronicos1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonVoltar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/button/buttonVoltar.png"))); // NOI18N
        buttonVoltar4.setBorder(null);
        buttonVoltar4.setContentAreaFilled(false);
        buttonVoltar4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonVoltar4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/button/buttonVoltars.png"))); // NOI18N
        buttonVoltar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltar4ActionPerformed(evt);
            }
        });
        eletronicos1.add(buttonVoltar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 0, 110, 110));

        labelEletronicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/interfacceDescarte/interfaceEletronicos.png"))); // NOI18N
        labelEletronicos.setToolTipText("");
        eletronicos1.add(labelEletronicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1470, 1080));

        javax.swing.GroupLayout eletronicosLayout = new javax.swing.GroupLayout(eletronicos);
        eletronicos.setLayout(eletronicosLayout);
        eletronicosLayout.setHorizontalGroup(
            eletronicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eletronicosLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(eletronicos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        eletronicosLayout.setVerticalGroup(
            eletronicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eletronicosLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(eletronicos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jPanel.add(eletronicos, "eletronicos");

        vidroComum.setBackground(new java.awt.Color(178, 171, 109));
        vidroComum.setForeground(new java.awt.Color(178, 171, 109));

        labeltxtVidroComum1.setBackground(new java.awt.Color(178, 171, 109));
        labeltxtVidroComum1.setForeground(new java.awt.Color(178, 171, 109));
        labeltxtVidroComum1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/interfacceDescarte/vidrosComum.png"))); // NOI18N
        labeltxtVidroComum1.setToolTipText("");
        scrollPane4.add(labeltxtVidroComum1);

        buttonVoltar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/button/buttonVoltar.png"))); // NOI18N
        buttonVoltar5.setBorder(null);
        buttonVoltar5.setContentAreaFilled(false);
        buttonVoltar5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonVoltar5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/button/buttonVoltars.png"))); // NOI18N
        buttonVoltar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltar5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout vidroComumLayout = new javax.swing.GroupLayout(vidroComum);
        vidroComum.setLayout(vidroComumLayout);
        vidroComumLayout.setHorizontalGroup(
            vidroComumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vidroComumLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(vidroComumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vidroComumLayout.createSequentialGroup()
                        .addGap(1361, 1361, 1361)
                        .addComponent(buttonVoltar5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1463, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        vidroComumLayout.setVerticalGroup(
            vidroComumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vidroComumLayout.createSequentialGroup()
                .addComponent(buttonVoltar5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 941, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel.add(vidroComum, "Vidro comum");

        vidros.setBackground(new java.awt.Color(178, 171, 109));

        vidross.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonVoltar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/button/buttonVoltar.png"))); // NOI18N
        buttonVoltar6.setBorder(null);
        buttonVoltar6.setContentAreaFilled(false);
        buttonVoltar6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonVoltar6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/button/buttonVoltars.png"))); // NOI18N
        buttonVoltar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltar6ActionPerformed(evt);
            }
        });
        vidross.add(buttonVoltar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 0, 110, 110));

        buttonVidroComum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/button/vidroComumButton.png"))); // NOI18N
        buttonVidroComum.setBorder(null);
        buttonVidroComum.setContentAreaFilled(false);
        buttonVidroComum.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonVidroComum.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/button/vidroComumButtons.png"))); // NOI18N
        buttonVidroComum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVidroComumActionPerformed(evt);
            }
        });
        vidross.add(buttonVidroComum, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, 420, 320));

        buttonLampada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/button/lampadabutton.png"))); // NOI18N
        buttonLampada.setBorder(null);
        buttonLampada.setContentAreaFilled(false);
        buttonLampada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLampada.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/button/lampadabuttons.png"))); // NOI18N
        buttonLampada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLampadaActionPerformed(evt);
            }
        });
        vidross.add(buttonLampada, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 410, 320));

        labelvidross.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/interfacceDescarte/intefaceVidros.png"))); // NOI18N
        labelvidross.setToolTipText("");
        vidross.add(labelvidross, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1470, -1));

        javax.swing.GroupLayout vidrosLayout = new javax.swing.GroupLayout(vidros);
        vidros.setLayout(vidrosLayout);
        vidrosLayout.setHorizontalGroup(
            vidrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vidrosLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(vidross, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        vidrosLayout.setVerticalGroup(
            vidrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vidrosLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(vidross, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2991, Short.MAX_VALUE))
        );

        jPanel.add(vidros, "vidros");

        panelEco.setBackground(new java.awt.Color(178, 171, 109));
        panelEco.setForeground(new java.awt.Color(178, 171, 109));

        eco1.setBackground(new java.awt.Color(178, 171, 109));
        eco1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonLixos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/iconsEco/iconDicas.png"))); // NOI18N
        buttonLixos.setBorder(null);
        buttonLixos.setContentAreaFilled(false);
        buttonLixos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLixos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/iconsEco/iconDicass.png"))); // NOI18N
        buttonLixos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/iconsEco/iconDicasselect.png"))); // NOI18N
        buttonLixos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLixosActionPerformed(evt);
            }
        });
        eco1.add(buttonLixos, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 520, 410, 320));

        buttonVoceSabia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/iconsEco/iconVoceSabia.png"))); // NOI18N
        buttonVoceSabia.setBorder(null);
        buttonVoceSabia.setContentAreaFilled(false);
        buttonVoceSabia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonVoceSabia.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/iconsEco/iconVoceSabiass.png"))); // NOI18N
        buttonVoceSabia.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/iconsEco/iconVoceSabiaselect.png"))); // NOI18N
        buttonVoceSabia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoceSabiaActionPerformed(evt);
            }
        });
        eco1.add(buttonVoceSabia, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 520, 410, 320));

        buttonDicas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/iconsEco/iconLixos.png"))); // NOI18N
        buttonDicas.setBorder(null);
        buttonDicas.setContentAreaFilled(false);
        buttonDicas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonDicas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/iconsEco/iconsLixoss.png"))); // NOI18N
        buttonDicas.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/iconsEco/iconLixosselesct.png"))); // NOI18N
        buttonDicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDicasActionPerformed(evt);
            }
        });
        eco1.add(buttonDicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 410, 320));

        labelEco.setBackground(new java.awt.Color(178, 171, 109));
        labelEco.setForeground(new java.awt.Color(178, 171, 109));
        labelEco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/eco.png"))); // NOI18N
        labelEco.setToolTipText("");
        eco1.add(labelEco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, -1));

        javax.swing.GroupLayout panelEcoLayout = new javax.swing.GroupLayout(panelEco);
        panelEco.setLayout(panelEcoLayout);
        panelEcoLayout.setHorizontalGroup(
            panelEcoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17781, Short.MAX_VALUE)
            .addGroup(panelEcoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelEcoLayout.createSequentialGroup()
                    .addComponent(eco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelEcoLayout.setVerticalGroup(
            panelEcoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4071, Short.MAX_VALUE)
            .addGroup(panelEcoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelEcoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(eco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel.add(panelEco, "ecoDicas");

        dica1.setBackground(new java.awt.Color(178, 171, 109));
        dica1.setForeground(new java.awt.Color(178, 171, 109));

        labeltxtLixo.setBackground(new java.awt.Color(178, 171, 109));
        labeltxtLixo.setForeground(new java.awt.Color(178, 171, 109));
        labeltxtLixo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/interfaceEco/dica1.png"))); // NOI18N
        labeltxtLixo.setToolTipText("");
        scrollPane2.add(labeltxtLixo);

        javax.swing.GroupLayout dica1Layout = new javax.swing.GroupLayout(dica1);
        dica1.setLayout(dica1Layout);
        dica1Layout.setHorizontalGroup(
            dica1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dica1Layout.createSequentialGroup()
                .addComponent(scrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16308, Short.MAX_VALUE))
        );
        dica1Layout.setVerticalGroup(
            dica1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dica1Layout.createSequentialGroup()
                .addComponent(scrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1078, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2993, Short.MAX_VALUE))
        );

        jPanel.add(dica1, "dica1");

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
        cardLayout.show(jPanel, "ecoDicas");
    }//GEN-LAST:event_buttonEcoActionPerformed

    private void buttonLocalizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLocalizaActionPerformed
        cardLayout.show(jPanel, "localiza");
    }//GEN-LAST:event_buttonLocalizaActionPerformed

    private void buttonVidroComumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVidroComumActionPerformed
        cardLayout.show(jPanel, "Vidro comum");
    }//GEN-LAST:event_buttonVidroComumActionPerformed

    private void buttonLampadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLampadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonLampadaActionPerformed

    private void buttonLixosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLixosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonLixosActionPerformed

    private void buttonVoceSabiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoceSabiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonVoceSabiaActionPerformed

    private void buttonDicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDicasActionPerformed
        cardLayout.show(jPanel, "dica1");
    }//GEN-LAST:event_buttonDicasActionPerformed
    // TODO add your handling code here:
    // TODO add your handling code here:

    private void buttonVidrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVidros2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonVidros2ActionPerformed
    // TODO add your handling code here:


    private void buttonOrganicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOrganicosActionPerformed
        cardLayout.show(jPanel, "organicos");
    }//GEN-LAST:event_buttonOrganicosActionPerformed

    private void buttonResiduosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResiduosActionPerformed
        cardLayout.show(jPanel, "residuos");
    }//GEN-LAST:event_buttonResiduosActionPerformed

    private void buttonPlasticosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlasticosActionPerformed
        cardLayout.show(jPanel, "plasticos");
    }//GEN-LAST:event_buttonPlasticosActionPerformed

    private void buttonPapeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPapeisActionPerformed
        cardLayout.show(jPanel, "papeis");
    }//GEN-LAST:event_buttonPapeisActionPerformed

    private void buttonEletronicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEletronicosActionPerformed
        cardLayout.show(jPanel, "eletronicos");
    }//GEN-LAST:event_buttonEletronicosActionPerformed

    private void cbLixoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLixoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbLixoActionPerformed

    private void buttonSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSelecionarActionPerformed
        String selectedItem = cbLixo.getSelectedItem().toString();
        cardLayout.show(jPanel, selectedItem);
    }//GEN-LAST:event_buttonSelecionarActionPerformed

    private void buttonVidrusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVidrusActionPerformed
        cardLayout.show(jPanel, "vidros");
    }//GEN-LAST:event_buttonVidrusActionPerformed

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
        cardLayout.show(jPanel, "descarte");
    }//GEN-LAST:event_buttonVoltarActionPerformed

    private void buttonVoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltar1ActionPerformed
        cardLayout.show(jPanel, "descarte");
    }//GEN-LAST:event_buttonVoltar1ActionPerformed

    private void buttonVoltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltar2ActionPerformed
        cardLayout.show(jPanel, "descarte");
    }//GEN-LAST:event_buttonVoltar2ActionPerformed

    private void buttonVoltar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltar3ActionPerformed
        cardLayout.show(jPanel, "descarte");
    }//GEN-LAST:event_buttonVoltar3ActionPerformed

    private void buttonVoltar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltar4ActionPerformed
        cardLayout.show(jPanel, "descarte");
    }//GEN-LAST:event_buttonVoltar4ActionPerformed

    private void buttonVoltar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltar5ActionPerformed
        cardLayout.show(jPanel, "vidros");
    }//GEN-LAST:event_buttonVoltar5ActionPerformed

    private void buttonVoltar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltar6ActionPerformed
        cardLayout.show(jPanel, "descarte");
    }//GEN-LAST:event_buttonVoltar6ActionPerformed

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
    private javax.swing.JButton buttonDicas;
    private javax.swing.JButton buttonEco;
    private javax.swing.JButton buttonEletronicos;
    private javax.swing.JButton buttonLampada;
    private javax.swing.JButton buttonLixos;
    private javax.swing.JButton buttonLocaliza;
    private javax.swing.JButton buttonOrganicos;
    private javax.swing.JButton buttonPapeis;
    private javax.swing.JButton buttonPlasticos;
    private javax.swing.JButton buttonResiduos;
    private javax.swing.JButton buttonSelecionar;
    private javax.swing.JButton buttonVidroComum;
    private javax.swing.JButton buttonVidrus;
    private javax.swing.JButton buttonVoceSabia;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JButton buttonVoltar1;
    private javax.swing.JButton buttonVoltar2;
    private javax.swing.JButton buttonVoltar3;
    private javax.swing.JButton buttonVoltar4;
    private javax.swing.JButton buttonVoltar5;
    private javax.swing.JButton buttonVoltar6;
    javax.swing.JComboBox<String> cbLixo;
    private javax.swing.JPanel dica1;
    private javax.swing.JPanel eco1;
    private javax.swing.JPanel eletronicos;
    private javax.swing.JPanel eletronicos1;
    private javax.swing.JPanel interfaceDescarte;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JLabel labelBemVindo;
    private javax.swing.JLabel labelColeta;
    private javax.swing.JLabel labelEco;
    private javax.swing.JLabel labelEletronicos;
    private javax.swing.JLabel labelInicio1;
    private javax.swing.JLabel labelLocaliza;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelOrganicos;
    private javax.swing.JLabel labelPapel;
    private javax.swing.JLabel labelPlasticos;
    private javax.swing.JLabel labelResiduos;
    private javax.swing.JLabel labelSelecione;
    private javax.swing.JLabel labeldescarte;
    private javax.swing.JLabel labeltxtLixo;
    private javax.swing.JLabel labeltxtVidroComum1;
    private javax.swing.JLabel labelvidross;
    private javax.swing.JPanel organicos;
    private javax.swing.JPanel organicos1;
    private javax.swing.JPanel panelColeta;
    private javax.swing.JPanel panelDescarte;
    private javax.swing.JPanel panelEco;
    private javax.swing.JPanel panelInicio;
    private javax.swing.JPanel panelLocaliza;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel papel;
    private javax.swing.JPanel papel1;
    private javax.swing.JPanel plasticos;
    private javax.swing.JPanel plasticos1;
    private javax.swing.JPanel residuos;
    private javax.swing.JPanel residuos1;
    private java.awt.ScrollPane scrollPane2;
    private java.awt.ScrollPane scrollPane4;
    private javax.swing.JPanel vidroComum;
    private javax.swing.JPanel vidros;
    private javax.swing.JPanel vidross;
    // End of variables declaration//GEN-END:variables
}
