import greenfoot.*;
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class start extends Actor
{
    /**
     * Act - do whatever the start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
     public start()
    {
        GreenfootImage img = new GreenfootImage ("start.png");
        img.setColor(new Color(255, 255, 255));
        Font font = new Font("Calibri", Font.PLAIN, 28);
        img.setFont(font);
        img.drawString("Press Run to begin.", 180, 360);
        setImage(img);
    }
    
    
    

    public void act() 
    {
        // Add your action code here.
    }    
}
