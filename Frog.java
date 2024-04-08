import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Frog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frog extends Actor
{
    /**
     * Act - do whatever the Frog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    


    public void act() 
    {
        getImage().scale(100, 100);
        boolean key=Greenfoot.isKeyDown("right");
        if (key==true)
        { 
          setLocation(getX()+4,getY());
        }
        
        key=Greenfoot.isKeyDown("left");
        if (key==true)
        { 
          setLocation(getX()-4,getY());
        }
        
        key=Greenfoot.isKeyDown("up");
        if (key==true)
        { 
          setLocation(getX(), getY()-4);
        }
        
        key=Greenfoot.isKeyDown("down");
        if (key==true)
        { 
          setLocation(getX(),getY()+4);
        }
    }
}
