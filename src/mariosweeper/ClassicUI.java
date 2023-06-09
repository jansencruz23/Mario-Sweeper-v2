package mariosweeper;

import components.CirclePanel;
import components.Components;
import fonts.Fonts;
import highscore.serializables.HighScoreClassic;
import leaderboard.ui.LeaderboardsClassicUI;
import leaderboards.serializables.LeaderboardsClassic;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Jansen C. Cruz
 */

public class ClassicUI extends BaseGame {
    private String name;
    int[][] grid = new int[4][4];
    int[] goalScores = { 28, 85, 175 };
    String[] difficulty = { "Easy", "Medium", "Hard" };
    ArrayList<JLabel> lives = new ArrayList<JLabel>();
    int badShrooms = 3;
    
    Components components;
    LeaderboardsClassic leaderboard = new LeaderboardsClassic();
    HighScoreClassic highScore = new HighScoreClassic();
    JPanel roundPanel;
    
    public ClassicUI(String name) {
        this.name = name;
        initComponents();
        setLocationRelativeTo(null);
        playSoundLoop(fileBG);
        setHearts();
        displayHighScore();
        readLeaderboards();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel = new CirclePanel(new GridLayout(1,2,5,5), 50, new Color(30, 30, 30, 100));
        roundPanel.setBounds(500, 22, 230, 57);
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
        panelLives = new javax.swing.JPanel();
        btnStart = new javax.swing.JButton();
        btnHighScore = new javax.swing.JButton();
        lblLevel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblScore = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblTimer = new javax.swing.JLabel();
        lblSettings = new javax.swing.JLabel();
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
                btn1ActionPerformed(evt);
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
                btn2ActionPerformed(evt);
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
                btn3ActionPerformed(evt);
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
                btn4ActionPerformed(evt);
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
                btn5ActionPerformed(evt);
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
                btn6ActionPerformed(evt);
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
                btn7ActionPerformed(evt);
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
                btn8ActionPerformed(evt);
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
                btn9ActionPerformed(evt);
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
                btn10ActionPerformed(evt);
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
                btn11ActionPerformed(evt);
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
                btn12ActionPerformed(evt);
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
                btn13ActionPerformed(evt);
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
                btn14ActionPerformed(evt);
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
                btn15ActionPerformed(evt);
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
                btn16ActionPerformed(evt);
            }
        });
        panelButtons.add(btn16);

        panelButtons.setBackground(new Color(0,0,0, 150));

        getContentPane().add(panelButtons);
        panelButtons.setBounds(220, 100, 400, 340);

        panelLives.setOpaque(false);
        panelLives.setLayout(new java.awt.GridLayout(1, 3, 3, 0));
        getContentPane().add(panelLives);
        panelLives.setBounds(710, 30, 120, 40);

        btnStart.setIcon(setButtonIcon("/img/mario.png"));
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        getContentPane().add(btnStart);
        btnStart.setBounds(380, 20, 80, 60);

        btnHighScore.setBackground(new java.awt.Color(255, 102, 0));
        btnHighScore.setFont(Fonts.getPixelFont(20f)
        );
        btnHighScore.setForeground(new java.awt.Color(255, 255, 255));
        btnHighScore.setText("n/a");
        btnHighScore.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        btnHighScore.setFocusPainted(false);
        btnHighScore.setFocusable(false);
        btnHighScore.setMinimumSize(new java.awt.Dimension(12, 22));
        btnHighScore.setPreferredSize(new java.awt.Dimension(12, 22));
        btnHighScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHighScoreActionPerformed(evt);
            }
        });
        getContentPane().add(btnHighScore);
        btnHighScore.setBounds(40, 40, 120, 40);

        lblLevel.setFont(Fonts.getPixelFont(20f)
        );
        lblLevel.setForeground(new java.awt.Color(255, 255, 255));
        lblLevel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLevel.setText("Easy");
        getContentPane().add(lblLevel);
        lblLevel.setBounds(260, 40, 120, 40);

        jLabel1.setFont(Fonts.getPixelFont(15f));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Level");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 0, 100, 40);

        jLabel3.setFont(Fonts.getPixelFont(15f)
        );
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("High score");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 10, 140, 20);

        lblScore.setFont(Fonts.getPixelFont(20f)
        );
        lblScore.setForeground(new java.awt.Color(255, 255, 255));
        lblScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblScore.setText("2");
        lblScore.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        getContentPane().add(lblScore);
        lblScore.setBounds(170, 40, 100, 40);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Developed by: Pang Colej Lang");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(620, 460, 170, 16);

        jLabel2.setFont(Fonts.getPixelFont(15f));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Score");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 0, 80, 40);

        jLabel5.setFont(Fonts.getPixelFont(8f));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("click to view leaderbords");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 80, 160, 16);

        lblTimer.setFont(Fonts.getPixelFont(32f));
        lblTimer.setForeground(new java.awt.Color(255, 255, 255));
        lblTimer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTimer.setText("0.0");
        lblTimer.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblTimer.setAlignmentY(0.0F);
        lblTimer.setIconTextGap(0);
        lblTimer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(lblTimer);
        lblTimer.setBounds(560, 30, 120, 40);

        lblSettings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSettings.setIcon(setButtonIcon("/img/settings.png", 45,45));
        lblSettings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSettingsMouseClicked(evt);
            }
        });
        getContentPane().add(lblSettings);
        lblSettings.setBounds(720, 22, 120, 60);

        lblBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg.jpg"))); // NOI18N
        lblBg.setText("jLabel1");
        getContentPane().add(lblBg);
        lblBg.setBounds(0, 0, 854, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents
           
    private void setHearts() {             
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
        {
            playSound(fileOK);
            addScore();
        }
        else
        {
            playSound(fileBad);
            removeHeart();
        }
        
        checkWinner();          
    }
    
    public void removeHeart(){
        panelLives.remove(lives.get(0));
        panelLives.add(new JLabel());
        lives.remove(0);
            
        if(lives.isEmpty())
        {
            formatDialog();
            stopTimer();
            checkHighScore();
            //checkLeaderboard();
            showGameOver();
            panelLives.removeAll();
            setHearts();
            displayHighScore();
            badShrooms = DEFAULT_BADSHROOM;
        }
    }
    
    private void checkWinner(){
        final int EASY_LEVEL = 0;
        final int MAX_LEVEL = 2;
        final int ADDITIONAL_POINTS = 2;
        
        var currentScore = getScore();
        var currentLevel = getCurrentLevel();
        
        if(currentScore == goalScores[currentLevel])
        {
            if(currentScore == goalScores[EASY_LEVEL])
                setScore(currentScore + ADDITIONAL_POINTS);
            
            lblScore.setText(getScore() + "");

            if (currentLevel == MAX_LEVEL)
            {
                checkHighScore();
                playSound(fileWin);
                displayWinner();
                displayHighScore();
                badShrooms = DEFAULT_BADSHROOM;
                return;
            }
            
            formatDialog();
            goToNextLevel();
            resetButtons();
            badShrooms += 2;
            assignPos(badShrooms);
            print2d();
        }
    }
    
    private void resetButtons(){
        displayQuestionMarkButtons();
        resetGrid();
    }
            
    private int getCurrentLevel() {
        switch(lblLevel.getText()) 
        {
            case "Easy": return 0;
            case "Medium": return 1;
            case "Hard": return 2;
        }
        return 0;
    }
    
    private void addScore(){
        switch(getCurrentLevel())
        {
            case 0:
                setScore(getScore() + 2);
                break;
            case 1: 
                setScore(getScore() + 5);
                break;
            case 2:
                setScore(getScore() + 10);
        }
        
        lblScore.setText(getScore() +"");
    }
    
    private void goToNextLevel() {
        final int NEXT_LEVEL = getCurrentLevel() + 1;
        lblLevel.setText(difficulty[NEXT_LEVEL]);
    }
    
    public void assignPos(int badShroomNum) {
        final int NUM_ROW_COL = 4;
        
        for(int i = 0; i < badShroomNum; i++) {
            int x = (int) Math.floor(Math.random() * NUM_ROW_COL);
            int y = (int) Math.floor(Math.random() * NUM_ROW_COL);
            
            if(grid[x][y] == BAD_SHROOM)
                while(grid[x][y] == BAD_SHROOM)
                {
                    x = (int) Math.floor(Math.random() * NUM_ROW_COL);
                    y = (int) Math.floor(Math.random() * NUM_ROW_COL);
                }
            
            grid[x][y] = BAD_SHROOM;
        }
    }
    
    private void displayWinner() {
        stopTimer();
        JOptionPane.showMessageDialog(null, "You saved Princess Peach <3", "Winner!", JOptionPane.INFORMATION_MESSAGE, winIcon);
        askPlayAgain();
    }
    
    private void askPlayAgain() {
        var icon = mario;
        var message = "Do you want to play again?";
        var title = "Winner!";
        var optionType = JOptionPane.YES_NO_OPTION;
        var messageType = JOptionPane.INFORMATION_MESSAGE;
        
        var option = JOptionPane.showConfirmDialog(null, message, title, optionType, messageType, icon);
        
        if(option == 0)
            resetValues();
        else
            System.exit(0);
    }
    
    private void displayQuestionMarkButtons() {
        for(Component comp : panelButtons.getComponents())
        {
            var btn = (JButton) comp;
            btn.setDisabledIcon(questionMark);
            btn.setEnabled(true);
        }
    }
    
    private void displayHighScore(){
        try
        {            
            highScore = (HighScoreClassic) highScore.readHighScore(highScore.FILE_NAME).readObject();
            var hsScore = highScore.getScore();
           
            btnHighScore.setText(hsScore + "");
        }
        catch(Exception ex)
        {
            highScore = null;
        }
    }
    
    private void readLeaderboards(){
        try
        {
            leaderboard = (LeaderboardsClassic) leaderboard
                    .readHighScore(leaderboard.FILE_NAME)
                    .readObject();
        }
        catch(Exception ex){

        }  
    }
    
    private void checkHighScore(){
        var time = Double.parseDouble(lblTimer.getText());
        var score = getScore();
        
        if(highScore == null)
            highScore = new HighScoreClassic();
        else if(score < highScore.getScore()) 
            return;
        else if(score == highScore.getScore() && time > highScore.getTime())
            return;
        
        saveHighScore(score, time);
        saveLeaderboards();
    }
    
    private void checkHighScore(HighScoreClassic hs, int index) {
        var time = Double.parseDouble(lblTimer.getText());
        var score = getScore();
        
        if(highScore == null)
            highScore = new HighScoreClassic();
        else if(score < hs.getScore()) 
            return;
        else if(score == hs.getScore() && time > hs.getTime())
            return;
        
        saveHighScore(score, time);
        saveLeaderboards(index);
    }
    
    private void checkLeaderboard() {     
        var time = Double.parseDouble(lblTimer.getText());
        var score = getScore();
        
        if(leaderboard.getLeaderboards().size() <= 3)
            for(int i = 0; i < 3; i++)
            {
                var hs = leaderboard.getLeaderboards().get(i);
                var h = (HighScoreClassic) hs;
                checkHighScore(h, i);
            }
        else
        {
            var h1 = (HighScoreClassic) leaderboard.getLeaderboards().get(0);
            var h2 = (HighScoreClassic) leaderboard.getLeaderboards().get(1);
            var h3 = (HighScoreClassic) leaderboard.getLeaderboards().get(2);
            if(score < h1.getScore() && score > h2.getScore()){
                saveHighScore(score, time);
                checkHighScore(this.highScore, 1);
            }
            else if(score < h2.getScore() && score > h3.getScore())
            {
                saveHighScore(score, time);
                checkHighScore(this.highScore, 2);
            }
            
        }
    }
    
    private void saveHighScore(int score, double time){
        JOptionPane.showMessageDialog(null, "You beat the highscore!", "You Are The #1!", JOptionPane.INFORMATION_MESSAGE, mario);
        
        highScore.setName(name);
        highScore.setScore(score);
        highScore.setTime(time);
        highScore.setLivesLeft(lives.size());
        
        highScore.saveHighScore(this.highScore, highScore.FILE_NAME);
    }
    
    private void saveLeaderboards(){
        leaderboard.addToLeaderboards(this.highScore);
        leaderboard.saveLeaderboards(leaderboard, leaderboard.FILE_NAME);
    }
    
    private void saveLeaderboards(int index){
        leaderboard.addToLeaderboards(this.highScore, index);
        leaderboard.saveLeaderboards(leaderboard, leaderboard.FILE_NAME);
    }
    
    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        components = new Components(panelButtons, lblScore, btnStart, lblTimer, btnHighScore, grid, lblLevel, lives);
        passComponents(components);
        
        startGame();
        assignPos();
        print2d();
        playSound(fileStart);
        startTimer(lblTimer);
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnHighScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHighScoreActionPerformed
        readLeaderboards();
        new LeaderboardsClassicUI(leaderboard).setVisible(true);
    }//GEN-LAST:event_btnHighScoreActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        clicked(0, 0, btn1);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        clicked(0, 1, btn2);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        clicked(0, 2, btn3);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        clicked(0, 3, btn4);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        clicked(1, 0, btn5);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        clicked(1, 1, btn6);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        clicked(1, 2, btn7);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        clicked(1, 3, btn8);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        clicked(2, 0, btn9);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        clicked(2, 1, btn10);
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        clicked(2, 2, btn11);
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        clicked(2, 3, btn12);
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        clicked(3, 0, btn13);
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn14ActionPerformed
        clicked(3, 1, btn14);
    }//GEN-LAST:event_btn14ActionPerformed

    private void btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15ActionPerformed
        clicked(3, 2, btn15);
    }//GEN-LAST:event_btn15ActionPerformed

    private void btn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn16ActionPerformed
        clicked(3, 3, btn16);
    }//GEN-LAST:event_btn16ActionPerformed

    private void lblSettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSettingsMouseClicked
        openSettings(name);
    }//GEN-LAST:event_lblSettingsMouseClicked

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
    private javax.swing.JButton btnHighScore;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblBg;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblScore;
    private javax.swing.JLabel lblSettings;
    private javax.swing.JLabel lblTimer;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JPanel panelLives;
    // End of variables declaration//GEN-END:variables
}
