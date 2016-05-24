import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase ButtonPlay, es un botón para indicar cuando debe inicial el juego
 * 
 *@author Sandra García y Cecilia Vazquez
 *@version Versión 2.0 / Abril 2016
 */
public class ButtonPlay extends Button
{
    private GreenfootImage imageMouse; //Imagen que se pone cuando pone mouse
    private GreenfootImage imagenSinMouse; //Imagen normal
    private Menu m; //Mundo actual
    //
    /**
     * Constructor ButtonPlay 
     */
    public ButtonPlay()
    {
        super();
        try 
        {
            imageMouse = new GreenfootImage ("Control2.png");
            imagenSinMouse= new GreenfootImage ("contro.png");
            setImage(imagenSinMouse);
        }
        catch(Exception e)
        {
            System.out.println("Error al cargar la imagen  del boton play");
        }
        
    }
    
    /**
     * Act - Al hacer clic en el objeto se inicia el juego en el nivel1
     */
    public void act() 
    {
        mouseSobreBoton();
        if(Greenfoot.mouseClicked(this))
        {
            Nivel1 newWorld = new Nivel1();
            Greenfoot.setWorld(newWorld);
        }
 
    }    
    
    public void mouseSobreBoton()
    {
          if(Greenfoot.mouseMoved(this))
        {
            setImage(imageMouse);
        }
        else if(Greenfoot.mouseMoved(m))
        {
            setImage(imagenSinMouse);
        }
        
    }
    
}    

