package settings;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JDialog;
import javax.swing.JFrame;
import mariosweeper.BaseGame;
import mariosweeper.ClassicUI;
import mariosweeper.MainMenuUI;
import mariosweeper.SpeedRunUI;

public class Settings extends JDialog {
    private String name;
    private BaseGame game;
    
    public Settings(BaseGame game, String name) {
        this.game = game;
        this.name = name;
        setModal(true);
        initComponents();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);

        jPanel1.setLayout(new java.awt.GridLayout(4, 0, 5, 5));

        btnResume.setText("RESUME");
        btnResume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResumeActionPerformed(evt);
            }
        });
        jPanel1.add(btnResume);

        btnRestart.setText("RESTART");
        btnRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestartActionPerformed(evt);
            }
        });
        jPanel1.add(btnRestart);

        btnMainMenu.setText("MAIN MENU");
        btnMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnMainMenu);

        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMainMenu;
    private javax.swing.JButton btnRestart;
    private javax.swing.JButton btnResume;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
