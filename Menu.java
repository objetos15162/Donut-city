import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Menú principal, indica todas las opciones del juego  
 * @author Sandra García y Cecilia Vazquez
 * @version Versión 2.0 / Abril 2016

 */
public class Menu extends World
{

    /**
     * Constructor de clase Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        prepare();
    }

    /**
     * Prepara el escenario del juego, en este caso los botones (las opciones) del 
     * juego, las cuales son: "Play", "Help", "Records", "Exit"
     */
    //Se prepara el escenario 

    private void prepare()
    {
        //boton jugar
        ButtonPlay buttonplay = new ButtonPlay();
        addObject(buttonplay, 72, 159);
      
       //boton ayuda
        ButtonHelp buttonhelp = new ButtonHelp();
        addObject(buttonhelp, 167, 230);
        buttonhelp.setLocation(163, 225);
        //boton records
        ButtonRecords buttonrecords = new ButtonRecords();
        addObject(buttonrecords, 252, 295);
        buttonrecords.setLocation(245, 287);
        //boton salida
        ButtonExit buttonexit = new ButtonExit();
        addObject(buttonexit, 334, 358);
        buttonexit.setLocation(328, 350);
    }
}
