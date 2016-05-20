import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase obC1 representa a los objetos de cielo que se mueven durante el juego
 * 
 * 
 * @author Sandra García / Cecilia Vazquez
 * @version 2.0 //  Abril 2016
 */
public class CieloObj extends Scroll
{
    private GreenfootImage imageNube1;
    private GreenfootImage imageNube2;
    private int nivel;
    private int cielo;
    
    /**
     * El constructor recibe como parametro el número de nivel
    */
    public CieloObj(int n,int numImage )
    {
        super(n, numImage);
        nivel= n;
        cielo= numImage;
         try{
            imageNube1= new GreenfootImage("nube1.png"); 
            imageNube2= new GreenfootImage("nube2.png"); 
      
         } 
         catch(Exception e){
             System.out.println("Error al abrir nube");
         } 
    }
    
    /**
       *Comportamiento de la nube
       */
    public void act() 
    {
        if(nivel != 3)
        {
            if(cielo == 1)
            {   
                setImage(imageNube1);
            }
        
            else  if (cielo ==2)
            {
                setImage(imageNube2);
            }
        }
        
        movObje();

    }
    
    /**
       * Movimiento de la nube
       **/   
    public  void movObje()
    {
        move(-( Greenfoot.getRandomNumber(3)));
        super.verifica();
    }
}
