package components;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Components {
    
    JTextField txtScore;
    JPanel panel;
    JButton btnStart, btnHighScore;
    JLabel lblTimer, lblLevel;
    int[][] grid;
    ArrayList<JLabel> lives;
    
    public Components (JPanel panel, JTextField txtScore, JButton btnStart, JLabel lblTimer, 
            JButton btnHighScore, int[][] grid, JLabel lblLevel, ArrayList<JLabel> lives) {
    this.txtScore = txtScore;
    this.panel = panel;
    this.btnStart = btnStart;
    this.lblTimer = lblTimer;
    this.btnHighScore = btnHighScore;
    this.grid = grid;
    this.lblLevel = lblLevel;
    this.lives = lives;
    }
    
    public Components (JPanel panel, JTextField txtScore, JButton btnStart, JLabel lblTimer, 
            JButton btnHighScore, int[][] grid) {
    this.txtScore = txtScore;
    this.panel = panel;
    this.btnStart = btnStart;
    this.lblTimer = lblTimer;
    this.btnHighScore = btnHighScore;
    this.grid = grid;
    this.lblLevel = lblLevel;
    }

    public JTextField getTxtScore() {
        return txtScore;
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
