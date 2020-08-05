import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class w_baby here.
 * It is a class added by the player which can move up with 'w' and down with 's' key, located at the barrier's right side.
 * @author (Samir Lama) 
 * @version (May 2020)
 */
public class w_baby extends Actor
{
    /**
     * Act - do whatever the w_baby wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("w")){
        setLocation(getX(), getY()-5); // up
        }
        if(Greenfoot.isKeyDown("s")){
        setLocation(getX(), getY()+5); // down
        }
    }    
}
