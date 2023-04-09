package fonts;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

public class Fonts {
    private static Font pixelFont;
        
    public static Font getPixelFont(float fontSize){
        try 
        {
            pixelFont = Font.createFont(Font.TRUETYPE_FONT, new File("PixelEmulator-xq08.ttf")).deriveFont(fontSize);
            GraphicsEnvironment graphicEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
            graphicEnvironment.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("PixelEmulator-xq08.ttf")));  
        }
        catch(IOException | FontFormatException ex){
            System.out.println(ex.getMessage());
        }
        
        return pixelFont;
    }
}
