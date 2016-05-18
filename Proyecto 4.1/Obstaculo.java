import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Obstaculo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obstaculo extends Actor
{
    public int nivel;
    /**
     * Act - do whatever the Obstaculo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act1() 
    {      
      move(-( Greenfoot.getRandomNumber(6)));  
      verificaPiso();
    }  
    
      public void verificaPiso()
    {
        Nivel1 mundo = (Nivel1)getWorld();
        nivel = mundo.getNivel();
        
        if(getX()<1)
        {

          setLocation(750,(Greenfoot.getRandomNumber(3)+1)*100);
        }
    }
}    


  