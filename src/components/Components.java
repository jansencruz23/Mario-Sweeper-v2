package components;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Components {
    
    JTextField txtScore, txtHScore;
    JPanel panel;
    JButton btnStart;
    JLabel lblTimer, lblLevel;
    int[][] grid;
    ArrayList<JLabel> lives;
    
    public Components (JPanel panel, JTextField txtScore, JButton btnStart, JLabel lblTimer, 
            JTextField txtHScore, int[][] grid, JLabel lblLevel, ArrayList<JLabel> lives) {
    this.txtScore = txtScore;
    this.panel = panel;
    this.btnStart = btnStart;
    this.lblTimer = lblTimer;
    this.txtHScore = txtHScore;
    this.grid = grid;
    this.lblLevel = lblLevel;
    this.lives = lives;
    }
    
    public Components (JPanel panel, JTextField txtScore, JButton btnStart, JLabel lblTimer, 
            JTextField txtHScore, int[][] grid) {
    this.txtScore = txtScore;
    this.panel = panel;
    this.btnStart = btnStart;
    this.lblTimer = lblTimer;
    this.txtHScore = txtHScore;
    this.grid = grid;
    this.lblLevel = lblLevel;
    }

    public JTextField getTxtScore() {
        return txtScore;
    }

    public JTextField getTxtHScore() {
        return txtHScore;
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
