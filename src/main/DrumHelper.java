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
        frame = new Frame();
        frame.run();
        drawingPanel = new DrawingPanel(frame.getHeight(), frame.getWidth());
        drawingPanel.run();
        frame.add(drawingPanel);
    }
    
    static Frame frame;
    static DrawingPanel drawingPanel;
}
