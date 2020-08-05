import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class b_baby here.
 * It is a class added by the player which can move up with up arrow key and down with down arrow key, located at the right side of the barrier.
 * @author (Samir Lama) 
 * @version (May 2020)
 */
public class b_baby extends Actor
{
    /**
     * Act - do whatever the b_baby wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("up")){
        setLocation(getX(), getY()-5); // up
        }
        if(Greenfoot.isKeyDown("down")){
        setLocation(getX(), getY()+5); // down
        }
    }    
}
