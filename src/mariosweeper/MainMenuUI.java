package mariosweeper;

import java.awt.Color;

public class MainMenuUI extends javax.swing.JFrame {

    public MainMenuUI() {
        initComponents();
        setLocationRelativeTo(null);
        btnClassic.requestFocus(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblName = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnSpeedrun = new javax.swing.JButton();
        btnClassic = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(850, 538));
        setPreferredSize(new java.awt.Dimension(850, 500));
        setSize(new java.awt.Dimension(900, 500));

        jPanel1.setMinimumSize(new java.awt.Dimension(900, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(null);

        lblName.setForeground(new java.awt.Color(102, 102, 102));
        lblName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblName.setText("Enter your name!");
        lblName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lblNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblNameFocusLost(evt);
            }
        });
        jPanel1.add(lblName);
        lblName.setBounds(440, 200, 320, 40);

        btnSpeedrun.setText("SPEEDRUN");
        btnSpeedrun.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSpeedrun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpeedrunActionPerformed(evt);
            }
        });

        btnClassic.setText("CLASSIC");
        btnClassic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClassic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClassicActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClassic, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSpeedrun, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnClassic, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnSpeedrun, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(440, 250, 320, 200);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MARIO SWEEPERS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(440, 70, 320, 60);

        lblBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu.jpg"))); // NOI18N
        lblBg.setMinimumSize(new java.awt.Dimension(900, 500));
        lblBg.setPreferredSize(new java.awt.Dimension(900, 500));
        jPanel1.add(lblBg);
        lblBg.setBounds(0, 0, 900, 500);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClassicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClassicActionPerformed
        var name = lblName.getText();
        new ClassicUI(name).setVisible(true);
        exitApp();
    }//GEN-LAST:event_btnClassicActionPerformed

    private void btnSpeedrunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpeedrunActionPerformed
        var name = lblName.getText();
        new SpeedRunUI(name).setVisible(true);
        exitApp();
    }//GEN-LAST:event_btnSpeedrunActionPerformed

    private void lblNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblNameFocusGained
        lblName.setText("");
        lblName.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblNameFocusGained

    private void lblNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblNameFocusLost
        lblName.setText("Enter your name!");
        lblName.setForeground(Color.GRAY);
    }//GEN-LAST:event_lblNameFocusLost

    private void exitApp(){
        this.setVisible(false);
        this.dispose();
    }
    
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(MainMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClassic;
    private javax.swing.JButton btnSpeedrun;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBg;
    private javax.swing.JTextField lblName;
    // End of variables declaration//GEN-END:variables
}
