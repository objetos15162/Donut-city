import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase es un enemigo del jugador que lanza latas de refrescos
 * 
 * @author Sandra García 
 * @author Cecilia Vazquez
 * @version Mayo 2016
 */
public class Soda extends EvilSoda
{
    
    int nivel;  
    int speed;
    
    /**
     * Constructor de la clase Soda
       */
    public Soda(int s)
    {
        super();
        speed = s;
    }
    
    /**
     * Act - Comportamiento de Soda
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
