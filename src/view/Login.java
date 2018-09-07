/**
 * Tela de Login 
 *@author Hover-Inc
 */
package view;

import core.ConnectionSG;
import core.Criptography;
import core.RWConfig;
import core.Session;
import java.sql.SQLException;


public class Login extends javax.swing.JFrame {
    //Construtor
    public Login() {
        initComponents();
        Criptography.enc("teste");
        principal.main();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtLogin = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btClose = new javax.swing.JLabel();
        btMin = new javax.swing.JLabel();
        btConfig = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(63, 184, 175));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(244, 242, 243));
        jLabel5.setText("Bem Vindo!");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(244, 242, 243));
        jLabel6.setText("Powered by:");

        jSeparator3.setBackground(new java.awt.Color(63, 184, 175));
        jSeparator3.setForeground(new java.awt.Color(244, 242, 243));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo-hover.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel5)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(22, 22, 22))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 380));

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(244, 242, 243));
        jPanel3.setForeground(new java.awt.Color(31, 32, 34));

        jPanel4.setBackground(new java.awt.Color(63, 184, 175));

        jLabel2.setBackground(new java.awt.Color(244, 242, 243));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(244, 242, 243));
        jLabel2.setText("LOGIN");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(86, 86, 86))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        jLabel8.setBackground(new java.awt.Color(244, 242, 243));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(31, 32, 34));
        jLabel8.setText("Usuário:");

        jSeparator1.setBackground(new java.awt.Color(244, 242, 243));
        jSeparator1.setForeground(new java.awt.Color(85, 87, 94));

        jSeparator2.setBackground(new java.awt.Color(244, 242, 243));
        jSeparator2.setForeground(new java.awt.Color(85, 87, 94));

        txtLogin.setBackground(new java.awt.Color(244, 242, 243));
        txtLogin.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtLogin.setBorder(null);

        jLabel9.setBackground(new java.awt.Color(244, 242, 243));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(31, 32, 34));
        jLabel9.setText("Senha:");

        btnEntrar.setBackground(new java.awt.Color(63, 184, 175));
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEntrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEntrarMouseExited(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(244, 242, 243));
        jLabel10.setText("Entrar");

        javax.swing.GroupLayout btnEntrarLayout = new javax.swing.GroupLayout(btnEntrar);
        btnEntrar.setLayout(btnEntrarLayout);
        btnEntrarLayout.setHorizontalGroup(
            btnEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEntrarLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel10)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        btnEntrarLayout.setVerticalGroup(
            btnEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEntrarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCancelar.setBackground(new java.awt.Color(199, 77, 76));
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(244, 242, 243));
        jLabel3.setText("Cancelar");

        javax.swing.GroupLayout btnCancelarLayout = new javax.swing.GroupLayout(btnCancelar);
        btnCancelar.setLayout(btnCancelarLayout);
        btnCancelarLayout.setHorizontalGroup(
            btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCancelarLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        btnCancelarLayout.setVerticalGroup(
            btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCancelarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtSenha.setBackground(new java.awt.Color(244, 242, 243));
        txtSenha.setBorder(null);
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLogin, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSenha, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, Short.MAX_VALUE)
                        .addGap(156, 156, 156))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel7.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 230, 250));

        btClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cancel_25px_4.png"))); // NOI18N
        btClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btCloseMouseExited(evt);
            }
        });
        jPanel7.add(btClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        btMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Minus_25px_1.png"))); // NOI18N
        btMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btMinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btMinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btMinMouseExited(evt);
            }
        });
        jPanel7.add(btMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        btConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Settings_25px_1.png"))); // NOI18N
        btConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btConfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btConfigMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btConfigMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btConfigMouseExited(evt);
            }
        });
        jPanel7.add(btConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 23));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(244, 242, 243));
        jLabel11.setText("Copyright © 2017 República - SG");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 160, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pc.jpg"))); // NOI18N
        jPanel7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 380));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 310, 380));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
