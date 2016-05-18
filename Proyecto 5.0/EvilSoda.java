import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EvilSoda here.
 *
 * @author Sandra García 
 * @author Cecilia Vazquez
 * @version Mayo 2016
 */
public class EvilSoda extends Actor
{
   public  int posx ,posy;
   
     private GreenfootImage image1;
    private GreenfootImage image2;
    
    /**
       *Constructor de la clase EvilSoda
       */
    public EvilSoda ()
    {
        try{
            image1= new GreenfootImage("refri0.png");
            image2 = new GreenfootImage("refri1.png");
          
            setImage(image2); 
         } 
         catch(Exception e)
         {
              System.out.println("No pudo cargar la imagen de soda");
         } 
    }  
    
    /**
     * Act - Comportamiento de la EvilSoda
     */
    public void act() 
    {
        if(getImage()==image1){
             setImage(image2);
            }
            else{ 
                setImage(image1);
            }
            
            move(-2);
          if(getX()<3)
          {
              move(590);
        }
       
    }
 
        
}
    
  