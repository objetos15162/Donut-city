import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class obS2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class obS2 extends Scroll
{
    private GreenfootImage nivel1;
    private GreenfootImage nivel2;
    private GreenfootImage nivel3;
     public int nivel;
    
    /**
     * El constructor recibe como parametro el número de nivel
    */
    public obS2(int n)
    {
        super(n);
          try{
            nivel1= new GreenfootImage("flores2.png"); 
            nivel2= new GreenfootImage("cactus2.png"); 
            nivel3= new GreenfootImage("piedra2.png"); 
            
            if(n==1)
            {
                setImage(nivel1);
                move(40);
            }
            
            
            if(n==2)
            {
                setImage(nivel2);
            }
            
            if(n==3)
            {
                setImage(nivel3);
            }

         } 
         catch(Exception e){
             System.out.println("Error al abrir obS1");
         } 
    } 
        public void act() 
    {
         movObje();
        if(nivel==1)
        {
            setImage("flores2.png"); 
             
        } 
    }
    
    public  void movObje()
    {
        move(-( Greenfoot.getRandomNumber(8)));
        super.verifica();
    }
}
