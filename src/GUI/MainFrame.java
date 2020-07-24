package GUI;

import javax.swing.JFrame;
import javax.swing.JMenuBar;

/**
 *
 * @author stefa
 */
public class MainFrame extends JFrame{
    public MainFrame () {
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
        
        //TODO add button for generating new beat / song
        
        // TODO load beat / song
        
        // TODO save beat / song
        
        // TODO add button that mutes sound
        
        // TODO add play button
    }
    
    JMenuBar menuBar;
    
    final int FRAMEWIDTH = 1600;
    final int FRAMEHEIGHT = 1000;
}
