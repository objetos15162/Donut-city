import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Soda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Soda extends EvilSoda
{
    
    int nivel;  
     int speed;
      public Soda(int s)
    {
      speed = s;
    }
    /**
     * Act - do whatever the Soda wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //
       setLocation(getX(),getY()+speed);
        Nivel1 mundo = (Nivel1)getWorld();
        nivel = mundo.getNivel();  
         if(isTouching(Jugador.class))
       {
          mundo.removeObject(this);
       }
      
           
        
        
            
    }    
}
