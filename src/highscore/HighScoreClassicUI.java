package highscore;

import components.CirclePanel;
import contracts.IHighScore;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.geom.RoundRectangle2D;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HighScoreClassicUI  extends javax.swing.JFrame {
    private ArrayList<HighScoreClassic> leaderboards;
    Leaderboards l;
    
    public HighScoreClassicUI(Leaderboards leaderboards) {
        this.l = leaderboards;
        initComponents();
        setLocationRelativeTo(null);
        displayHighScore();
        //displayLeaderboard();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setUndecorated(true);
        //setBackground(new Color(0, 0, 0, 180));
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 70, 70));
            }
        });
        panelHighScore = new CirclePanel(new GridLayout(4,5,5,5), 50, new Color(30, 30, 30, 100));
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblScore1 = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        lblLives1 = new javax.swing.JLabel();
        lblTime1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 400));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(500, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(null);

        panelHighScore.setBackground(new java.awt.Color(0, 0, 0));
        panelHighScore.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 5, 5));
        panelHighScore.setOpaque(false);
        panelHighScore.setLayout(new java.awt.GridLayout(4, 5, 5, 5));

        jLabel2.setText("Player #");
        panelHighScore.add(jLabel2);

        jLabel1.setText("Score");
        panelHighScore.add(jLabel1);

        jLabel13.setText("Name");
        panelHighScore.add(jLabel13);

        jLabel5.setText("Lives Left");
        panelHighScore.add(jLabel5);

        jLabel9.setText("Time");
        panelHighScore.add(jLabel9);

        jLabel8.setText("1.");
        panelHighScore.add(jLabel8);
        panelHighScore.add(lblScore1);
        panelHighScore.add(lblName1);
        panelHighScore.add(lblLives1);
        panelHighScore.add(lblTime1);

        jLabel20.setText("2.");
        panelHighScore.add(jLabel20);
        panelHighScore.add(jLabel18);
        panelHighScore.add(jLabel15);
        panelHighScore.add(jLabel14);
        panelHighScore.add(jLabel11);

        jLabel10.setText("3.");
        panelHighScore.add(jLabel10);
        panelHighScore.add(jLabel7);
        panelHighScore.add(jLabel4);
        panelHighScore.add(jLabel6);
        panelHighScore.add(jLabel3);

        getContentPane().add(panelHighScore);
        panelHighScore.setBounds(40, 130, 410, 260);

        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("SUPER PLAYERS");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(50, 70, 378, 48);

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(400, 20, 60, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed
    
    private void displayHighScore(){
        try {
            for(HighScoreClassic h : l.getLeaderboards()) {
                System.out.println(h.getName());
        }
        } catch (Exception ex) {
            Logger.getLogger(HighScoreClassicUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void displayLeaderboard() {
        lblScore1.setText(leaderboards.get(0).toString());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblLives1;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblScore1;
    private javax.swing.JLabel lblTime1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panelHighScore;
    // End of variables declaration//GEN-END:variables
}
