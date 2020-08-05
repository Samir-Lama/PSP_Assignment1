import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ball1 here.
 * ball1 is the central part of this project; it is the class that controls the project due to the work or game is only focused on the ball. 
 * It is the class that decides the winner and provide a score on the project.
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ball1 extends Actor
{
    int x = 3, y = 3;
    /**
     * Act - do whatever the ball1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        setLocation (getX()+x, getY()+y);
        if(getY()>390){
            y = -3;
        }
        if(getY() < 5){
            y = 3;
        }
        collison();
        score();
    } 
    //score function
    public void score(){ 
        //baby2 score
        
        if (getX()<3)
        {
            MyWorld myWorld = (MyWorld)getWorld();
            Rcounter rcounter = myWorld.getr_score();
            rcounter.r_adder();
            setLocation(415,200);
            turn(180);
        }
        
        //baby1 score
        
        if (getX()>590)
        {
            MyWorld myWorld = (MyWorld)getWorld();
            Lcounter lcounter = myWorld.getl_score();
            lcounter.l_adder();
            setLocation(200,200);
            turn(0);
        }
    }
    //collison function
    public void collison(){
        //Baby_1 Deflector
        Actor baby_1 = getOneIntersectingObject(baby1.class);
        if (baby_1!=null)
        {
            x = 5;
        }
        
        //Baby_2 Deflector
        Actor baby_2 = getOneIntersectingObject(baby2.class);
        if (baby_2!=null)
        {
           x = -5;
        }
        
        //W_baby Deflector
        Actor w_baby = getOneIntersectingObject(w_baby.class);
        if (w_baby!=null)
        {
            turn(Greenfoot.getRandomNumber(90));
            x = 3;
        }
        
        //B_baby Deflector
        Actor b_baby = getOneIntersectingObject(b_baby.class);
        if (b_baby!=null)
        {
            turn(Greenfoot.getRandomNumber(90));
            x = -3;
        }
    }
}
