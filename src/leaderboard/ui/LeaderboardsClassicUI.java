package leaderboard.ui;

import leaderboards.serializables.BaseLeaderboardsSerializable;
import components.CirclePanel;
import fonts.Fonts;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.geom.RoundRectangle2D;

public class LeaderboardsClassicUI  extends BaseLeaderboards {
    
    public LeaderboardsClassicUI(BaseLeaderboardsSerializable leaderboards) {
        super(leaderboards);
        
        initComponents();
        setLocationRelativeTo(null);
        
        displayColumn("score", panelHighScore);
        displayColumn("name", panelHighScore);
        displayColumn("lives", panelHighScore);
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
        panelHighScore = new CirclePanel(new GridLayout(4,5,5,5), 50, new Color(30, 30, 30, 150));
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
        lblScore2 = new javax.swing.JLabel();
        lblName2 = new javax.swing.JLabel();
        lblLives2 = new javax.swing.JLabel();
        lblTime2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblScore3 = new javax.swing.JLabel();
        lblName3 = new javax.swing.JLabel();
        lblLives3 = new javax.swing.JLabel();
        lblTime3 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        lblBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(565, 440));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(565, 500));
        getContentPane().setLayout(null);

        panelHighScore.setBackground(new java.awt.Color(0, 0, 0));
        panelHighScore.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 5, 5));
        panelHighScore.setOpaque(false);
        panelHighScore.setLayout(new java.awt.GridLayout(4, 5, 5, 5));

        jLabel2.setFont(Fonts.getPixelFont(12f)
        );
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("Player #");
        panelHighScore.add(jLabel2);

        jLabel1.setFont(Fonts.getPixelFont(12f)
        );
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("Score");
        panelHighScore.add(jLabel1);

        jLabel13.setFont(Fonts.getPixelFont(12f)
        );
        jLabel13.setForeground(new java.awt.Color(255, 255, 51));
        jLabel13.setText("Name");
        panelHighScore.add(jLabel13);

        jLabel5.setFont(Fonts.getPixelFont(12f)
        );
        jLabel5.setForeground(new java.awt.Color(255, 255, 51));
        jLabel5.setText("Lives Left");
        panelHighScore.add(jLabel5);

        jLabel9.setFont(Fonts.getPixelFont(12f)
        );
        jLabel9.setForeground(new java.awt.Color(255, 255, 51));
        jLabel9.setText("Time");
        panelHighScore.add(jLabel9);

        jLabel8.setFont(Fonts.getPixelFont(14f)
        );
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("1.");
        panelHighScore.add(jLabel8);

        lblScore1.setFont(Fonts.getPixelFont(20f)
        );
        lblScore1.setForeground(new java.awt.Color(255, 102, 0));
        lblScore1.setName("score"); // NOI18N
        panelHighScore.add(lblScore1);

        lblName1.setFont(Fonts.getPixelFont(14f)
        );
        lblName1.setForeground(new java.awt.Color(255, 255, 255));
        lblName1.setName("name"); // NOI18N
        panelHighScore.add(lblName1);

        lblLives1.setFont(Fonts.getPixelFont(14f)
        );
        lblLives1.setForeground(new java.awt.Color(255, 255, 255));
        lblLives1.setName("lives"); // NOI18N
        panelHighScore.add(lblLives1);

        lblTime1.setFont(Fonts.getPixelFont(14f)
        );
        lblTime1.setForeground(new java.awt.Color(255, 255, 255));
        lblTime1.setName("time"); // NOI18N
        panelHighScore.add(lblTime1);

        jLabel20.setFont(Fonts.getPixelFont(14f)
        );
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("2.");
        panelHighScore.add(jLabel20);

        lblScore2.setFont(Fonts.getPixelFont(20f)
        );
        lblScore2.setForeground(new java.awt.Color(255, 102, 0));
        lblScore2.setName("score"); // NOI18N
        panelHighScore.add(lblScore2);

        lblName2.setFont(Fonts.getPixelFont(14f)
        );
        lblName2.setForeground(new java.awt.Color(255, 255, 255));
        lblName2.setName("name"); // NOI18N
        panelHighScore.add(lblName2);

        lblLives2.setFont(Fonts.getPixelFont(14f)
        );
        lblLives2.setForeground(new java.awt.Color(255, 255, 255));
        lblLives2.setName("lives"); // NOI18N
        panelHighScore.add(lblLives2);

        lblTime2.setFont(Fonts.getPixelFont(14f)
        );
        lblTime2.setForeground(new java.awt.Color(255, 255, 255));
        lblTime2.setName("time"); // NOI18N
        panelHighScore.add(lblTime2);

        jLabel10.setFont(Fonts.getPixelFont(14f)
        );
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("3.");
        panelHighScore.add(jLabel10);

        lblScore3.setFont(Fonts.getPixelFont(20f)
        );
        lblScore3.setForeground(new java.awt.Color(255, 102, 0));
        lblScore3.setName("score"); // NOI18N
        panelHighScore.add(lblScore3);

        lblName3.setFont(Fonts.getPixelFont(14f)
        );
        lblName3.setForeground(new java.awt.Color(255, 255, 255));
        lblName3.setName("name"); // NOI18N
        panelHighScore.add(lblName3);

        lblLives3.setFont(Fonts.getPixelFont(14f)
        );
        lblLives3.setForeground(new java.awt.Color(255, 255, 255));
        lblLives3.setName("lives"); // NOI18N
        panelHighScore.add(lblLives3);

        lblTime3.setFont(Fonts.getPixelFont(14f)
        );
        lblTime3.setForeground(new java.awt.Color(255, 255, 255));
        lblTime3.setName("time"); // NOI18N
        panelHighScore.add(lblTime3);

        getContentPane().add(panelHighScore);
        panelHighScore.setBounds(40, 130, 480, 260);

        lblTitle.setFont(Fonts.getPixelFont(30f)
        );
        lblTitle.setForeground(new java.awt.Color(204, 0, 0));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("SUPER PLAYERS!");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(50, 70, 460, 48);

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
        btnExit.setBounds(470, 20, 60, 50);

        lblBg.setBackground(new java.awt.Color(255, 255, 0));
        lblBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ld.jpg"))); // NOI18N
        getContentPane().add(lblBg);
        lblBg.setBounds(0, -350, 670, 1110);

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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblBg;
    private javax.swing.JLabel lblLives1;
    private javax.swing.JLabel lblLives2;
    private javax.swing.JLabel lblLives3;
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
