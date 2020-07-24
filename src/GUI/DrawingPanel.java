package GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Stack;
import javax.swing.JPanel;



/**
 *
 * @author stefa
 */
public class DrawingPanel extends JPanel{
    public DrawingPanel (int aheight, int awidth) {
        // Create panel
        super();
        // Initilize height / width
        PHEIGHT = aheight - 500;
        PWIDTH = awidth;
    }
    
    public void run() {
        setSize(PWIDTH, PHEIGHT);
        //setOpaque(false);
        setBackground(Color.BLACK); 
        drawableObject = new Stack();
    }
    
    public void play(boolean play) {
        playing = play;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Set time as integer
        int roundedTime = (int) time;
        
        // Paint Grid
        
        // Add text for notes
        
        
        if (playing) {
            System.out.println("hello!");
            // Paint Sound Buttons
            for (SoundButton b : drawableObject) {
                System.out.println("o");
                g = b.drawImage(g, roundedTime);
            }
        }
    }
    
    public void next() {
        // Play sound of notes
        drawableObject.push(new SoundButton(Color.WHITE, 30, (int) time));
        // Increase time
        repaint();
        time = time + incrementTimer;
    }
    
    public void setSpeed (double speed) {
        incrementTimer = speed;
    }
    
    final int PWIDTH;
    final int PHEIGHT;
    
    // Variables for current time and how fast it increases per clock tick
    boolean playing = false;
    double time;
    double incrementTimer = 1.0;
    
    // Current stack of object to be drawn
    Stack<SoundButton> drawableObject;
    
    // Keep track of current index of the array to avoid unneeded checking
    int currentIndex = 0;
}
