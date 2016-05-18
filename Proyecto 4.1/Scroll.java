import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *Esta clase se encarga del movimiento independiente de los objetos
 * 
 * @author Sandra García / Cecilia Vazquez
 * @version 2.0 // 26 Abril 2016
 */
public abstract class Scroll extends Actor
{
    public int nivel;
    
    /**
     * Constructor Scroll, recibe el número de nivel 
    */
    public Scroll (int nivel)
    {
        super();
    }
    
    public abstract void movObje();
   
    /**
    */
    public void verifica()
    {  
        Nivel1 mundo = (Nivel1)getWorld();
        nivel = mundo.getNivel();   
        if(getX()<1)
        {
          move(750);
        }
    }

    
}

