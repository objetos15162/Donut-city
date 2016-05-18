import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Botón que inidica la siguiente ventana
 * 
 * @author Sandra García y Cecilia Vazquez
 * @version Versión 2.0 / Abril 2016
 */
public class ButtonNext extends  Button
{
     private Menu m; //Mundo actual
      private GreenfootImage imageMouse; //Imagen que se pone cuando pone mouse
    private GreenfootImage imagenSinMouse; //Imagen normal
    /**
     * Constructor de la clase ButtonNext
     */
    public ButtonNext ()
    {
       super(); 
       try 
        {
            imageMouse = new GreenfootImage ("siguiente2.png");
            imagenSinMouse= new GreenfootImage ("siguiente.png");
            setImage(imagenSinMouse);
        }
        catch(Exception e)
        {
            System.out.println("Error al cargar la imagen  del boton next");
        }
    }
    
    /**
     * El método act() 
     * Al hacer clic al objeto, se cambia al mundo "Ayuda2"
     */
    public void act() 
    {
        mouseSobreBoton();
        
        if(Greenfoot.mouseClicked(this))
        {
            Help2 newWorld = new Help2();
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
