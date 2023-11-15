
/**
 * Write a description of class CopyOfCanvasPanel here.
 *
 * @author (Ashley Briggs)
 * @version (12-8-2022)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
public class CopyOfCanvasPanel extends JPanel
{
    public final static int X_CORNER = 25;
    public final static int Y_CORNER = 25;
    public final static int CANVAS_WIDTH = 600;
    public final static int CANVAS_HEIGHT = 600;
    private ArrayList<Shape2Di> shapes; // list of all the shapes
    private int frameNumber;            // For animation, increases by 1 in each frame.
    private float pixelSize;            // The size of a pixel in drawing coordinates.
    
    public CopyOfCanvasPanel()
    {
        shapes = new ArrayList<Shape2Di>();
        
        int[] xCoords = {100, 50, -50, -100, -100, -50, 50, 100};
        int[] yCoords = {50, 100, 100, 50, -50, -100, -100, -50};

        
        shapes.add(new Rectangle2Di( 9, 25, 575, 600, 50));   // White rectangle, shape 1
        
        shapes.add(new Circle2Di(0, 305, 405, 40));    //1   Done
        shapes.add(new Circle2Di(11, 355, 385, 37));    //2   Done
        shapes.add(new Circle2Di(10, 380, 345, 35));    //3   Done
        shapes.add(new Circle2Di(9, 377, 300, 32));    //4   Done
        shapes.add(new Circle2Di(8, 345, 260, 30));    //5   Done  
        shapes.add(new Circle2Di(7, 300, 245, 27));    //6   Done
        shapes.add(new Circle2Di(6, 254, 268, 24));    //7   Done
        shapes.add(new Circle2Di(5, 230, 305, 21));    //8   Done
        shapes.add(new Circle2Di(4, 222, 345, 18));    //9   Done
        shapes.add(new Circle2Di(3, 230, 385, 15));    //10  Done
        shapes.add(new Circle2Di(2, 254, 405, 12));    //11  Done
        shapes.add(new Circle2Di(1, 280, 420, 9));     //12   Done
        
        int[] ptsArray = new int[2];
        

        //Loop((frameNumber * 5) % 360, 30, 305, 455, ptsArray);
        //Loop((frameNumber * 5) % 360, 30, 355, 385, ptsArray);
        //Loop((frameNumber * 5) % 360, 30, 380, 345, ptsArray);
        //Loop((frameNumber * 5) % 360, 30, 377, 300, ptsArray);
        //Loop((frameNumber * 5) % 360, 30, 345, 260, ptsArray);
        //Loop((frameNumber * 5) % 360, 30, 300, 245, ptsArray);
        //Loop((frameNumber * 5) % 360, 30, 254, 268, ptsArray);
        //Loop((frameNumber * 5) % 360, 30, 230, 305, ptsArray);
        //Loop((frameNumber * 5) % 360, 30, 222, 345, ptsArray);
        //Loop((frameNumber * 5) % 360, 30, 230, 385, ptsArray);
        //Loop((frameNumber * 5) % 360, 30, 254, 405, ptsArray);
        //Loop((frameNumber * 5) % 360, 30, 280, 420, ptsArray);
        
        
        //shapes.get(1).SetPos(ptsArray[0], ptsArray[1]);
        //shapes.get(2).SetPos(ptsArray[0], ptsArray[1]);
        //shapes.get(3).SetPos(ptsArray[0], ptsArray[1]);
        //shapes.get(4).SetPos(ptsArray[0], ptsArray[1]);
        //shapes.get(5).SetPos(ptsArray[0], ptsArray[1]);
        //shapes.get(6).SetPos(ptsArray[0], ptsArray[1]);
        //shapes.get(7).SetPos(ptsArray[0], ptsArray[1]);
        //shapes.get(8).SetPos(ptsArray[0], ptsArray[1]);
        //shapes.get(9).SetPos(ptsArray[0], ptsArray[1]);
        //shapes.get(10).SetPos(ptsArray[0], ptsArray[1]);
        //shapes.get(11).SetPos(ptsArray[0], ptsArray[1]);
        //shapes.get(12).SetPos(ptsArray[0], ptsArray[1]);
        
        
        //    shapes index    vx vy xp yp
        //shapes.get(3).SetSpeed(8,4);  shapes.get(3).SetPos(100, 100);
        //shapes.get(4).SetSpeed(2,4);  shapes.get(4).SetPos(100, 200);
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
            shapes.get(i).Draw(g);
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
