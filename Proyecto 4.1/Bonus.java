import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bonus here.
 * 
 * @author Sandra García 
 * @author Cecilia Vazquez
 * @version Mayo 2016
 */
public class Bonus extends Actor
{ 
    public int nivel;
   
    
    /**
     * Act - do whatever the Bonus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

        
    public void act1() 
    {      
      move(-( Greenfoot.getRandomNumber(11)));  
      
      verificaPiso();
     
        
       
 
    }  
    
      public void verificaPiso()
    {
        int iY;
        Nivel1 mundo = (Nivel1)getWorld();
        nivel = mundo.getNivel();
        
        if(getX()<3)
        {
          iY=Greenfoot.getRandomNumber(getY());
          if(iY<100)
          {
          
          setLocation(750,iY+111);
         }
        }
    }
    
   
 }   

