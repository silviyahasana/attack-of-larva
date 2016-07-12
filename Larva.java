import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class Larva here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Larva extends Actor
{
    /**
     * Act - do whatever the Larva wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int kec = 2;

    private int points = 50;
    private Score score;
    private int nyawa=3;
    
    public Larva()
        {
            getImage().scale(65, 90);
            setRotation(Greenfoot.getRandomNumber(300)-150);
        }
        
    public Larva(Score TotalScore)
    {
        score = TotalScore;
    }
    
    public void act() 
    {
        //setLocation(getX(), getY() + 3);
        makan();
        move(kec);
        bounce();
    }    
    
   public void bounce()
    {

        if (getOneIntersectingObject(Korek.class) != null && getRotation() < 180) {
            setRotation(360 - getRotation());
            kec++;
            //Greenfoot.playSound("pop.wav");
            return;
        }
        if (getX() == 0 || getX() == getWorld().getWidth()-1) {
            setRotation(180 - getRotation());
        }

        if (getY() == 0) {
            setRotation(360 - getRotation());
        }
        if (getY() == getWorld().getHeight()-1) {
            nyawa--;
            setLocation(400,300);

          int indeksTerakhir  = Dunia.getNyawaBar().size()-1;
          Nyawa nyawaTerakhir =  (Nyawa) Dunia.getNyawaBar().get(indeksTerakhir);
          
          getWorld().removeObject(nyawaTerakhir);
          Dunia.getNyawaBar().remove(indeksTerakhir);
            if(indeksTerakhir==0)
            {
               Dunia dunia = (Dunia) getWorld(); 
               dunia.stopped();
               
               getWorld().addObject(new Kalah(),600,300);
               Greenfoot.playSound("gameover.mp3");
               Greenfoot.stop();
                
            }
        }
    }
    
    public void makan()
    {
        Actor sosis = getOneObjectAtOffset(0, 0, Sosis.class);
        if(sosis !=null )
        {
            Greenfoot.playSound("ang.mp3");
            getWorld().removeObject(sosis);
            points--;
            Score score = getScore();
            score.nilai();
            setRotation(180 - getRotation());
            if(points==0)
            {
               Dunia dunia = (Dunia) getWorld(); 
               dunia.stopped();
               getWorld().addObject(new Menang(),600,300);
               Greenfoot.playSound("win.mp3");
               Greenfoot.stop();

               
            }
        }
    }

    public Score getScore() {
        return (Score)getWorld().getObjects(Score.class).iterator().next();
    }
}
