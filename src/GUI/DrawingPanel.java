package GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayDeque;
import javax.swing.JPanel;
import logic.ReadFile;



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
        drawableObject = new ArrayDeque(40);
        System.out.println("Read");
        currentSample = new ReadFile("example.txt");
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
            // Paint Sound Buttons
            for (SoundButton b : drawableObject) {
                g = b.drawImage(g, roundedTime);
            }
        }
    }
    
    // Determines the next state of the panel
    public void next() {
        int roundedTime = (int) time;
        
        // Check whether the current queue contains any SoundButton that cannot
        // be drawn anymore
        while(true) {
            SoundButton inspect = drawableObject.peek();
            if (inspect == null || inspect.drawable(roundedTime, PWIDTH)) {
                break;
            }
            drawableObject.remove();
        }
        
        // Add new SoundButtons
        while (allButtons != null && currentIndex < allButtons.length) {
            // Check whether the next button is drawable
            if (!allButtons[currentIndex].drawable(roundedTime, PWIDTH)) {
                break;
            }
            // if it is drawable add it to the queue
            drawableObject.add(allButtons[currentIndex]);
            currentIndex++;
        }
        
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
    ArrayDeque<SoundButton> drawableObject;
    
    // Keep track of current index of the array to avoid unneeded checking
    SoundButton[] allButtons;
    int currentIndex = 0;
    
    ReadFile currentSample;
}
