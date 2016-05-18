import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase ButtonHelp, butón que indica ayuda previa a inicial el juego
 * 
 * @author Sandra García y Cecilia Vazquez
 * @version Versión 2.0 / Abril 2016
 */
public class ButtonHelp extends  Button
{
     private Menu m; //Mundo actual
      private GreenfootImage imageMouse; //Imagen que se pone cuando pone mouse
    private GreenfootImage imagenSinMouse; //Imagen normal
     
    /**
     * Constructor ButtonHelp
    */
    public ButtonHelp()
    {
        super();
         try 
        {
            imageMouse = new GreenfootImage ("ayuda2.png");
            imagenSinMouse= new GreenfootImage ("felp.png");
            setImage(imagenSinMouse);
        }
        catch(Exception e)
        {
            System.out.println("Error al cargar la imagen  del boton ayuda");
        }
    }
    
    /**
     * Act - Al hacer clic en el objeto se muestra ayuda para entender el juego
     */
    public void act() 
    {
        mouseSobreBoton();
       if(Greenfoot.mouseClicked(this))
        {
            Help newWorld = new Help();
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
