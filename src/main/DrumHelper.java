package main;

import GUI.*;
/**
 *
 * @author stefa
 */
public class DrumHelper {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initialize the 
        frame = new MainFrame();
        frame.run();
        drawingPanel = new DrawingPanel(frame.getHeight(), frame.getWidth());
        drawingPanel.run();
        frame.add(drawingPanel);
        
        // Start song
        drawingPanel.play(true);
        System.out.println("next!");
        drawingPanel.next();
    }
    
    static MainFrame frame;
    static DrawingPanel drawingPanel;
}
