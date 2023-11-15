import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Write a description of class Rectangle2Di here.
 *
 * @author (Ashley Briggs)
 * @version (12-8-2022)
 */
public class Rectangle2Di extends Shape2Di
{
    int height;
    int width;

    Rectangle2Di(){
        super(3, 50, 50);

        this.width = 2;

        this.height = 4;
        
    }

    Rectangle2Di(int colorIndex, int xPosition, int yPosition, int width, int length)
    {
        super(colorIndex, xPosition, yPosition);

        this.width = width;

        this.height = length;
    }

    public void Animate()
    {}

    public int GetHeight(){
        return height;
    }
    
    public int GetWidth(){
        return width;
    }

    @Override
    public void Draw(Graphics g){
        //FillColor
        if(super.GetFill()){
            g.setColor(super.GetFillColor());
            g.fillRect(super.GetxPos(), super.GetyPos(), this.width, this.height);
        }
        //FillOutline
        if (super.GetOutline())
        {
            g.setColor(super.GetOutlineColor());
            g.drawRect(super.GetxPos(), super.GetyPos(), this.width, this.height);
        }     
    }
}

