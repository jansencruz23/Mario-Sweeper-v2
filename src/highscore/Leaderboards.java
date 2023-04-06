package highscore;

import contracts.IHighScore;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Leaderboards implements Serializable {
    final String FILE_NAME = "leaderboards.bin";
    ArrayList<HighScoreClassic> leaderboards = new ArrayList<HighScoreClassic>();
    
    public ArrayList<HighScoreClassic> getLeaderboards() {
        return leaderboards;
    }
    
    public void addToLeaderboards(HighScoreClassic hs) {
        leaderboards.add(0, hs);
    }
    
    public void saveLeaderboards(Leaderboards leaderboards) {
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
