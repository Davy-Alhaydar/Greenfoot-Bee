import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Bee bee = new Bee();
        addObject(bee,361,201);
        Bee bee2 = new Bee();
        addObject(bee2,382,433);
        Bee bee3 = new Bee();
        addObject(bee3,685,296);
        Frog frog = new Frog();
        addObject(frog,149,472);
        frog.setLocation(475,299);
    }
}
