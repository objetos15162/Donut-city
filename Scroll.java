import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *Esta clase se encarga del movimiento independiente de los objetos
 * 
 * @author Sandra García / Cecilia Vazquez
 * @version 2.0 // 26 Abril 2016
 */
public abstract class Scroll extends Actor
{
    private int nivel;
    private int imageNum;
    /**
     * Constructor Scroll, recibe el número de nivel 
     * @param nivel numero de nivel del juego (de uno a tres)
     * @param imageNum número de objeto a pintar
    */
    public Scroll (int nivel, int imageNum)
    {
        super();
    }
    
    /**
     * Clase abstracta que controla el movimiento de los objetos del escenario
     */
    public abstract void movObje();
   
    /**
     * Corrobora la posición en x 
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

