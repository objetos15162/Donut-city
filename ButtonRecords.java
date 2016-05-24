import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonRecords here.
 * 
 * @author Sandra García y Cecilia Vazquez
 * @version Versión 2.0 / Abril 2016
 */
public class ButtonRecords extends  Button
{
     private Menu m; //Mundo actual
      private GreenfootImage imageMouse; //Imagen que se pone cuando pone mouse
    private GreenfootImage imagenSinMouse; //Imagen normal
    /**
     * Constructor ButtonRecords
    */
    public ButtonRecords()
    {
        super();
         try 
        {
            imageMouse = new GreenfootImage ("record2.png");
            imagenSinMouse= new GreenfootImage ("record.PNG");
            setImage(imagenSinMouse);
        }
        catch(Exception e)
        {
            System.out.println("Error al cargar la imagen  del boton records");
        }
    }
    
    /**
     * Act - Al hacer clic en el objeto se muestran los records del juego
     */
    public void act() 
    {
        mouseSobreBoton();
         if(Greenfoot.mouseClicked(this))
        {
            Records newWorld = new Records();
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
