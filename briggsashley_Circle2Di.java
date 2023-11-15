import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Write a description of class Circle2Di here.
 *
 * @author (Ashley Briggs)
 * @version (12-8-2022)
 */
public class Circle2Di extends Shape2Di
{
    int diameter;

    Circle2Di(){
        super(0, 0, 0);
        this.diameter = 25 ;
        
    }

    Circle2Di(int colorIndex, int xPosition, int yPosition, int diameter)
    {
        super(colorIndex, xPosition, yPosition);

        this.diameter = diameter;

    }

    public void Animate(){}

    @Override
    public void Draw(Graphics g){
        //FillColor
        if(super.GetFill()){
            g.setColor(super.GetFillColor());
            g.fillOval(super.GetxPos(), super.GetyPos(), this.diameter, this.diameter);
        }
        //FillOutline
        if (super.GetOutline())
        {
            g.setColor(super.GetOutlineColor());
            g.drawOval(super.GetxPos(), super.GetyPos(), this.diameter, this.diameter);
        } 
    }

    public int GetDiameter(){
        return this.diameter;
    }
    
}
