package mariosweeper;

import components.CirclePanel;
import components.Components;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author user
 */
public class ClassicUI extends BaseGame {      
    int[][] grid = new int[4][4];
    int[] goalScores = { 28, 95, 225 };
    String[] difficulty = { "Easy", "Medium", "Hard" };
    ArrayList<JLabel> lives = new ArrayList<JLabel>();
    
    Components components;
    JPanel roundPanel;
    
    public ClassicUI() {
        initComponents();
        setLocationRelativeTo(null);
        setHearts();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel = new CirclePanel(new GridLayout(1,2,5,5), 50, new Color(30, 30, 30, 100));
        roundPanel.setBounds(530, 25, 230, 57);
        roundPanel.setOpaque(false);
        roundPanel.setBorder(new EmptyBorder(15,10,10,12));
        panelButtons = new CirclePanel(25);
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        txtScore = new javax.swing.JTextField();
        txtHScore = new javax.swing.JTextField();
        panelLives = new javax.swing.JPanel();
        btnStart = new javax.swing.JButton();
        lblLevel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblTimer = new javax.swing.JLabel();
        lblBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(854, 520));
        setResizable(false);
        setSize(new java.awt.Dimension(854, 520));
        getContentPane().setLayout(null);

        panelButtons.setOpaque(false);
        panelButtons.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        panelButtons.setLayout(new java.awt.GridLayout(4, 4, 5, 5));

        btn1.setBackground(new java.awt.Color(255, 183, 77));
        btn1.setIcon(setButtonIcon("/img/qm.png"));
        btn1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.setEnabled(false);
        btn1.setName("1"); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        panelButtons.add(btn1);

        btn2.setIcon(setButtonIcon("/img/qm.png"));
        btn2.setBackground(new java.awt.Color(255, 183, 77));
        btn2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2.setEnabled(false);
        btn2.setName("2"); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        panelButtons.add(btn2);

        btn3.setIcon(setButtonIcon("/img/qm.png"));
        btn3.setBackground(new java.awt.Color(255, 183, 77));
        btn3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn3.setEnabled(false);
        btn3.setName("3"); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        panelButtons.add(btn3);

        btn4.setIcon(setButtonIcon("/img/qm.png"));
        btn4.setBackground(new java.awt.Color(255, 183, 77));
        btn4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn4.setEnabled(false);
        btn4.setName("4"); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        panelButtons.add(btn4);

        btn5.setIcon(setButtonIcon("/img/qm.png"));
        btn5.setBackground(new java.awt.Color(255, 183, 77));
        btn5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn5.setEnabled(false);
        btn5.setName("5"); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        panelButtons.add(btn5);

        btn6.setIcon(setButtonIcon("/img/qm.png"));
        btn6.setBackground(new java.awt.Color(255, 183, 77));
        btn6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btn6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn6.setEnabled(false);
        btn6.setName("6"); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        panelButtons.add(btn6);

        btn7.setIcon(setButtonIcon("/img/qm.png"));
        btn7.setBackground(new java.awt.Color(255, 183, 77));
        btn7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btn7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn7.setEnabled(false);
        btn7.setName("7"); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        panelButtons.add(btn7);

        btn8.setIcon(setButtonIcon("/img/qm.png"));
        btn8.setBackground(new java.awt.Color(255, 183, 77));
        btn8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btn8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn8.setEnabled(false);
        btn8.setName("8"); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        panelButtons.add(btn8);

        btn9.setIcon(setButtonIcon("/img/qm.png"));
        btn9.setBackground(new java.awt.Color(255, 183, 77));
        btn9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btn9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn9.setEnabled(false);
        btn9.setName("9"); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        panelButtons.add(btn9);

        btn10.setIcon(setButtonIcon("/img/qm.png"));
        btn10.setBackground(new java.awt.Color(255, 183, 77));
        btn10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btn10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn10.setEnabled(false);
        btn10.setName("10"); // NOI18N
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        panelButtons.add(btn10);

        btn11.setIcon(setButtonIcon("/img/qm.png"));
        btn11.setBackground(new java.awt.Color(255, 183, 77));
        btn11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btn11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn11.setEnabled(false);
        btn11.setName("11"); // NOI18N
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        panelButtons.add(btn11);

