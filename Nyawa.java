import greenfoot.*;
public class Nyawa extends Actor
{
    private int lokasiX;
    private int lokasiY;
    
    public Nyawa()
    {
        getImage().scale(35, 45);
    }
    
    public void act() 
    {
        // Add your action code here.
    }
    
    public void setLokasiX(int lokasiX) {
        this.lokasiX = lokasiX;
    }
    
    public int getLokasiX() {
        return lokasiX;
    }
    
    public void setLokasiY(int lokasiY) {
        this.lokasiY = lokasiY;
    }
    
    public int getLokasiY() {
        return lokasiY;
    }
}