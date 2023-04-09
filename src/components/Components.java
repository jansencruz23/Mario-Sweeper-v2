package components;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Components {
    
    JPanel panel;
    JButton btnStart, btnHighScore;
    JLabel lblTimer, lblLevel, lblScore;
    int[][] grid;
    ArrayList<JLabel> lives;
    
    public Components (JPanel panel, JLabel lblScore, JButton btnStart, JLabel lblTimer, 
            JButton btnHighScore, int[][] grid, JLabel lblLevel, ArrayList<JLabel> lives) {
    this.lblScore = lblScore;
    this.panel = panel;
    this.btnStart = btnStart;
    this.lblTimer = lblTimer;
    this.btnHighScore = btnHighScore;
    this.grid = grid;
    this.lblLevel = lblLevel;
    this.lives = lives;
    }
    
    public Components (JPanel panel, JLabel lblScore, JButton btnStart, JLabel lblTimer, 
            JButton btnHighScore, int[][] grid) {
    this.lblScore = lblScore;
    this.panel = panel;
    this.btnStart = btnStart;
    this.lblTimer = lblTimer;
    this.btnHighScore = btnHighScore;
    this.grid = grid;
    }

    public JLabel getLblScore() {
        return lblScore;
    }

    public JButton getTxtHScore() {
        return btnHighScore;
    }

    public JPanel getPanel() {
        return panel;
    }

    public JButton getBtnStart() {
        return btnStart;
    }

    public JLabel getLblTimer() {
        return lblTimer;
    }

    public JLabel getLblLevel() {
        return lblLevel;
    }
    
    public int[][] getGrid(){
        return grid;
    }
    
    public ArrayList<JLabel> getLives(){
        return lives;
    }
}
