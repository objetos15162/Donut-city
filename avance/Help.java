import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase incluye la historia del juego 'Donut City'
 * 
 * @author Sandra García y Cecilia Vazquez
 * @version Versión 2.0 / Abril 2016
 */
public class Help extends World
{

   private GreenfootImage help1;
   private GreenfootImage help2;
   
    /**
     * Constructor de Ayuda.
     * 
     */
    public Help()
    {    
       
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        
       
    }
      /**
       * El metodo de act cambia el fondo de la clase help cada cierto tiempo y regresa al menu
       */
   public void act() 
    {
        setBackground("Ayuda_Image.png");
        Greenfoot.delay(55);
       
        setBackground("Ayuda_2_image.png");
        Greenfoot.delay(111);
        
         
        Greenfoot.setWorld(new Menu());
    }
     
    }    
    
        
    
    
    

