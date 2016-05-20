import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase Records, las cual muestra los mejores puntajes obtenidos en el juego
 * con base a el tiempo y puntos obtenidos
 * 
 * @author Sandra García y Cecilia Vazquez
 * @version Versión 2.0 / Abril 2016
 */
public class Records extends World
{

    /**
     * Constructor de Records.
     * Inicializa records.
     */
    public Records()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        ButtonReturn buttonReturn = new ButtonReturn();
        ScoreBoard score=new ScoreBoard(50,230);
        addObject(buttonReturn, 65, 350);
        addObject(score, 300, 196);
    }
}
