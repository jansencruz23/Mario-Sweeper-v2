package leaderboard.ui;

import components.CirclePanel;
import leaderboards.serializables.BaseLeaderboardsSerializable;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.geom.RoundRectangle2D;

public class LeaderboardsSpeedrunUI extends BaseLeaderboards {
    
    public LeaderboardsSpeedrunUI(BaseLeaderboardsSerializable leaderboards) {
        super(leaderboards);
        
        initComponents();
        setLocationRelativeTo(null);
        
        displayColumn("score", panelHighScore);
        displayColumn("name", panelHighScore);
        displayColumn("time", panelHighScore);
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
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblScore1 = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        lblTime1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblScore2 = new javax.swing.JLabel();
        lblName2 = new javax.swing.JLabel();
        lblTime2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblScore3 = new javax.swing.JLabel();
        lblName3 = new javax.swing.JLabel();
        lblTime3 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 500));
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

        jLabel9.setText("Time");
        panelHighScore.add(jLabel9);

        jLabel8.setText("1.");
        panelHighScore.add(jLabel8);

        lblScore1.setName("score"); // NOI18N
        panelHighScore.add(lblScore1);

        lblName1.setName("name"); // NOI18N
        panelHighScore.add(lblName1);

        lblTime1.setName("time"); // NOI18N
        panelHighScore.add(lblTime1);

        jLabel20.setText("2.");
        panelHighScore.add(jLabel20);

        lblScore2.setName("score"); // NOI18N
        panelHighScore.add(lblScore2);

        lblName2.setName("name"); // NOI18N
        panelHighScore.add(lblName2);

        lblTime2.setName("time"); // NOI18N
        panelHighScore.add(lblTime2);

        jLabel10.setText("3.");
        panelHighScore.add(jLabel10);

        lblScore3.setName("score"); // NOI18N
        panelHighScore.add(lblScore3);

        lblName3.setName("name"); // NOI18N
        panelHighScore.add(lblName3);

        lblTime3.setName("time"); // NOI18N
        panelHighScore.add(lblTime3);

        getContentPane().add(panelHighScore);
        panelHighScore.setBounds(40, 130, 410, 260);

        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("SUPER PLAYERS");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(50, 70, 390, 48);

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblName2;
    private javax.swing.JLabel lblName3;
    private javax.swing.JLabel lblScore1;
    private javax.swing.JLabel lblScore2;
    private javax.swing.JLabel lblScore3;
    private javax.swing.JLabel lblTime1;
    private javax.swing.JLabel lblTime2;
    private javax.swing.JLabel lblTime3;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panelHighScore;
    // End of variables declaration//GEN-END:variables
}
