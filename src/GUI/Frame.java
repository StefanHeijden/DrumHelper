package GUI;

import javax.swing.JFrame;
import javax.swing.JMenuBar;

/**
 *
 * @author stefa
 */
public class Frame extends JFrame{
    public Frame () {
        // Create frame
        super("Drumhelper");
    }
    
    public void run(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(FRAMEWIDTH, FRAMEHEIGHT);
        setLayout(null);

        // Create menu
        menuBar = new JMenuBar();
        
        // Add all buttons and menus
        setJMenuBar(menuBar);
        setVisible(true);
    }
    
    JMenuBar menuBar;
    
    final int FRAMEWIDTH = 1600;
    final int FRAMEHEIGHT = 1000;
}
