package highscore.leaderboards;

import contracts.IHighScore;
import contracts.ILeaderboards;
import highscore.serializables.HighScoreClassic;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Leaderboards implements Serializable, ILeaderboards {
    final String FILE_NAME = "leaderboards.bin";
    ArrayList<HighScoreClassic> leaderboards = new ArrayList<HighScoreClassic>();
    
    public ArrayList<HighScoreClassic> getLeaderboards() {
        return leaderboards;
    }
    
    public void addToLeaderboards(IHighScore iHighScore) {
        var highScore = (HighScoreClassic) iHighScore;
        leaderboards.add(0, highScore);
    }
    
    public void saveLeaderboards(ILeaderboards leaderboards) {
        try{
            
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
            output.writeObject(leaderboards);
            output.close();
            System.out.println("File saved");
        }
        catch(Exception ex){
            System.out.println("File cannot be saved");
        }
    }
    
    public ObjectInputStream readHighScore() throws IOException {
        ObjectInputStream input = new ObjectInputStream(new FileInputStream(FILE_NAME));
        return input;
    }
}
