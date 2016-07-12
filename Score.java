import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int point;
    
    public Score() {
        tambah();
    }
    
    public void nilai() {
        point++;
        tambah();
    }
    
    private void tambah() {
        GreenfootImage Nilai = new GreenfootImage("Score : " + point, 32, Color.WHITE, Color.BLACK);
        setImage(Nilai);
    }   
}
