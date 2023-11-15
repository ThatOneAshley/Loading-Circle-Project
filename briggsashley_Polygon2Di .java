import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Write a description of class Polygon2Di here.
 *
 * @author (Ashley Briggs)
 * @version (12-8-2022)
 */
public class Polygon2Di extends Shape2Di
{
    int[] txCoords = null;
    int[] tyCoords = null;
    int[] xCoords = null;
    int[] yCoords = null;

    Polygon2Di(int colorIndex, int xPosition, int yPosition, int[] xCoords, int[] yCoords)
    {
        super(colorIndex, xPosition, yPosition);

        this.xCoords = new int[xCoords.length];  

        this.yCoords = new int[yCoords.length];

        this.txCoords = new int[xCoords.length];

        this.tyCoords = new int[yCoords.length]; 

        for (int i = 0; i < xCoords.length; i++)
        {
            this.xCoords[i]  = xCoords[i];
            this.txCoords[i] = xCoords[i] + xPosition;
        }

        for (int i = 0; i < yCoords.length; i++)
        {
            this.yCoords[i]  = yCoords[i];
            this.tyCoords[i] = yCoords[i] + yPosition;
        }

    }

    public void Animate(){}

    private void Transform()
    {
        double degs = super.GetZRotate();
        double rads = Math.toRadians(degs);
        double Sx = super.GetsX();
        double Sy   = super.GetsY();
        for (int i = 0; i < xCoords.length; i++)
        {     
            int x = (int)((Sx * this.xCoords[i]) + 0.5);  
            int y = (int)((Sy * this.yCoords[i]) + 0.5);
            this.txCoords[i] = ((int)((x * Math.cos(rads) - y * Math.sin(rads)) + 0.5)) + (int)super.GetsX();
            this.tyCoords[i] = ((int)((x * Math.sin(rads) + y * Math.cos(rads)) + 0.5)) + (int)super.GetsY();
        }
    }

    @Override
    public void Draw(Graphics g)
    {
        Transform();
        //
        if (super.GetFill())
        {
            g.setColor(super.GetFillColor());
            g.fillPolygon(this.txCoords, this.tyCoords, this.xCoords.length);
        }
        
        if (super.GetOutline())
        {
            g.setColor(super.GetOutlineColor());
            g.drawPolygon(this.txCoords, this.tyCoords, this.xCoords.length);
        } 
    }

}
