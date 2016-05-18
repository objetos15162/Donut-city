import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonExit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonExit extends  Button
{
     private Menu m; //Mundo actual
      private GreenfootImage imageMouse; //Imagen que se pone cuando pone mouse
    private GreenfootImage imagenSinMouse; //Imagen normal
     
     public  ButtonExit()
     {
         super();
          try 
        {
            imageMouse = new GreenfootImage ("salir2.png");
            imagenSinMouse= new GreenfootImage ("salir.png");
            setImage(imagenSinMouse);
        }
        catch(Exception e)
        {
            System.out.println("Error al cargar la imagen  del boton salir");
        }
        }
        
        
    /**
     * Act - do whatever the ButtonExit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        mouseSobreBoton();
         if(Greenfoot.mouseClicked(this))
        {
                     Greenfoot.stop();
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
