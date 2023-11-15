import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Write a description of class Shape2Di here.
 *
 * @author (Ashley Briggs)
 * @version (12-8-2022)
 */
public abstract class Shape2Di
{
    double sX,sY,rotAngleZ;
    boolean fill;
    Color fillColor;
    int fillColorIndex;
    boolean outline;
    Color outlineColor;
    int outilneColorIndex,xPos,xVel,yPos,yVel;
        
    //Color Website: https://html-color.codes/grey
    public static final Color[] COLORS = {
            //         R     G    B
            new Color(  0, 0, 0),         // Black    0
            new Color(  239, 239, 239),   // Onyx  1
            new Color(  226, 226, 226) ,  // Davy's Grey 2
            new Color(  201, 201, 201),   // Dim Grey  3
            new Color(  175,175,175),     // Trolley Grey   4
            new Color(  152,152,152),     // Spanish Grey  5
            new Color( 127, 127, 127),    // 6
            new Color( 107, 107, 107),    // 7
            new Color(  89, 89,  89),
            new Color( 72, 72,  72),
            new Color( 49, 49,  49),
            new Color( 33, 33, 33),
            new Color( 38, 255, 255),
            new Color( 38, 125, 255),
            new Color( 82,  38, 255),
            new Color(212,  38, 255),
            new Color(255,  38, 168),
        };

    Shape2Di(){
        this.xPos = 0;
        this.yPos = 0;
        this.sX = 1.0;
        this.sY = 1.0;
        this.rotAngleZ = 0.0;
        this.xVel = 0;
        this.yVel = 0;

        this.fillColorIndex = fillColorIndex;
        this.fillColor= COLORS[fillColorIndex];

        this.fill = true;
        this.outline = false;
    }

    Shape2Di(int fillColorIndex, int xPosition, int yPosition){
        this.xPos =xPosition;
        this.yPos =yPosition;
        this.sX = 1.0;
        this.sY = 1.0;
        this.rotAngleZ = 0.0;
        this.xVel = 0;
        this.yVel = 0;

        this.fillColorIndex = fillColorIndex;
        this.fillColor= COLORS[fillColorIndex];

        this.fill = true;
        this.outline = false;

    }

    public void Animate(){

        xPos += xVel;
        yPos += yVel;

    }

    public abstract void Draw(Graphics g);

    public boolean GetFill(){
        return this.fill;

    }

    public Color GetFillColor(){
        return this.fillColor;

    }

    public int GetFillColorIndex(){
        return this.fillColorIndex;

    }

    public boolean GetOutline(){
        return this.outline;

    }

    public Color GetOutlineColor(){
        return this.outlineColor;
    }

    public int GetxPos(){    
        return this.xPos;
    }

    public int GetyPos(){    
        return this.yPos;
    }

    public int GetxVel(){    
        return this.xVel;
    }

    public int GetyVel(){    
        return this.yVel;
    }

    public void Move(double xDelts, double yDelts){}

    public void SetFill(boolean setting){
        this.fill = setting;
    }

    public void SetFillColor(int fillColorIndex){
        this.fillColorIndex = fillColorIndex;
    }

    public void SetOutline(boolean setting){
        this.outline = setting; 
    }

    public void SetOutlineColor(int outlineColorIndex){
        this.outilneColorIndex= outlineColorIndex ; 
    }

    public void SetPos(int x,int y){
        this.xPos = x;
        this.yPos = y;

    }

    public void SetSpeed( int xV, int yV){
        this.xVel = xV;
        this.yVel = yV;

    }

    public double GetsX(){
        return this.sX;
    }

    public double GetsY(){
        return this.sY;
    }

    public double SetrotAngleZ(double AngleZ){
        return this.rotAngleZ = AngleZ;
    }

    public double GetZRotate(){
        return this.rotAngleZ;
    }

}

