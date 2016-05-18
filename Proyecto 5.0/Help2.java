import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Mundo correspondiente a la sección de ayuda del juego, incluye instrucciones del
 * movimiento del jugador
 * 
 * @author Sandra García y Cecilia Vazquez
 * @version Versión 2.0 / Abril 2016
 */
public class Help2 extends World
{

    /**
     * Constructor de Ayuda2()
     * Al presionar el botón de Regresar, se regresa a la sección de ayuda1
     * 
     */
    public Help2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        ButtonReturn buttonRegresar = new ButtonReturn();
        addObject(buttonRegresar, 65, 350);
      
    }
}
