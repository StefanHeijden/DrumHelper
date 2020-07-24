package GUI;

import java.awt.Color;
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
        
        // TODO Add GRID
        
        // Add text for notes
    }
    
    final int PWIDTH;
    final int PHEIGHT;
}
