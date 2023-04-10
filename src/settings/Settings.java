package settings;

import fonts.Fonts;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import mariosweeper.BaseGame;
import mariosweeper.ClassicUI;
import mariosweeper.MainMenuUI;
import mariosweeper.SpeedRunUI;

public class Settings extends JDialog {
    private String name;
    private BaseGame game;
    private boolean isMute = false;
    
    public Settings(BaseGame game, String name) {
        this.game = game;
        this.name = name;
        setModal(true);
        initComponents();
        setMuteIcon();
        setLocationRelativeTo(game);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 50, 50));
            }
        });
        jPanel1 = new javax.swing.JPanel();
        btnResume = new javax.swing.JButton();
        btnRestart = new javax.swing.JButton();
        btnMainMenu = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblMute = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(4, 0, 5, 5));

        btnResume.setBackground(new java.awt.Color(67, 176, 71));
        btnResume.setFont(Fonts.getPixelFont(15f)
        );
        btnResume.setForeground(new java.awt.Color(48, 48, 48));
        btnResume.setText("RESUME");
        btnResume.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(48, 48, 48), 3, true));
        btnResume.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnResume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResumeActionPerformed(evt);
            }
        });
        jPanel1.add(btnResume);

        btnRestart.setBackground(new java.awt.Color(4, 156, 216));
        btnRestart.setFont(Fonts.getPixelFont(15f)
        );
        btnRestart.setForeground(new java.awt.Color(48, 48, 48));
        btnRestart.setText("RESTART");
        btnRestart.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(48, 48, 48), 3, true));
        btnRestart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestartActionPerformed(evt);
            }
        });
        jPanel1.add(btnRestart);

        btnMainMenu.setBackground(new java.awt.Color(251, 208, 0));
        btnMainMenu.setFont(Fonts.getPixelFont(15f)
        );
        btnMainMenu.setForeground(new java.awt.Color(48, 48, 48));
        btnMainMenu.setText("MAIN MENU");
        btnMainMenu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(48, 48, 48), 3, true));
        btnMainMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnMainMenu);

        btnExit.setBackground(new java.awt.Color(229, 37, 33));
        btnExit.setFont(Fonts.getPixelFont(15f)
        );
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("EXIT");
        btnExit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(48, 48, 48), 3, true));
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit);

        lblMute.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mute.png"))); // NOI18N
        lblMute.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMute.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMuteMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bgg.jpg"))); // NOI18N
        jLabel1.setName(""); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(lblMute))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblMute))
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setMuteIcon(){
        if(isMute)
            lblMute.setIcon(new ImageIcon(getClass().getResource("../img/unmute.png")));
        else
            lblMute.setIcon(new ImageIcon(getClass().getResource("../img/mute.png")));
    }
    
    private void createClassicForm(){
        ClassicUI classicUI = new ClassicUI(name);
        game.stopSoundBackground();
        classicUI.setVisible(true);
    }
    
    private void createSpeedrunForm(){
        SpeedRunUI speedrunUI = new SpeedRunUI(name);
        game.stopSoundBackground();
        speedrunUI.setVisible(true);
    }
    
    private void createMainMenuForm(){
        MainMenuUI mainMenuUI = new MainMenuUI();
        game.stopSoundBackground();
        game.dispose();
        mainMenuUI.setVisible(true);
    }
    
    private void btnResumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResumeActionPerformed
        dispose();
    }//GEN-LAST:event_btnResumeActionPerformed

    private void btnRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestartActionPerformed
        game.dispose();
        if(game instanceof ClassicUI)
        {
            createClassicForm();
            dispose();
            return;
        }
        
        createSpeedrunForm();
        dispose();
    }//GEN-LAST:event_btnRestartActionPerformed

    private void btnMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainMenuActionPerformed
        createMainMenuForm();
        dispose();
        
    }//GEN-LAST:event_btnMainMenuActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void lblMuteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMuteMouseClicked
        if(isMute)
        {
            lblMute.setIcon(new ImageIcon(getClass().getResource("../img/mute.png")));
            game.playSoundLoop(game.getFileBG());
            isMute = false;
        }
        else
        {
            lblMute.setIcon(new ImageIcon(getClass().getResource("../img/unmute.png")));
            game.stopSoundBackground();
            isMute = true;
        }
    }//GEN-LAST:event_lblMuteMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMainMenu;
    private javax.swing.JButton btnRestart;
    private javax.swing.JButton btnResume;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMute;
    // End of variables declaration//GEN-END:variables
}
