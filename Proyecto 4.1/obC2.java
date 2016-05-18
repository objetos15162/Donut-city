import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class obC2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class obC2 extends Scroll
{
    private GreenfootImage nube;
     private int nivel;
  
    /**
     * El constructor recibe como parametro el número de nivel
    */
    public obC2(int n)
    {
        super(n);
         try{
            nube= new GreenfootImage("nube2.png"); 
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
            setImage("nube2.png"); 
             
        }

    }
    
    public  void movObje()
    {
        move(-( Greenfoot.getRandomNumber(3)));
        super.verifica();
    }
}
