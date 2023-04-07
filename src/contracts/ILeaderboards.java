package contracts;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public interface ILeaderboards<T extends IHighScore, K extends ILeaderboards> {
    
    ArrayList<T> getLeaderboards();
    
    void addToLeaderboards(T highscore);
    
    void saveLeaderboards(K leaderboards, String fileName);
    
    ObjectInputStream readHighScore(String fileName) throws IOException;
}
