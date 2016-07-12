import greenfoot.*;
import java.util.ArrayList;
/**
 * Write a description of class Dunia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */



public class Dunia extends World
{
    GreenfootSound sound = new GreenfootSound ("backsound.mp3");
    /**
     * Constructor for objects of class Dunia.
     * 
     */
    private final int NYAWA_MAKS = 3;
    private static ArrayList nyawaBar = new ArrayList();


    public Dunia()
    {    
       // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       super(1150, 600, 1); 
       addObject(new Korek(), 575, 570);
       addObject(new Larva(), 575, 510);

        Score score = new Score();
        addObject(score, 70, 30);
        score.setLocation(70, 30);

        Sosis sosis = new Sosis();
        addObject(sosis, 575, 50);
        sosis.setLocation(575, 50);

        Sosis sosis2 = new Sosis();
        addObject(sosis2, 500, 80);
        sosis2.setLocation(500, 80);

        Sosis sosis3 = new Sosis();
        addObject(sosis3, 575, 80);
        sosis3.setLocation(575, 80);

        Sosis sosis4 = new Sosis();
        addObject(sosis4, 650, 80);
        sosis4.setLocation(650, 80);

        Sosis sosis5 = new Sosis();
        addObject(sosis5, 425, 110);
        sosis5.setLocation(425, 110);

        Sosis sosis6 = new Sosis();
        addObject(sosis6, 500, 110);
        sosis6.setLocation(500, 110);

        Sosis sosis7 = new Sosis();
        addObject(sosis7, 575, 110);
        sosis7.setLocation(575, 110);

        Sosis sosis8 = new Sosis();
        addObject(sosis8, 650, 110);
        sosis8.setLocation(650, 110);

        Sosis sosis9 = new Sosis();
        addObject(sosis9, 725, 110);
        sosis9.setLocation(725, 110);

        Sosis sosis10 = new Sosis();
        addObject(sosis10, 350, 140);
        sosis10.setLocation(350, 140);

        Sosis sosis11 = new Sosis();
        addObject(sosis11, 425, 140);
        sosis11.setLocation(425, 140);

        Sosis sosis12 = new Sosis();
        addObject(sosis12, 500, 140);
        sosis12.setLocation(500, 140);

        Sosis sosis13 = new Sosis();
        addObject(sosis13, 575, 140);
        sosis13.setLocation(575, 140);

        Sosis sosis14 = new Sosis();
        addObject(sosis14, 650, 140);
        sosis14.setLocation(650, 140);

        Sosis sosis15 = new Sosis();
        addObject(sosis15, 725, 140);
        sosis15.setLocation(725, 140);

        Sosis sosis16 = new Sosis();
        addObject(sosis16, 800, 140);
        sosis16.setLocation(800, 140);

        Sosis sosis17 = new Sosis();
        addObject(sosis17, 275, 170);
        sosis17.setLocation(275, 170);

        Sosis sosis18 = new Sosis();
        addObject(sosis18, 350, 170);
        sosis18.setLocation(350, 170);

        Sosis sosis19 = new Sosis();
        addObject(sosis19, 425, 170);
        sosis19.setLocation(425, 170);

        Sosis sosis20 = new Sosis();
        addObject(sosis20, 500, 170);
        sosis20.setLocation(500, 170);

        Sosis sosis21 = new Sosis();
        addObject(sosis21, 575, 170);
        sosis21.setLocation(575, 170);

        Sosis sosis22 = new Sosis();
        addObject(sosis22, 650, 170);
        sosis22.setLocation(650, 170);

        Sosis sosis23 = new Sosis();
        addObject(sosis23, 725, 170);
        sosis23.setLocation(725, 170);

        Sosis sosis24 = new Sosis();
        addObject(sosis24, 800, 170);
        sosis24.setLocation(800, 170);

        Sosis sosis25 = new Sosis();
        addObject(sosis25, 875, 170);
        sosis25.setLocation(875, 170);        

        Sosis sosis26 = new Sosis();
        addObject(sosis26, 950, 200);
        sosis26.setLocation(950, 200);

        Sosis sosis27 = new Sosis();
        addObject(sosis27, 275, 200);
        sosis27.setLocation(275, 200);

        Sosis sosis28 = new Sosis();
        addObject(sosis28, 350, 200);
        sosis28.setLocation(350, 200);

        Sosis sosis29 = new Sosis();
        addObject(sosis29, 425, 200);
        sosis29.setLocation(425, 200);

        Sosis sosis30 = new Sosis();
        addObject(sosis30, 500, 200);
        sosis30.setLocation(500, 200);

        Sosis sosis31 = new Sosis();
        addObject(sosis31, 575, 200);
        sosis31.setLocation(575, 200);

        Sosis sosis32 = new Sosis();
        addObject(sosis32, 650, 200);
        sosis32.setLocation(650, 200);

        Sosis sosis33 = new Sosis();
        addObject(sosis33, 725, 200);
        sosis33.setLocation(725, 200);

        Sosis sosis34 = new Sosis();
        addObject(sosis34, 800, 200);
        sosis34.setLocation(800, 200);

        Sosis sosis35 = new Sosis();
        addObject(sosis35, 875, 200);
        sosis35.setLocation(875, 200); 

        Sosis sosis36 = new Sosis();
        addObject(sosis36, 950, 200);
        sosis36.setLocation(950, 200); 

        Sosis sosis37 = new Sosis();
        addObject(sosis37, 200, 200);
        sosis37.setLocation(200, 200);

        Sosis sosis38 = new Sosis();
        addObject(sosis38, 125, 230);
        sosis38.setLocation(125, 230);

        Sosis sosis39 = new Sosis();
        addObject(sosis39, 200, 230);
        sosis39.setLocation(200, 230);

        Sosis sosis40 = new Sosis();
        addObject(sosis40, 275, 230);
        sosis40.setLocation(275, 230);

        Sosis sosis41 = new Sosis();
        addObject(sosis41, 350, 230);
        sosis41.setLocation(350, 230);

        Sosis sosis42 = new Sosis();
        addObject(sosis42, 425, 230);
        sosis42.setLocation(425, 230);

        Sosis sosis43 = new Sosis();
        addObject(sosis43, 500, 230);
        sosis43.setLocation(500, 230);

        Sosis sosis44 = new Sosis();
        addObject(sosis44, 575, 230);
        sosis44.setLocation(575, 230);

        Sosis sosis45 = new Sosis();
        addObject(sosis45, 650, 230);
        sosis45.setLocation(650, 230);

        Sosis sosis46 = new Sosis();
        addObject(sosis46, 725, 230);
        sosis46.setLocation(725, 230);

        Sosis sosis47 = new Sosis();
        addObject(sosis47, 800, 230);
        sosis47.setLocation(800, 230);

        Sosis sosis48 = new Sosis();
        addObject(sosis48, 875, 230);
        sosis48.setLocation(875, 230); 

        Sosis sosis49 = new Sosis();
        addObject(sosis49, 950, 230);
        sosis49.setLocation(950, 230); 

        Sosis sosis50 = new Sosis();
        addObject(sosis50, 1025, 230);
        sosis50.setLocation(1025, 230); 

        prepare();
    }

    
    
     private void prepareNyawaBar(int offsetX, int offsetY) {
        int spasiAntarNyawa = 5;
        
        for (int i = 0; i < NYAWA_MAKS; i++) {
            Nyawa nyawa = new Nyawa();
            nyawa.setLokasiX(
                offsetX+((nyawa.getImage().getWidth()+spasiAntarNyawa)*i)
            );
            nyawa.setLokasiY(offsetY);
            addObject(nyawa, nyawa.getLokasiX(), nyawa.getLokasiY());
            
            nyawaBar.add(nyawa);
        }
    }
    
     public static ArrayList getNyawaBar() {
        return nyawaBar;
    }
    
   
    
    public void started()
    {
        sound.playLoop();
        removeObjects(getObjects(start.class));
        
    }
    
    public void stopped()
    {
        sound.pause();
    }
    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        //started();
        prepareNyawaBar(40, 70);
        start start = new start();
        addObject(new start(), 579, 251); 
    }
}
