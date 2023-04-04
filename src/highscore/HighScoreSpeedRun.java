package highscore;

import contracts.IHighScore;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class HighScoreSpeedRun implements IHighScore, Serializable  {
    private final String FILE_NAME = "highscoreSpeedRun.bin";
    
    private String name;
    private int score;
    private double time;
    private int level;
    private ArrayList<HighScoreSpeedRun> leaderboards = new ArrayList<HighScoreSpeedRun>();
    
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
    
    public ArrayList<HighScoreSpeedRun> getLeaderboards(){
        return leaderboards;
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
    
    public void addToLeaderboard(HighScoreSpeedRun highscore){
        leaderboards.add(highscore);
    }
    
    @Override
    public void saveHighScore(IHighScore highScore) {   
        try{
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
            output.writeObject(highScore);
            output.close();
            System.out.println("file saved");
        }
        catch(Exception ex){
            System.out.println("File cannot be saved");
        }
    }
    
    @Override
    public ObjectInputStream readHighScore() throws IOException {
        ObjectInputStream input = new ObjectInputStream(new FileInputStream(FILE_NAME));
        return input;
    }
}