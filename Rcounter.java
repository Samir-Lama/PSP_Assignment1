import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rcounter here.
 * This class is for displaying the score counter on the right side and adds the score to the right when it touch the left side.
 *@author (Samir Lama) 
 * @version (May 2020)
 */
public class Rcounter extends Actor
{
    int r_score = 0;//Variable to store score of the right side
    /**
     * Act - do whatever the Rcounter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int r=189 ,g= 195,b =199;
        setImage(new GreenfootImage("Score : "+ r_score, 24, Color.BLACK, new Color(r,g,b,0)));
        if(r_score>3)
            {
                World world =getWorld();
                world.removeObjects(world.getObjects(null));
                world.setBackground("R-win.png");
                Greenfoot.stop();
            }
    } 
    //Function to add score of the right side
    public void r_adder(){
        r_score++;
    }
}