/*----------------------Funções----------------------------*/
    //Variávei Globais
    int xx, xy;
    Principal principal = new Principal(this);
    
    
    
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // Arrastar tela, função pressionar o mouse
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // Arrastar tela, função mover
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_jPanel1MouseDragged
    //Aparencia
    private void btConfigMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btConfigMouseExited
        // Hover out configurações
        btConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Settings_25px_1.png")));
    }//GEN-LAST:event_btConfigMouseExited

    private void btConfigMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btConfigMouseEntered
        // Hover in configurações
        btConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Settings_25px_3.png")));
    }//GEN-LAST:event_btConfigMouseEntered

    private void btConfigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btConfigMouseClicked
        // Botão configurações
        OptionPane option = new OptionPane(this, true);
        btConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Settings_25px_1.png")));
        RWConfig conf = new RWConfig();
        if(conf.getStatusc()){
            
            String[] dados = conf.read();
            if(conf.getStatusr()){
                Config config = new Config(this, true, dados);
                config.setVisible(true);
                if(config.getConfStatus()){
                    conf.write(config.datas);
                    if(conf.getStatusw()){
                        config.dispose();
                        core.GerarBaseDados.gerarBase(this);
                        option.showMessage("Dados salvos com sucesso!");
                    }else{
                        config.dispose();
                        option.showError("Os dados não poderam ser salvos!");    
                    }
                }
            }else{
                option.showError("O arquivo config.ini não pôde ser lido!");
            }
            
        }else{
            option.showError("O arquivo config.ini não pôde ser criado!");
        }    
    }//GEN-LAST:event_btConfigMouseClicked

    private void btMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMinMouseExited
        // Hover out minimizar
        btMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Minus_25px_1.png")));
    }//GEN-LAST:event_btMinMouseExited

    private void btMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMinMouseEntered
        // Hover in minimizar
        btMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Minus_25px_3.png")));
    }//GEN-LAST:event_btMinMouseEntered

    private void btMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMinMouseClicked
        // Botão minimizar
        this.setExtendedState(1);
    }//GEN-LAST:event_btMinMouseClicked

    private void btCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCloseMouseExited
        // Hover out fechar
        btClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cancel_25px_4.png")));
    }//GEN-LAST:event_btCloseMouseExited

    private void btCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCloseMouseEntered
        // Hover in fechar
        btClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cancel_25px_6.png")));
    }//GEN-LAST:event_btCloseMouseEntered

    private void btCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCloseMouseClicked
        // Botão fechar
        System.exit(0);
    }//GEN-LAST:event_btCloseMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        //Botão Cancelar
        System.exit(0);
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        // Hover in Cancelar
        btnCancelar.setBackground(new java.awt.Color(132, 51, 50));
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        // Hover out Cancelar
        btnCancelar.setBackground(new java.awt.Color(199, 77, 76));
    }//GEN-LAST:event_btnCancelarMouseExited

    private void btnEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseEntered
        // Hover in Entrar
        btnEntrar.setBackground(new java.awt.Color(42, 122, 116));
    }//GEN-LAST:event_btnEntrarMouseEntered

    private void btnEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseExited
        // Hover out Entrar
        btnEntrar.setBackground(new java.awt.Color(63, 184, 175));
    }//GEN-LAST:event_btnEntrarMouseExited

    private void log(){
        OptionPane op = new OptionPane(this, true);
        String login = txtLogin.getText();
        String senha = new String(txtSenha.getPassword());
        try {
            ConnectionSG con = new ConnectionSG(this);
            con.consulta("SELECT * FROM usuarios WHERE us_login='"+login+"'","alunos");
            if(con.resultado.next()){
                if(Criptography.dec(con.resultado.getString("us_senha")).equals(senha)){
                    //senha correta
                    this.dispose();
                    String[] dados = new RWConfig().read();
                    Session.setUser(login);
                    Session.setUserNome(con.resultado.getString("us_nome"));
                    Session.setServer(dados[2]);
                    Session.setGate(dados[3]);
                    Session.setServerUser(dados[0]);
                    
                    txtLogin.setText(null);
                    txtSenha.setText(null);
                    principal.setInfor();
                    principal.setVisible(true);
                    
                }else{
                    //senha incorreta
                    op.showError("Senha incorreta!");
                }
                con.resultado.close();
                con.close();
            }else{
                op.showError("Usuário não encontrado!");
                con.resultado.close();
                con.close();
            }
        } catch (SQLException ex) {
            op.showError("Problemas com banco de dados! Verifique arquivo config.ini!");
        }
    }
    
    private void btnEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseClicked
        this.log();
    }//GEN-LAST:event_btnEntrarMouseClicked

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        this.log();
    }//GEN-LAST:event_txtSenhaActionPerformed

/*----------------------Fim Funções------------------------*/
    
    public static void main(String[] args) {
        //Método main
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login log = new Login();
                log.setVisible(true);
                log.testeCon();
            }
        });
        
    }
    private void testeCon(){
        ConnectionSG teste = new ConnectionSG(this);
        teste.consulta("SELECT * FROM usuarios","alunos");
        teste.close();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btClose;
    private javax.swing.JLabel btConfig;
    private javax.swing.JLabel btMin;
    private javax.swing.JPanel btnCancelar;
    private javax.swing.JPanel btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
