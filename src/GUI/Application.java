package GUI;

/**
 *
 * @author stefa
 */
public class Application {
    Frame frame;
    DrawingPanel drawingPanel;
    
    public Application () {
        frame = new Frame();
        frame.run();
        drawingPanel = new DrawingPanel();
        frame.add(drawingPanel);
    }
    
    public void run() {
    }
}
