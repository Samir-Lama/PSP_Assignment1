import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lcounter here.
 * This class is for displaying the score counter on the left side and adds the score to the left when it touch the roght side.
 *@author (Samir Lama) 
 * @version (May 2020)
 */
public class Lcounter extends Actor
{
    int l_score = 0;//Variable to store score of the left side
    /**
     * Act - do whatever the Lcounter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int r=189 ,g= 195,b =199;
        setImage(new GreenfootImage("Score : "+ l_score, 24, Color.BLACK, new Color(r,g,b,0)));
        if(l_score>3){
            World world =getWorld();
            world.removeObjects(world.getObjects(null));
            world.setBackground("L-win.png");
            Greenfoot.stop();
        }
    }    
    //Function to add score of the left side
    public void l_adder(){
        l_score++;
    }
}
