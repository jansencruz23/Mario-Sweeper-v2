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
        else if(leaderboardsList.size() >= MAX_LEADERBOARD_SIZE){
            int index = 0;            
                while(index < MAX_LEADERBOARD_SIZE) {
                    for(Component component : panelHighScore.getComponents()){
                    var lbl = (JLabel) component;
                    if(lbl.getName() != null)
                        if(lbl.getName().equals(name)){
                            switch(name){
                                case "score": 
                                    lbl.setText(leaderboardsList.get(index).getScore() + "");
                                    lbl.setName("done");
                                    break;
                                case "name":
                                    lbl.setText(leaderboardsList.get(index).getName());
                                    lbl.setName("done");
                                    break;
                                case "lives":
                                    lbl.setText(leaderboardsList.get(index).getLivesLeft() + "");
                                    lbl.setName("done");
                                    break;  
                                case "time":
                                    lbl.setText(leaderboardsList.get(index).getTime() + "");
                                    lbl.setName("done");
                                    break;
                            }
                            index++;
                        }
                }
            }
        }
    }
    
    
}
