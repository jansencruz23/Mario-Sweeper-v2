package highscore.serializables;

import contracts.IHighScore;
import java.io.Serializable;

public class HighScoreSpeedRun extends BaseHighScore {
    public final String FILE_NAME = "highscoreSpeedRun.bin";
    
    private String name;
    private int score;
    private double time;
    private int level;
    //private ArrayList<HighScoreSpeedRun> leaderboards = new ArrayList<HighScoreSpeedRun>();
    
    public String getName(){
        return name;
    }
    
    public int getScore(){
        return score;
    }
    
    public double getTime(){
        return time;
    }
    
    public int getLevel(){
        return level;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setScore(int score){
        this.score = score;
    }
    
    public void setTime(double time){
        this.time = time;
    }
    
    public void setLevel(int level){
        this.level = level;
    }
        
}