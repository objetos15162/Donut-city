import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Mundo correspondiente al nivel 1 del juego
 * 
 * @author Sandra García y Cecilia Vazquez
 * @version Versión 2.0 / Abril 2016
 */
public class Nivel1 extends World
{
    /***
     *Variable iniciales
     */
    
    private Label jugador; 
    private String jug;
    private Counter  puntuaje;
    private Counter timerDisplay;
    private SimpleTimer timer;
    private int nivel=1;
   
      private int r=0, x=0, rY, time=0;
    /**
     * Constructor de clase Nivel1.
     * Se inicializan las variables  y se añaden los objetos  que forman parte del
     * nivel como las nubes, flores, enemigos (policias donas) y jugador.
     * También se añade el nombre del jugador y el tiempo.
     * 
     */
    public Nivel1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        //Tiempo
        timerDisplay = new Counter ("Time");
        addObject(timerDisplay,177,16);
         
        timer = new SimpleTimer(); 
        
        //Nombree del jugador y contador 
        puntuaje= new Counter("Paco taco: ");
        addObject(puntuaje,61,16);
        
        //Jugador (Taco)
        Jugador jug = new Jugador ();
        addObject(jug,340,225);
        
        //Nube
        obC1 ob = new obC1(1);
        addObject(ob, 50,65);
        
        //Nube
         obC1 ob2 = new obC1(1);
        addObject(ob2, 111,45);
        
        //Nube
        obC2 obj = new obC2(1);
        addObject(obj, 255,55);
        
        //Nube
         obC2 obj2 = new obC2(1);
        addObject(obj2, 450,50);
        
        //Nube
         obC1 ob3 = new obC1(1);
        addObject(ob3, 500,60);
        
        //Flores
        obS1 obJ = new obS1(1);
        addObject(obJ, 200,370);
        
        //Flores
        obS2 obJe = new obS2(1);
        addObject(obJe, 350,370);
        
        //Flores
        obS1 obJ2 = new obS1(1);
        addObject(obJ2, 425,370);
        
        obS2 obJe2 = new obS2(1);
        addObject(obJe2, 100,370);
        
        obS2 obJe3 = new obS2(1);
        addObject(obJe3, 600,370);
        //Dona rosa
        Poli2 opos = new Poli2();
        addObject(opos, 60,100);
        
        //Dona blanca
        Poli1 opo = new Poli1();
        addObject(opo, 100,165);
        
        //Dona rosa
        Poli2 m2 = new Poli2();
        addObject(m2, 55,230);
        
       //Dona blanca
        Poli1 opo2 = new Poli1();
        addObject(opo2, 90,295);
        

        
        //Obstaculo
       Muro mObj= new Muro();
       addObject(mObj ,570,190); 
       
       //Objeto
       Hoyo mObj2= new Hoyo();
       addObject(mObj2 ,570,100); 
        //Bonus
       Lemon Bobj= new Lemon();
       addObject(Bobj,590,311); 
            
         OnionOne Bobj2= new OnionOne();
       addObject(Bobj2,590,211); 
            
       OnionTwo Bobj3= new OnionTwo();
       addObject(Bobj3,590,111); 
            
       //Maquina de rerescos
       EvilSoda Mobj= new EvilSoda();
       addObject(Mobj,500,44); 
    }
    
    /**
     * En este método corre el tiempo del timer
    */
    public void act()
    {
         if(timer.millisElapsed()>1000)
        {
          timerDisplay.add(1);
          timer.mark();
          r++;
             
        }
        
        
        
       
               
      
        
    }
    
    /**
     * Este método regresa el número de nivel del juego
     * @return nivel, valor entero que inidica en que nivel se encuentra el 
     * jugador, inicialmente vale 1
      */
     public int getNivel()
    {
        return(nivel);
    }
  
    
}


