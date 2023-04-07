package leaderboard.ui;

import highscore.serializables.BaseHighScore;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import leaderboards.serializables.BaseLeaderboardsSerializable;

public class BaseLeaderboards extends JFrame {
    final int MAX_LEADERBOARD_SIZE = 3;
    final int EMPTY = 0;
    
    private ArrayList<BaseHighScore> leaderboardsList;
    BaseLeaderboardsSerializable leaderboards;
    
    public BaseLeaderboards (BaseLeaderboardsSerializable leaderboards) {
        this.leaderboards = leaderboards;
        this.leaderboardsList = (ArrayList<BaseHighScore>) (ArrayList<?>) leaderboards.getLeaderboards();
    }
        
    public void displayColumn(String name, JPanel panelHighScore) {
        if(leaderboardsList.size() == EMPTY) 
            return;
        else 
        {
            int index = 0;           
            while(index < MAX_LEADERBOARD_SIZE) 
            {
                for(Component component : panelHighScore.getComponents())
                {
                    var lbl = (JLabel) component;
                    if(lbl.getName() != null && lbl.getName().equals(name))
                    {
                        setLabelText(lbl, name, leaderboardsList.get(index));
                        index++;
                    }
                    
                    if(index == leaderboardsList.size()) 
                        return;
                }
            }
        }
    }
    
    public void setLabelText(JLabel lbl, String name, BaseHighScore leaderboard){
        switch(name){
            case "score": 
                lbl.setText(leaderboard.getScore() + "");
                break;
            case "name":
                lbl.setText(leaderboard.getName());
                break;
            case "lives":
                lbl.setText(leaderboard.getLivesLeft() + "");
                break;  
            case "time":
                lbl.setText(leaderboard.getTime() + "");
                break;
        }
    }
}
