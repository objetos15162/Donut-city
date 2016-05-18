import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class obS1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class obS1 extends Scroll
{
    private GreenfootImage nivel1;
    private GreenfootImage nivel2;
    private GreenfootImage nivel3;
    
   /**
     * El constructor recibe como parametro el número de nivel
    */
    public obS1(int nivel)
    {
        super(nivel);
    
    }   
    public void act() 
    {
        movObje();
       if(nivel==1)
        {
            setImage("flores1.png"); 
             
        }
    }
    public  void movObje()
    {
        move(-( Greenfoot.getRandomNumber(8)));
        super.verifica();
    }
}
