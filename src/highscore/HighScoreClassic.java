package highscore;

import contracts.IHighScore;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import mariosweeper.Level;

public class HighScoreClassic implements IHighScore, Serializable {
    private final String FILE_NAME = "highscoreClassic.bin";
    
    private String name;
    private int livesLeft;
    private int score;
    private double time;
    private Level level;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLivesLeft() {
        return livesLeft;
    }

    public void setLivesLeft(int livesLeft) {
        this.livesLeft = livesLeft;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
    
    @Override
    public void saveHighScore(IHighScore highScore) {
        try{
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
            output.writeObject(highScore);
            output.close();
            System.out.println("File saved");
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
