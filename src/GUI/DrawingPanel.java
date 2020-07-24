package GUI;

import java.awt.Color;
import javax.swing.JPanel;



/**
 *
 * @author stefa
 */
public class DrawingPanel extends JPanel{
    final int PWIDTH;
    final int PHEIGHT;
    
    public DrawingPanel (int aheight, int awidth) {
        // Create panel
        super();
        // Initilize height / width
        PHEIGHT = aheight - 500;
        PWIDTH = awidth;
    }
    
    public void run() {
        setSize(PHEIGHT, PWIDTH);
        //setOpaque(false);
        setBackground(Color.BLACK); 
    }
}
