import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase incluye la historia del juego 'Donut City'
 * 
 * @author Sandra García y Cecilia Vazquez
 * @version Versión 2.0 / Abril 2016
 */
public class Help extends World
{

    /**
     * Constructor de Ayuda.
     * Se especifica la posición de los botones "Regresar" y "Siguiente"
     * Al presionar 'Siguiente' se manda al mundo 'Ayuda2'
     * Al presionar 'Regresar' se manda al mundo 'Menu'
     * 
     */
    public Help()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        ButtonReturn buttonRegresar = new ButtonReturn();
        addObject(buttonRegresar, 65, 300);
       
        
       ButtonNext siguiente = new ButtonNext();
        addObject(siguiente, 500, 300);
      
        
    }
}
