package contracts;
import java.io.IOException;
import java.io.ObjectInputStream;

public interface IHighScore {
    
    void saveHighScore(IHighScore highScore, String fileName);
    ObjectInputStream readHighScore(String fileName) throws IOException;
}
