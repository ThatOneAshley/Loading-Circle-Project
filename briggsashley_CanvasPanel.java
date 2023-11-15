
/**
 * Write a description of class CanvasPanel here.
 *
 * @author (Ashley Briggs)
 * @version (12-8-2022)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
public class CanvasPanel extends JPanel
{
    public final static int X_CORNER = 25;
    public final static int Y_CORNER = 25;
    public final static int CANVAS_WIDTH = 600;
    public final static int CANVAS_HEIGHT = 600;
    private ArrayList<Shape2Di> shapes; // list of all the shapes
    private int frameNumber;            // For animation, increases by 1 in each frame.
    private float pixelSize;            // The size of a pixel in drawing coordinates.
    
    public CanvasPanel()
    {
        shapes = new ArrayList<Shape2Di>();
        
        int[] xCoords = {100, 50, -50, -100, -100, -50, 50, 100};
        int[] yCoords = {50, 100, 100, 50, -50, -100, -100, -50};

        
        shapes.add(new Rectangle2Di( 9, 25, 575, 600, 50));   // Dark Grey rectangle, shape 1
        
        shapes.add(new Circle2Di(0, 305, 405, 40));    //Biggest Circle  1  Done
        shapes.add(new Circle2Di(11, 355, 385, 37));   //2   Done
        shapes.add(new Circle2Di(10, 380, 345, 35));   //3   Done
        shapes.add(new Circle2Di(9, 377, 300, 32));    //4   Done
        shapes.add(new Circle2Di(8, 345, 260, 30));    //5   Done  
        shapes.add(new Circle2Di(7, 300, 245, 27));    //6   Done
        shapes.add(new Circle2Di(6, 254, 268, 24));    //7   Done
        shapes.add(new Circle2Di(5, 230, 305, 21));    //8   Done
        shapes.add(new Circle2Di(4, 222, 345, 18));    //9   Done
        shapes.add(new Circle2Di(3, 230, 385, 15));    //10  Done
        shapes.add(new Circle2Di(2, 254, 405, 12));    //11  Done
        shapes.add(new Circle2Di(1, 280, 420, 9));     //Smallest Cicle 12  Done
        
        
        new Timer(30,new ActionListener() 
        {
                public void actionPerformed(ActionEvent evt) {
                    frameNumber++;
                    repaint();
                }
        }).start();
    }
    
    public static void Loop(double degs, double radius, int xPos, int yPos, int []pnts)

    {
        double rads = Math.toRadians(degs);

        double x = (Math.cos(rads) * radius) + xPos;

        double y = (Math.sin(rads) * radius) + yPos;
       
        pnts[0] = (int)x;

        pnts[1] = (int)y;
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setColor(Color.BLACK);
        g.fillRect(0,0,CANVAS_WIDTH + 2 * X_CORNER, CANVAS_HEIGHT + 2 * Y_CORNER); //draw the black border
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(X_CORNER, Y_CORNER, CANVAS_WIDTH, CANVAS_HEIGHT); //make the canvas white
        // Render all the shapes in the shapes list
        for (int i = 0; i < shapes.size(); i++)
        {
            int speedControl = 4;    // larger the number, the slower the spin!!

            shapes.get(0).Draw(g);

            shapes.get((frameNumber/speedControl % 11) + 1).Draw(g);
            

        }


        
    }
    
    public static int GetCanvasWidth()
    {
        return CANVAS_WIDTH;
    }
    public static int GetCanvasHeight()
    {
        return CANVAS_HEIGHT;
    }
    public static int GetCanvasXBorder()
    {
        return X_CORNER;
    }
    public static int GetCanvasYBorder()
    {
        return Y_CORNER;
    }
}
