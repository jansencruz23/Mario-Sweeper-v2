package highscore.serializables;

import mariosweeper.Level;

public class HighScoreClassic extends BaseHighScore {
    public final String FILE_NAME = "highscoreClassic.bin";
    
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
    
}
