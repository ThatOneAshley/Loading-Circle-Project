
/**
 * Write a description of class CanvasFrame here.
 *
 * @author (Ashley Briggs)
 * @version (12-8-2022)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CanvasFrame_Static 
{
    private JFrame      frame;    // the window
    private CopyOfCanvasPanel canvas;   // the canvas we'll be drawing on
    
    /**
     * Creates a new CanvasFrame object.
     */
    public CanvasFrame_Static()
    {
        frame = new JFrame("Canvas Frame"); //make the JFrame 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        canvas = new CopyOfCanvasPanel();
        canvas.setPreferredSize(new Dimension(2 * canvas.X_CORNER + canvas.CANVAS_WIDTH, 2 * canvas.Y_CORNER + canvas.CANVAS_HEIGHT));
        frame.getContentPane().add(canvas); //put the canvas in the fram
        frame.pack();                       //make everything the preferred size
        frame.setVisible(true);             //show the frame
    }
}