        btn12.setIcon(setButtonIcon("/img/qm.png"));
        btn12.setBackground(new java.awt.Color(255, 183, 77));
        btn12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btn12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn12.setEnabled(false);
        btn12.setName("12"); // NOI18N
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        panelButtons.add(btn12);

        btn13.setIcon(setButtonIcon("/img/qm.png"));
        btn13.setBackground(new java.awt.Color(255, 183, 77));
        btn13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btn13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn13.setEnabled(false);
        btn13.setName("13"); // NOI18N
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        panelButtons.add(btn13);

        btn14.setIcon(setButtonIcon("/img/qm.png"));
        btn14.setBackground(new java.awt.Color(255, 183, 77));
        btn14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btn14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn14.setEnabled(false);
        btn14.setName("14"); // NOI18N
        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        panelButtons.add(btn14);

        btn15.setIcon(setButtonIcon("/img/qm.png"));
        btn15.setBackground(new java.awt.Color(255, 183, 77));
        btn15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btn15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn15.setEnabled(false);
        btn15.setName("15"); // NOI18N
        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        panelButtons.add(btn15);

        btn16.setIcon(setButtonIcon("/img/qm.png"));
        btn16.setBackground(new java.awt.Color(255, 183, 77));
        btn16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btn16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn16.setEnabled(false);
        btn16.setName("16"); // NOI18N
        btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        panelButtons.add(btn16);

        panelButtons.setBackground(new Color(0,0,0, 150));

        getContentPane().add(panelButtons);
        panelButtons.setBounds(220, 100, 400, 340);

        txtScore.setEditable(false);
        txtScore.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtScore.setForeground(new java.awt.Color(153, 51, 0));
        txtScore.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtScore.setText("2");
        getContentPane().add(txtScore);
        txtScore.setBounds(140, 50, 70, 40);

        txtHScore.setEditable(false);
        txtHScore.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtHScore.setForeground(new java.awt.Color(153, 51, 0));
        txtHScore.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHScore.setText("no records yet");
        getContentPane().add(txtHScore);
        txtHScore.setBounds(140, 10, 180, 40);

        panelLives.setOpaque(false);
        panelLives.setLayout(new java.awt.GridLayout(1, 3, 3, 0));
        getContentPane().add(panelLives);
        panelLives.setBounds(690, 30, 120, 40);

        btnStart.setIcon(setButtonIcon("/img/mario.png"));
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        getContentPane().add(btnStart);
        btnStart.setBounds(370, 20, 80, 60);

        lblLevel.setText("Easy");
        getContentPane().add(lblLevel);
        lblLevel.setBounds(40, 180, 80, 16);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Your score:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 60, 80, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("High score:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 20, 80, 20);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Developed by: Jansen C. Cruz");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(620, 460, 170, 16);

        lblTimer.setFont(new java.awt.Font("Super Mario 256", 1, 30)); // NOI18N
        lblTimer.setForeground(new java.awt.Color(255, 255, 255));
        lblTimer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTimer.setText("0.0");
        lblTimer.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblTimer.setAlignmentY(0.0F);
        lblTimer.setIconTextGap(0);
        lblTimer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(lblTimer);
        lblTimer.setBounds(560, 30, 110, 50);

        lblBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg.jpg"))); // NOI18N
        lblBg.setText("jLabel1");
        getContentPane().add(lblBg);
        lblBg.setBounds(0, 0, 854, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        components = new Components(panelButtons, txtScore, btnStart, lblTimer, txtHScore, grid, lblLevel, lives);
        passComponents(components);
        
        startGame();
        assignPos();
        print2d();
        startTimer(lblTimer);
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        JButton btn = (JButton) evt.getSource();
        switch(btn.getName()){
            case "1": clicked(0,0,btn1); break;
            case "2": clicked(0,1,btn2); break;
            case "3": clicked(0,2,btn3); break;
            case "4": clicked(0,3,btn4); break;
            case "5": clicked(1,0,btn5); break;
            case "6": clicked(1,1,btn6); break;
            case "7": clicked(1,2,btn7); break;
            case "8": clicked(1,3,btn8); break;
            case "9": clicked(2,0,btn9); break;
            case "10": clicked(2,1,btn10); break;
            case "11": clicked(2,2,btn11); break;
            case "12": clicked(2,3,btn12); break;
            case "13": clicked(3,0,btn13); break;
            case "14": clicked(3,1,btn14); break;
            case "15": clicked(3,2,btn15); break;
            case "16": clicked(3,3,btn16); break;
        }
    }//GEN-LAST:event_btnActionPerformed

