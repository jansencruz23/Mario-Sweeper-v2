package mariosweeper;

import components.Components;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.basic.BasicButtonUI;

public class BaseGame extends JFrame {
    final int GOOD_SHROOM = 0;
    final int BAD_SHROOM = 1;
    
    ImageIcon questionMark = setButtonIcon("/img/qm.png");
    ImageIcon goodShroom = setButtonIcon("/img/good.png");
    ImageIcon badShroom = setButtonIcon("/img/bad.png");
    ImageIcon mario = setButtonIcon("/img/mario.png");
    ImageIcon gameOver = new ImageIcon(getClass().getResource("/img/gover.png"));
    
    private int[][] grid;
    private ArrayList<JLabel> lives;
    private boolean state = false;
    private double seconds, time;
    private int score = 2;
    
    Components components;
    
    public int getScore(){
        return score;
    }
    
    public void setScore(int score){
        this.score = score;
    }
    
    public void stopTimer(){
        state = false;    
    }
    
    public void passComponents(Components components) {
        this.components = components;
        this.grid = components.getGrid();
        this.lives = components.getLives();
    }
    
    public void startGame(){        
        for(Component btn: components.getPanel().getComponents())
            btn.setEnabled(true);  
        
        components.getBtnStart().setIcon(new ImageIcon(getClass().getResource("/img/mariorun.gif")));
        components.getBtnStart().setEnabled(false);
        colorButtons();
        //playSound(fileStart);
        
    }
    
    public void assignPos() {
        final int NUM_ROW_COL = 4;
        final int NUM_BAD_SHROOM = 3;
        
        for(int i = 0; i < NUM_BAD_SHROOM; i++) {
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
    
    public void print2d(){
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid.length; j++)
                System.out.print(String.format("%2d", grid[i][j]));
            System.out.println();
        }
    }
    
    public boolean isGoodShroom(int x, int y, JButton btn){      
        if(grid[x][y] == BAD_SHROOM)
        {
            btn.setEnabled(false);
            btn.setDisabledIcon(badShroom);
            colorDisabledButton(btn);
            //state = false;
            //showGameOver();
            return false;
        }

        btn.setEnabled(false);
        colorDisabledButton(btn);
        btn.setDisabledIcon(goodShroom);

        //playSound(fileOK);
        return true;
        
    }
    
    public void startTimer(JLabel txt){
        final int MAX_ITERATION = 1000;
        final int MAX_TIME = 300;
        final int SLEEP_INTERVAL = 90;
        final double TENTHS = 10.0;
        
        state = true;
      
        new Thread(() -> {
          for (int i = 0; i < MAX_ITERATION; i++) {
              if (!state)
                 break;

              try {
                  sleep(SLEEP_INTERVAL);
                  if (seconds <= MAX_TIME)
                      txt.setText(seconds++ / TENTHS + "");
                  else
                  {
                      showGameOver();
                      state = false;
                  }
              }
              catch(Exception ex){}

          }}).start();
    }
       
    public void showGameOver(){
        formatDialog();
        
        time = Double.parseDouble(components.getLblTimer().getText());
        
        state = false;
        //playSound(fileGO);
        //checkHighScore();
        
        int option = showGameOverDialog();
        if(option == 0)
            resetValues();
        else
            System.exit(0);
    }
    
    public void resetValues(){
        resetScore();
        resetSeconds();
        resetStartButton();
        resetLevelLabel();
        // resetHighScoreLabel();
        resetButtons();
        resetGrid();    
    }
    
    public ImageIcon setButtonIcon(String path){
        ImageIcon imageIcon = new ImageIcon(getClass().getResource(path));
        Image img = imageIcon.getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH);
        ImageIcon imgIcon = new ImageIcon(img);
        return imgIcon;
    }
    
    public ImageIcon setButtonIcon(String path, int width, int height){
        ImageIcon imageIcon = new ImageIcon(getClass().getResource(path));
        Image img = imageIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon imgIcon = new ImageIcon(img);
        return imgIcon;
    }
           
    public void colorDisabledButton(JButton btn){
        btn.setUI(new BasicButtonUI());
    }
    
    private void resetScore() {
        final int MINIMUM_SCORE = 2;
        
        score = MINIMUM_SCORE;
        components.getLblScore().setText(score + "");
    }
    
    private void resetSeconds() {
        final int MINIMUM_SECONDS = 0;
        
        seconds = MINIMUM_SECONDS;
        components.getLblTimer().setText(seconds + "");
    }
    
    private void resetStartButton() {
        components.getBtnStart().setIcon(mario);
        components.getBtnStart().setEnabled(true);
    }
    
    private void resetLevelLabel() {
        if(components.getLblLevel() != null)
            components.getLblLevel().setText("Easy");
    }
    
    private void resetHighScoreLabel() {
        //txtHScore.setText(String.format("%d - %s - %.1f", hs.getScore(), hs.getName(), hs.getTime()));
    }
    
    private void resetButtons() {
        for(Component comp : components.getPanel().getComponents()){
            var btn = (JButton) comp;
            
            //colorDisabledButton(btn, 30,30,30);
            btn.setEnabled(false);
            btn.setIcon(questionMark);
            btn.setDisabledIcon(null);
            btn.setBackground(new Color(221, 224, 229));
        }
    }
            
    private void colorButtons(){
        for(Component comp : components.getPanel().getComponents()){
            var btn = (JButton) comp;
            
            btn.setBackground(new Color(255,183,77));
        }
    }
    
    public void resetGrid() {
        final int DEFAULT_VALUE = 0;
        
        for(int i = 0; i < grid.length; i++)
            for(int j = 0; j < grid.length; j++)
                grid[i][j] = DEFAULT_VALUE;
    }
    
    public int showGameOverDialog(){
        ImageIcon icon = gameOver;
        String message = "Game over! Do you want to play again?";
        String title = "Defeat!";
        int optionType = JOptionPane.YES_NO_OPTION;
        int messageType = JOptionPane.ERROR_MESSAGE;
        
        return JOptionPane.showConfirmDialog(null, message, title, optionType, messageType, icon);
    }
    
    public void formatDialog(){
        Font font = new Font("Chiller",
                Font.BOLD,
                30);
        
        UIManager.put("OptionPane.messageFont", font);
    }
}
