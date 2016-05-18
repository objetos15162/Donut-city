import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase Jugador, representa el comportamiento del taco (jugador)
 * 
 * @author Sandra García y Cecilia Vazquez
 * @version Versión 2.0 / Abril 2016
 */
public class Jugador extends Actor
{
    private int puntos;
    private GreenfootImage image1;
    private GreenfootImage image2;
    private GreenfootImage pierde;
    private int nuevaVida;
    private Life vd;
    
    /**
     *  Contructos de clase 'Jugador' se encarga de inicializar las variables de tipo GreenfootImage
     *  Utiliza un try -catch por si llegase a haber errores al cargar la imagen
       */
    public Jugador ()
    {
        try{
            image1= new GreenfootImage("taco1.png");
            image2 = new GreenfootImage("taco2.png");
            pierde = new GreenfootImage("tacoPierde.png");
            setImage(image1); 
         } 
         catch(Exception e)
         {
              System.out.println("No pudo cargar la imagen Taco");
         } 
    }  
    
    /**
     * Act - Se encarga del movimiento del jugador
     */
    public void act() 
    {
        // Add your action code here.
         if(getImage()==image1){
             setImage(image2);
            }
            else{ 
                setImage(image1);
            }
            
            
         if(Greenfoot.isKeyDown("up"))
         {           
             moveUp();
         }
         if(Greenfoot.isKeyDown("down"))
         {
            moveDown();
         }
        
         if(isTouching(Police.class) )
         {
             setImage(pierde);
             
         }
         
          
         if(isTouching(Obstaculo.class))
         {
             //verificaPosicion();
             if(getY()>299)
             {
                 setLocation(getX()+50, getY()+70);
                }
                else
                {
                    setLocation(getX()-50,getY()+70);
                }
         }
     
         
          if(isTouching(Lemon.class))
         {
             move(10);
             
             
         }
         
          if(isTouching(OnionOne.class))
         {
            
             if(getY()>200)
             {
                 setLocation(getX()-20, getY()-50);
                }
                else
                {
                    setLocation(getX()+20,getY()-50);
                }
         }
         
           if(isTouching(OnionTwo.class))
         {
             move(5);
           
             
         }
         
         
         
    }    
    
    /***
     * verificaPosicion, corrobora posición en y del objeto para determinar hacia donde se debe mover el objeto cuando es tocado por otro
     * y así no se salga de rango
     */
    public void verificaPosicion()
    {
        if(getY()>290)
        {
            setLocation(getX()+50, getY()+70);
        }
        else
        {
            setLocation(getX()-50,getY()+70);
        }
    }
    
    /**
     *  moveDown modifica la posición en Y del objeto
       */
    public void moveDown()
    {
         if(getY()<290)
             {  
                 setLocation(getX(), getY()+10);
             }
    }
    
    /** 
     * moveUp modifica la posición en Y del objeto
       **/
    
    public void moveUp()
    {
        if(getY()>120)
             {  //Delimita para que no se salga del escenario
                 setLocation(getX(), getY()-10);
             }
    }
 
}
