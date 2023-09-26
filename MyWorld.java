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
        super(600, 400, 1); 
    }
    private void prepare()
    {
        rocket rocket = new rocket();
        addObject(rocket,52,187);
        SpaceObjects spaceobject = new SpaceObjects();
        addObject(spaceobject,564,73);
        SpaceObjects spaceobject2 = new SpaceObjects();
        addObject(spaceobject2,564,254);
        SpaceObjects spaceobject3 = new SpaceObjects();
        addObject(spaceobject3,506,350);
        SpaceObjects spaceobject4 = new SpaceObjects();
        addObject(spaceobject4,470,221);
        SpaceObjects spaceobject5 = new SpaceObjects();
        addObject(spaceobject5,435,62);
        SpaceObjects spaceobject6 = new SpaceObjects();
        addObject(spaceobject6,514,144);
        SpaceObjects spaceobject7 = new SpaceObjects();
        addObject(spaceobject7,422,320);
    }
}
