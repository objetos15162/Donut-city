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
    private int lifes;
    private GreenfootImage image1;
    private GreenfootImage image2;
    private GreenfootImage loser;
    private GreenfootImage pierde;
    private int nuevaVida;
    private Life vd;
    private char nivel; 
    private int MAXNIVEL1 = 5;
    private int MAXNIVEL2= 100;
    private int MAXNIVEL3= 150;
      
    /**
     *  Contructos de clase 'Jugador' se encarga de inicializar las variables de tipo GreenfootImage
     *  Utiliza un try -catch por si llegase a haber errores al cargar la imagen
       */
    public Jugador ()
    {
      //  nivel =1;
        lifes= 3;
        try{
            image1= new GreenfootImage("taco1.png");
            image2 = new GreenfootImage("taco2.png");
            pierde = new GreenfootImage("tacoPierde.png");
            loser = new GreenfootImage("loser.png");
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
              World mundo = getWorld();
             Nivel1 myWorld=(Nivel1)mundo;
              myWorld.getLifes().setValue(lifes);
         
         
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
             World mundo1 = getWorld();
             Nivel1 myWorld1=(Nivel1)mundo1;
             lifes=lifes-1;
             myWorld1.getLifes().setValue(lifes);
         }
         
          
         if(isTouching(Obstaculo.class))
         {
             //verificaPosicion();
             if(puntos > 20)
             {
                 puntos= puntos-10;
                 World m = getWorld();
                 Nivel1 mW = (Nivel1) m;
                 mW.getpuntos().setValue(puntos); 
             }
             else 
             {
                 lifes -- ;
                 puntos=0;
             }
             
             if (lifes <= 0)
             {
                setLocation(354,125);
                Greenfoot.stop();
                setImage(loser);
                Greenfoot.delay(10000);
              //  Menu newWorld = new Menu();
               // Greenfoot.setWorld(newWorld);
             }
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
    
         
         if(puntos >=  MAXNIVEL1 || getX() == 560  )
         {
             setLocation(354,125);
             setImage("nivel1winner.png");
          //   nivel++;
             System.out.println(nivel);
             Greenfoot.stop();
              Nivel2 newWorld = new Nivel2();
            Greenfoot.setWorld(newWorld);
             
         }
         
          if(isTouching(Lemon.class))
         {
             move(10);
            World mundo1= getWorld();
           Nivel1 myWorld1=(Nivel1)mundo1;
            puntos= puntos+5;
           myWorld1.getpuntos().setValue(puntos);
             
         }
         
         
         
          if(isTouching(OnionOne.class))
         {
           World mundo1 = getWorld();
           Nivel1 myWorld1=(Nivel1)mundo1;
           myWorld1.getpuntos().setValue(puntos);
           puntos= puntos+10;
             move (20);
         }
         
           if(isTouching(OnionTwo.class))
         {
             move(5);
              puntos= puntos+20;
           World mundo1 = getWorld();
           Nivel1 myWorld1=(Nivel1)mundo1;
           myWorld1.getpuntos().setValue(puntos);
          
             move (20);
        
         
         
         
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
    
    public char getNivelJug()
    {
        World mundo1= getWorld();
      //  Nivel1 myWorld1=(Nivel1)mundo1;
    //    myWorld1.getNivel().setValue(nivel);
        return nivel;
    }
 
}
