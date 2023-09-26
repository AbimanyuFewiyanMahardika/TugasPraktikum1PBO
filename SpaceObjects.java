import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpaceObjects here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpaceObjects extends Actor
{
    /**
     * Act - do whatever the SpaceObjects wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        World  w = getWorld();
        move(-5);
        if (isAtEdge())
        {
            //w.removeObject(this);
            setLocation(590,getY());
        }
    }
}
