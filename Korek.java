import greenfoot.*;

/**
 * Write a description of class Korek here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Korek extends Actor
{
    /**
     * Act - do whatever the Korek wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Korek()
        {
            getImage().scale(150, 45);
        }
        
    public void act() 
    {
        // Add your action code here.
         if (Greenfoot.isKeyDown("left")) {
            move(-5);
        }
        if (Greenfoot.isKeyDown("right")) {
            move(5);
        }
    }    
}
