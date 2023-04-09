package mariosweeper;

import components.CirclePanel;
import fonts.Fonts;
import java.awt.Color;
import java.awt.GridLayout;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class MainMenuUI extends javax.swing.JFrame {
    private boolean isNameEdited;
    Clip clip;
    File fileBg = new File("D:\\User\\Jansen\\Self Study\\2023 - 04 - APRIL\\Java AWT\\MarioSweeper\\src\\img\\menubg.wav");
    
    public MainMenuUI() {
        initComponents();
        setLocationRelativeTo(null);
        playSoundLoop(fileBg);
        btnClassic.requestFocus(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        jPanel2 =  new CirclePanel(new GridLayout(1,2,5,5), 50, new Color(30, 30, 30, 150));
        jPanel2.setBounds(530, 25, 230, 57);
        jPanel2.setOpaque(false);
        jPanel2.setBorder(new EmptyBorder(25,25,25,25));
        btnClassic = new javax.swing.JButton();
        btnSpeedrun = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(850, 538));
        setPreferredSize(new java.awt.Dimension(850, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 500));

        jPanel1.setMinimumSize(new java.awt.Dimension(900, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(null);

        txtName.setFont(Fonts.getPixelFont(15f));
        txtName.setForeground(new java.awt.Color(102, 102, 102));
        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtName.setText("Enter your name!");
        txtName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameFocusLost(evt);
            }
        });
        jPanel1.add(txtName);
        txtName.setBounds(440, 170, 320, 40);

        jPanel2.setLayout(new java.awt.GridLayout(2, 0, 10, 10));

        btnClassic.setBackground(new java.awt.Color(254, 201, 14));
        btnClassic.setFont(Fonts.getPixelFont(30f));
        btnClassic.setForeground(new java.awt.Color(51, 51, 51));
        btnClassic.setText("CLASSIC");
        btnClassic.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(48, 48, 48), 3, true));
        btnClassic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClassic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClassicActionPerformed(evt);
            }
        });
        jPanel2.add(btnClassic);

        btnSpeedrun.setBackground(new java.awt.Color(243, 93, 143));
        btnSpeedrun.setFont(Fonts.getPixelFont(30f));
        btnSpeedrun.setForeground(new java.awt.Color(51, 51, 51));
        btnSpeedrun.setText("SPEEDRUN");
        btnSpeedrun.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(48, 48, 48), 3, true));
        btnSpeedrun.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSpeedrun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpeedrunActionPerformed(evt);
            }
        });
        jPanel2.add(btnSpeedrun);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(440, 220, 320, 200);

        jLabel1.setForeground(new java.awt.Color(229, 37, 33));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SWEEPERS");
        jLabel1.setFont(Fonts.getPixelFont(40f));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(440, 80, 320, 60);

        jLabel2.setBackground(new java.awt.Color(51, 102, 255));
        jLabel2.setForeground(new java.awt.Color(4, 156, 216));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MARIO");
        jLabel2.setFont(Fonts.getPixelFont(40f));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(440, 40, 320, 60);

        lblBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu2.jpg"))); // NOI18N
        jPanel1.add(lblBg);
        lblBg.setBounds(0, 0, 900, 500);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    public void playSoundLoop(File file) {
        try
        {
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(file));
            clip.start();
            clip.loop(10);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    private boolean isNameValid(){
        if(!isNameEdited || txtName.getText().isBlank())            
            return false;
        
        return true;
    }
    
    private void showInvalidNameDialog(){
        UIManager.put("OptionPane.messageFont", Fonts.getPixelFont(12f));
        JOptionPane.showMessageDialog(null, "Name must not be empty", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    private void btnClassicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClassicActionPerformed
        if(!isNameValid())
        {
            showInvalidNameDialog();
            return;
        }
        
        var name = txtName.getText();
        new ClassicUI(name).setVisible(true);
        exitApp();
    }//GEN-LAST:event_btnClassicActionPerformed

    private void btnSpeedrunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpeedrunActionPerformed
        if(!isNameValid())
        {
            showInvalidNameDialog();
            return;
        }
        
        var name = txtName.getText();
        new SpeedRunUI(name).setVisible(true);
        exitApp();
    }//GEN-LAST:event_btnSpeedrunActionPerformed

    private void txtNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusGained
        if(isNameEdited)
            return;
        
        isNameEdited = true;
        txtName.setText("");
        txtName.setForeground(new Color(30,30,30));
    }//GEN-LAST:event_txtNameFocusGained

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
        if(txtName.getText().isBlank())
        {
            txtName.setText("Enter your name!");
            txtName.setForeground(Color.GRAY);
            isNameEdited = false;
        }
    }//GEN-LAST:event_txtNameFocusLost

    private void exitApp(){
        this.setVisible(false);
        this.dispose();
        clip.stop();
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBg;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
