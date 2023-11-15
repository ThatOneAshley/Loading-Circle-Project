/**
 * Project 5 Dynamic Window Frame class
 *
 * @author (Ashley Briggs)
 * @version (12/14/22)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CanvasFrame_Dynamic 
{
    private JFrame         frame;    // the window
    private CanvasPanel canvas;   // the canvas we'll be drawing on
    
    /**
     * Creates a new CanvasFrame object.
     */
    public CanvasFrame_Dynamic()
    {
        frame = new JFrame("Canvas Frame"); //make the JFrame 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        canvas = new CanvasPanel();
        canvas.setPreferredSize(new Dimension(2 * canvas.X_CORNER + 
        canvas.CANVAS_WIDTH, 2 * canvas.Y_CORNER + canvas.CANVAS_HEIGHT));
        frame.getContentPane().add(canvas); //put the canvas in the frame
        frame.pack();                       //make everything the preferred size
        frame.setVisible(true);             //show the frame
    }
}
