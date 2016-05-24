import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase representa los 'bonus' o plus que adquiere el jugador a lo largo del 
 *juego
 * 
 * @author Sandra García 
 * @author Cecilia Vazquez
 * @version Mayo 2016
 */
public class Bonus extends Actor
{ 
    public int nivel;
    public int puntos;
  
    public Bonus()
    {
        super();
      
       
        
    }
    
    /**
     * Act - do whatever the Bonus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */   
    public void act1() 
    {      
      Nivel1 mundo = (Nivel1)getWorld();
        nivel = mundo.getNivel();
       if(isTouching(Jugador.class))
        {
            
              
            mundo.removeObject(this);
        }
        
        else
        {
             move(-( Greenfoot.getRandomNumber(11)));  
             verificaPiso();
        }
    }  
    
    /**
       *verifica la posición del objeto
       */
      public void verificaPiso()
    {
        int iY;
       
        Nivel1 mundo1 = (Nivel1)getWorld();
        nivel = mundo1.getNivel();
        if(getX()<3)
        {
            mundo1.removeObject(this);
         
          
         
        }
        
    }
    
 
 
    
 }   

