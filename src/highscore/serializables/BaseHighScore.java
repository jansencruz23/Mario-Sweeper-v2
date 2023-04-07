package highscore.serializables;

import contracts.IHighScore;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class BaseHighScore implements IHighScore, Serializable{
    @Override
    public void saveHighScore(IHighScore highScore, String fileName) {
        try{
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(fileName));
            output.writeObject(highScore);
            output.close();
            System.out.println("File saved");
        }
        catch(Exception ex){
            System.out.println("File cannot be saved");
        }
    }

    @Override
    public ObjectInputStream readHighScore(String fileName) throws IOException {
        ObjectInputStream input = new ObjectInputStream(new FileInputStream(fileName));
        return input;
    }
}
