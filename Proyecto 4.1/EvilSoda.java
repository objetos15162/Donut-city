import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EvilSoda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EvilSoda extends Actor
{
   public  int posx ,posy;
   
     private GreenfootImage image1;
    private GreenfootImage image2;
    
    public EvilSoda ()
    {
        try{
            image1= new GreenfootImage("refri0.png");
            image2 = new GreenfootImage("refri1.png");
          
            setImage(image2); 
         } 
         catch(Exception e)
         {
              System.out.println("No pudo cargar la imagen");
         } 
    }  
    /**
     * Act - do whatever the EvilSoda wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
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
    public void posx()
    {
         posx=getX();
        }
        
   public void  posy()
    {
         posy=getY();
    }
        
}
    
  