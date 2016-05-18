import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Botón usado en el menú para indicar que se desea regresar a este
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonReturn extends  Button
{
    private Menu m; //Mundo actual
    private GreenfootImage imageMouse; //Imagen que se pone cuando pone mouse
    private GreenfootImage imagenSinMouse; //Imagen normal
     
     public ButtonReturn()
     {
         super();
         try 
        {
            imageMouse = new GreenfootImage ("Regresar2.png");
            imagenSinMouse= new GreenfootImage ("Regresar.png");
            setImage(imagenSinMouse);
        }
        catch(Exception e)
        {
            System.out.println("Error al cargar la imagen  del boton return");
        }
        }
     
    /**
     * Act - do whatever the ButtonRegresar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        mouseSobreBoton();
         if(Greenfoot.mouseClicked(this))
        {
            Menu newWorld = new Menu();
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
