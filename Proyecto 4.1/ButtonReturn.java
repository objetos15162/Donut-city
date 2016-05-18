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
     
     public ButtonReturn()
     {
         super();
      /*   try 
        {
            imageMouse = new GreenfootImage ("siguiente2.png");
            imagenSinMouse= new GreenfootImage ("siguiente.png");
            setImage(imagenSinMouse);
        }
        catch(Exception e)
        {
            System.out.println("Error al cargar la imagen  del boton play");
        }*/
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
    public void mouseSobreBoton(){}
    
}
