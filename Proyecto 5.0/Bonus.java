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
        puntos=0;
       
        
    }
    
    /**
     * Act - do whatever the Bonus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */   
    public void act1() 
    {      
     
       if(isTouching(Jugador.class))
        {
           // isTouchingObject(numBonus);
          //  remove();
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
    
 
   /**  getPuntos
      @return regresa los puntos
      */  
  public int getPuntos()
  {
      return puntos;
  }
    
 }   

