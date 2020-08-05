import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Samir Lama) 
 * @version (May 2020)
 */
public class MyWorld extends World
{
    Lcounter lcounter = new Lcounter();
    Rcounter rcounter = new Rcounter();
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        //this chunck of code should not be changes and MUST be included
        //in your solution
        
        super(600, 400, 1);
        for (int loop=0; loop<20; loop=loop+1)
        {
            addObject(new barrier(), 300, 20*loop);
        }
        addObject(new baby1(), 150, 200);
        addObject(new baby2(), 450, 200);
        //End of code that must be included in your solution
        
        //Baby Addition in the world
        addObject(new w_baby(),35,195); 
        addObject(new b_baby(),565,195);
        
        //Adding Score Counter on left and right side
        addObject(lcounter, 65,20);
        addObject(rcounter, 540,20);
        
        //Ball Addition
        addObject(new ball1(), 200,200);
    }   
    public Lcounter getl_score(){
        return lcounter;
    }
    
    public Rcounter getr_score(){
        return rcounter;
    }
    
}
