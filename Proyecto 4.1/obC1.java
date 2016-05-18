import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase obC1 representa a los objetos de cielo que se mueven durante el juego
 * 
 * 
 * @author Sandra García / Cecilia Vazquez
 * @version 2.0 //  Abril 2016
 */
public class obC1 extends Scroll
{
    private GreenfootImage nube;
     private int nivel;
 
    
    /**
     * El constructor recibe como parametro el número de nivel
    */
    public obC1(int n)
    {
        super(n);
        
         try{
            nube= new GreenfootImage("nube1.png"); 
            setImage(nube); 
            
         } 
         catch(Exception e){
             System.out.println("Error al abrir nube");
         } 
    }
    
      public void act() 
    {
        movObje();
        if(nivel!=3)
        {
            setImage("nube1.png"); 
             
        }
       
       
        
    }
    
    public  void movObje()
    {
        move(-( Greenfoot.getRandomNumber(3)));
        super.verifica();
    }
}