    private void setHearts(){             
        final int NUMBER_OF_HEARTS = 3;
        
        panelLives.setLayout(new GridLayout(1,3,0,0));
        
        for(int i = 1; i <= NUMBER_OF_HEARTS; i++)
            lives.add(new JLabel(setButtonIcon("../img/heart.png", 35, 35)));
            
        lives.forEach(panelLives::add);
        
        roundPanel.add(lblTimer);
        roundPanel.add(panelLives);
        add(roundPanel, 1);
    }
    
    public void clicked(int x, int y, JButton btn){
        if(isGoodShroom(x, y, btn))
            addScore();
        else
            removeHeart();
        
        checkWinner();          
    }
    
    public void removeHeart(){
        panelLives.remove(lives.get(0));
        panelLives.add(new JLabel());
        lives.remove(0);
            
        if(lives.isEmpty()){
            showGameOver();
            panelLives.removeAll();
            setHearts();
        }
    }
    
    private void checkWinner(){
        final int EASY_LEVEL = 0;
        final int MAX_LEVEL = 2;
        
        int currentScore = getScore();
        int currentLevel = getCurrentLevel();
        
        if(currentScore == goalScores[currentLevel])
        {
            if(currentScore == goalScores[EASY_LEVEL])
                setScore(currentScore + 2);
            
            txtScore.setText(currentScore + "");

            if (currentLevel == MAX_LEVEL)
            {
                displayWinner();
                return;
            }
            
            formatDialog();
            goToNextLevel();
            //playSound(fileWin);
            //checkHighScore();
            resetButtons();
        }
    }
    
    private void resetButtons(){
        displayQuestionMarkButtons();
        resetGrid();
        
        assignPos();
        print2d();
    }
            
    private int getCurrentLevel() {
        switch(lblLevel.getText()) {
            case "Easy": return 0;
            case "Medium": return 1;
            case "Hard": return 2;
        }
        return 0;
    }
    
    private void addScore(){
        switch(getCurrentLevel()){
            case 0:
                setScore(getScore() + 2);
                break;
            case 1: 
                setScore(getScore() + 5);
                break;
            case 2:
                setScore(getScore() + 10);
        }
        
        txtScore.setText(getScore() +"");
    }
    
    private void goToNextLevel() {
        final int NEXT_LEVEL = getCurrentLevel() + 1;
        lblLevel.setText(difficulty[NEXT_LEVEL]);
    }
    
    private void displayWinner() {
        stopTimer();
        JOptionPane.showMessageDialog(null, "Congratulations! You win!");
        askPlayAgain();
    }
    
    private void askPlayAgain() {
        ImageIcon icon = mario;
        String message = "Do you want to play again?";
        String title = "Winner!";
        int optionType = JOptionPane.YES_NO_OPTION;
        int messageType = JOptionPane.INFORMATION_MESSAGE;
        
        int option = JOptionPane.showConfirmDialog(null, message, title, optionType, messageType, icon);
        
        if(option == 0)
            resetValues();
        else
            System.exit(0);
    }
    
    private void displayQuestionMarkButtons() {
        for(Component comp : panelButtons.getComponents()){
            var btn = (JButton) comp;
            btn.setDisabledIcon(questionMark);
            btn.setEnabled(true);
        }
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
            java.util.logging.Logger.getLogger(ClassicUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClassicUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClassicUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClassicUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClassicUI().setVisible(true);
            }
        });
    }
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblBg;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblTimer;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JPanel panelLives;
    private javax.swing.JTextField txtHScore;
    private javax.swing.JTextField txtScore;
    // End of variables declaration//GEN-END:variables
}
