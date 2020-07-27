package sound;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;

/**
 *
 * @author stefa
 */
public class Sound {
    public Sound(String soundFile) {
        try {
            fileName = soundFile;
            File file = new File(source + fileName);
            clip = AudioSystem.getClip();
            // getAudioInputStream() also accepts a File or InputStream
            ais = AudioSystem.getAudioInputStream(file);
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            System.out.println("failed to retreive sound: " + source + fileName);
        }
    }
    
    public void play() {
        try {
            clip.open(ais);
        } catch (IOException | LineUnavailableException e) {
            System.out.println("failed to play sound: " + source + fileName);
        }
    }
    
    Clip clip;
    AudioInputStream ais;
    String source = "C:/Users/stefa/Documents/Drumhelper/sounds/";
    public String fileName;
}
