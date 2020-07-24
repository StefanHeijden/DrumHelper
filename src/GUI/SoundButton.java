package GUI;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * This button is displayed to indicate a certain note has to be played
 * The color and placement indicate what kind of note has to be played
 */
public class SoundButton {
    public SoundButton (Color col, int place, int startTime) {
        color = col;
        originalTime = startTime;
        y = place;
        // TODO create button with color col
    }
    
    public Graphics drawImage(Graphics g, int time) {
        g.setColor(color);

        g.fillOval(400 - (originalTime - time), y, SIZE, SIZE);
        
        return g;
    }
    
    int y;
    int x;
    final int SIZE = 20;
    Color color;
    int originalTime;
}
