package GUI;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * This button is displayed to indicate a certain note has to be played
 * The color and placement indicate what kind of note has to be played
 */
public class SoundButton {
    public SoundButton (Color col, int place, int startTime, int endPlacement) {
        color = col;
        originalTime = startTime;
        y = place;
        x = endPlacement;
    }
    
    public Graphics drawImage(Graphics g, int time) {
        g.setColor(color);
        g.fillOval(x - (originalTime - time) - SIZE * 2, y, SIZE, SIZE);
        return g;
    }
    
    public boolean drawable(int time, int width) {
        return x - (originalTime - time) - SIZE * 2 > 0 && 
                x - (originalTime - time) - SIZE * 2 < width;
    }
    
    int y;
    int x;
    final int SIZE = 20;
    Color color;
    int originalTime;
}
