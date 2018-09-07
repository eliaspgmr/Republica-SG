/**
 *
 * @author Elias
 */
package view;


import java.awt.Color;


public class OptionPane extends javax.swing.JDialog {
    //contrutor
    public OptionPane(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opMessage = new javax.swing.JPanel();
        controlPanelMessage = new javax.swing.JPanel();
        btMessageOK = new javax.swing.JLabel();
        iconMessage = new javax.swing.JLabel();
        textMessage = new javax.swing.JLabel();
        titleMessage = new javax.swing.JLabel();
        opError = new javax.swing.JPanel();
        controlPanelError = new javax.swing.JPanel();
        btErrorOK = new javax.swing.JLabel();
        iconError = new javax.swing.JLabel();
        textError = new javax.swing.JLabel();
        titleError = new javax.swing.JLabel();
        opQuestion = new javax.swing.JPanel();
        controlPanelQuestion = new javax.swing.JPanel();
        btQuestionNao = new javax.swing.JLabel();
        btQuestionSim = new javax.swing.JLabel();
        iconQuestion = new javax.swing.JLabel();
        titleQuestion = new javax.swing.JLabel();
        textQuestion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        opMessage.setBackground(new java.awt.Color(47, 49, 54));

        controlPanelMessage.setOpaque(false);

        btMessageOK.setBackground(new java.awt.Color(63, 184, 175));
        btMessageOK.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        btMessageOK.setForeground(new java.awt.Color(244, 242, 243));
        btMessageOK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btMessageOK.setText("OK");
        btMessageOK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btMessageOK.setOpaque(true);
        btMessageOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btMessageOKMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btMessageOKMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btMessageOKMouseExited(evt);
            }
        });

        javax.swing.GroupLayout controlPanelMessageLayout = new javax.swing.GroupLayout(controlPanelMessage);
        controlPanelMessage.setLayout(controlPanelMessageLayout);
        controlPanelMessageLayout.setHorizontalGroup(
            controlPanelMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelMessageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btMessageOK, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        controlPanelMessageLayout.setVerticalGroup(
            controlPanelMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelMessageLayout.createSequentialGroup()
                .addComponent(btMessageOK, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        iconMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Attention_48px_2.png"))); // NOI18N

        textMessage.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        textMessage.setForeground(new java.awt.Color(244, 242, 243));

        titleMessage.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        titleMessage.setForeground(new java.awt.Color(244, 242, 243));
        titleMessage.setText("ATENÇÂO!");

        javax.swing.GroupLayout opMessageLayout = new javax.swing.GroupLayout(opMessage);
        opMessage.setLayout(opMessageLayout);
        opMessageLayout.setHorizontalGroup(
            opMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opMessageLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(iconMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(opMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addGap(22, 22, 22))
            .addComponent(controlPanelMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        opMessageLayout.setVerticalGroup(
            opMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opMessageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(opMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(opMessageLayout.createSequentialGroup()
                        .addComponent(titleMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(iconMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(controlPanelMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(opMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 140));

        opError.setBackground(new java.awt.Color(47, 49, 54));

        controlPanelError.setOpaque(false);

        btErrorOK.setBackground(new java.awt.Color(63, 184, 175));
        btErrorOK.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        btErrorOK.setForeground(new java.awt.Color(244, 242, 243));
        btErrorOK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btErrorOK.setText("OK");
        btErrorOK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btErrorOK.setOpaque(true);
        btErrorOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btErrorOKMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btErrorOKMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btErrorOKMouseExited(evt);
            }
        });

        javax.swing.GroupLayout controlPanelErrorLayout = new javax.swing.GroupLayout(controlPanelError);
        controlPanelError.setLayout(controlPanelErrorLayout);
        controlPanelErrorLayout.setHorizontalGroup(
            controlPanelErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelErrorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btErrorOK, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        controlPanelErrorLayout.setVerticalGroup(
            controlPanelErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelErrorLayout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(btErrorOK, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        iconError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Error_52px.png"))); // NOI18N

        textError.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        textError.setForeground(new java.awt.Color(244, 242, 243));

        titleError.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        titleError.setForeground(new java.awt.Color(244, 242, 243));
        titleError.setText("ERRO!");

        javax.swing.GroupLayout opErrorLayout = new javax.swing.GroupLayout(opError);
        opError.setLayout(opErrorLayout);
        opErrorLayout.setHorizontalGroup(
            opErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(controlPanelError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(opErrorLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(iconError, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(opErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleError, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textError, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        opErrorLayout.setVerticalGroup(
            opErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opErrorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(opErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(opErrorLayout.createSequentialGroup()
                        .addComponent(titleError, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textError, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(iconError, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(controlPanelError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(opError, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 140));

        opQuestion.setBackground(new java.awt.Color(47, 49, 54));

        controlPanelQuestion.setOpaque(false);

        btQuestionNao.setBackground(new java.awt.Color(199, 77, 76));
        btQuestionNao.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        btQuestionNao.setForeground(new java.awt.Color(244, 242, 243));
        btQuestionNao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btQuestionNao.setText("NÂO");
        btQuestionNao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btQuestionNao.setOpaque(true);
        btQuestionNao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btQuestionNaoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btQuestionNaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btQuestionNaoMouseExited(evt);
            }
        });

        btQuestionSim.setBackground(new java.awt.Color(63, 184, 175));
        btQuestionSim.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        btQuestionSim.setForeground(new java.awt.Color(244, 242, 243));
        btQuestionSim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btQuestionSim.setText("SIM");
        btQuestionSim.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btQuestionSim.setOpaque(true);
        btQuestionSim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btQuestionSimMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btQuestionSimMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btQuestionSimMouseExited(evt);
            }
        });

        javax.swing.GroupLayout controlPanelQuestionLayout = new javax.swing.GroupLayout(controlPanelQuestion);
        controlPanelQuestion.setLayout(controlPanelQuestionLayout);
        controlPanelQuestionLayout.setHorizontalGroup(
            controlPanelQuestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelQuestionLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(btQuestionSim, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btQuestionNao, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        controlPanelQuestionLayout.setVerticalGroup(
            controlPanelQuestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelQuestionLayout.createSequentialGroup()
                .addGroup(controlPanelQuestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btQuestionNao, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btQuestionSim, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 1, Short.MAX_VALUE))
        );

        iconQuestion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ask Question_48px.png"))); // NOI18N

        titleQuestion.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        titleQuestion.setForeground(new java.awt.Color(244, 242, 243));
        titleQuestion.setText("ATENÇÂO!");

        textQuestion.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        textQuestion.setForeground(new java.awt.Color(244, 242, 243));

        javax.swing.GroupLayout opQuestionLayout = new javax.swing.GroupLayout(opQuestion);
        opQuestion.setLayout(opQuestionLayout);
        opQuestionLayout.setHorizontalGroup(
            opQuestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opQuestionLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(iconQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(opQuestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
            .addComponent(controlPanelQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        opQuestionLayout.setVerticalGroup(
            opQuestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opQuestionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(opQuestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(opQuestionLayout.createSequentialGroup()
                        .addComponent(titleQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(controlPanelQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(opQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 140));

        getAccessibleContext().setAccessibleName("dialogPai");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btMessageOKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMessageOKMouseClicked
        // Botão OK Message
        btMessageOK.setBackground(new Color(63, 184, 175));
        this.dispose();
    }//GEN-LAST:event_btMessageOKMouseClicked

    private void btQuestionNaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btQuestionNaoMouseClicked
        value = false;
        btQuestionNao.setBackground(new Color(199, 77, 76));
        this.dispose();
    }//GEN-LAST:event_btQuestionNaoMouseClicked

    private void btQuestionSimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btQuestionSimMouseClicked
        value = true;
        btQuestionSim.setBackground(new Color(63, 184, 175));
        this.dispose();
    }//GEN-LAST:event_btQuestionSimMouseClicked

    private void btErrorOKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btErrorOKMouseClicked
        // Botão OK Question
        btErrorOK.setBackground(new Color(63, 184, 175));
        this.dispose();
    }//GEN-LAST:event_btErrorOKMouseClicked

    private void btQuestionSimMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btQuestionSimMouseEntered
        btQuestionSim.setBackground(new Color(42, 122, 116));
    }//GEN-LAST:event_btQuestionSimMouseEntered

    private void btQuestionSimMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btQuestionSimMouseExited
        btQuestionSim.setBackground(new Color(63, 184, 175));
    }//GEN-LAST:event_btQuestionSimMouseExited

    private void btQuestionNaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btQuestionNaoMouseEntered
        btQuestionNao.setBackground(new Color(132, 51, 50));
    }//GEN-LAST:event_btQuestionNaoMouseEntered

    private void btQuestionNaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btQuestionNaoMouseExited
        btQuestionNao.setBackground(new Color(199, 77, 76));
    }//GEN-LAST:event_btQuestionNaoMouseExited

    private void btErrorOKMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btErrorOKMouseEntered
        btErrorOK.setBackground(new Color(42, 122, 116));
    }//GEN-LAST:event_btErrorOKMouseEntered

    private void btErrorOKMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btErrorOKMouseExited
        btErrorOK.setBackground(new Color(63, 184, 175));
    }//GEN-LAST:event_btErrorOKMouseExited

    private void btMessageOKMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMessageOKMouseEntered
        btMessageOK.setBackground(new Color(42, 122, 116));
    }//GEN-LAST:event_btMessageOKMouseEntered

    private void btMessageOKMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMessageOKMouseExited
        btMessageOK.setBackground(new Color(63, 184, 175));
    }//GEN-LAST:event_btMessageOKMouseExited
    
    public void showMessage(String text){
        //Tela de Mensagem
        textMessage.setText(text);
        opMessage.setVisible(true);
        opQuestion.setVisible(false);
        opError.setVisible(false);
        int width = opMessage.preferredSize().width;
        int oldHeight = this.getHeight();
        this.setSize(width, oldHeight);
        this.setVisible(true);
        
    }
    public void showError(String text){
        //Tela de erro
        textError.setText(text);
        opMessage.setVisible(false);
        opQuestion.setVisible(false);
        opError.setVisible(true);
        int width = opError.preferredSize().width;
        int oldHeight = this.getHeight();
        this.setSize(width, oldHeight);
        this.setVisible(true);
    }
    
    public void showQuestion(String text){
        //Tela de Question
        textQuestion.setText(text);
        opMessage.setVisible(false);
        opQuestion.setVisible(true);
        opError.setVisible(false);
        int width = opQuestion.preferredSize().width;
        int oldHeight = this.getHeight();
        this.setSize(width, oldHeight);
        this.setVisible(true);
    }
    private boolean value;
    public boolean getValue(){
        return value;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btErrorOK;
    private javax.swing.JLabel btMessageOK;
    private javax.swing.JLabel btQuestionNao;
    private javax.swing.JLabel btQuestionSim;
    private javax.swing.JPanel controlPanelError;
    private javax.swing.JPanel controlPanelMessage;
    private javax.swing.JPanel controlPanelQuestion;
    private javax.swing.JLabel iconError;
    private javax.swing.JLabel iconMessage;
    private javax.swing.JLabel iconQuestion;
    private javax.swing.JPanel opError;
    private javax.swing.JPanel opMessage;
    private javax.swing.JPanel opQuestion;
    private javax.swing.JLabel textError;
    private javax.swing.JLabel textMessage;
    private javax.swing.JLabel textQuestion;
    private javax.swing.JLabel titleError;
    private javax.swing.JLabel titleMessage;
    private javax.swing.JLabel titleQuestion;
    // End of variables declaration//GEN-END:variables
}
