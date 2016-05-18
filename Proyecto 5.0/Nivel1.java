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
    private int numPolice;
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
        
        
        /**Añade nubes al escenario  **/
        CieloObj nube = new CieloObj (1, 1);
        addObject(nube, 500, 60);
        
        CieloObj nube1 = new CieloObj (1,2);
        addObject(nube1, 450, 50);
        
        CieloObj nube2 = new CieloObj (1,1);
        addObject (nube2, 255, 55);
        
        CieloObj nube3 = new CieloObj (1,2);
        addObject(nube3, 111, 45);
        
        CieloObj nube4 = new CieloObj (1,1);
        addObject (nube4, 50, 65);
        
       /**Añade flores al escenario  **/
        SueloObj q = new SueloObj(1,1);
        addObject(q, 200, 370);
      
        SueloObj sue = new SueloObj (1,2);
        addObject (sue, 250, 370);
        
        SueloObj su = new SueloObj (1,2);
        addObject(su, 425, 370);
        
        SueloObj suelo = new SueloObj(1,1);
        addObject(suelo, 600, 370);
        
        SueloObj s = new SueloObj(1,1);
        addObject(s, 100, 370);
      
        
        /**Añade Policias al escenario**/
        Police p1= new Police(1);
        addObject(p1, 60,100);
        Police p2= new Police(2);
        addObject(p2, 100,165);
        Police p3= new Police(1);
        addObject(p3, 55,230);
        Police p4= new Police(2);
        addObject(p4, 90,295);
        
        /**Añade obstaculos al escenario*/
       Obstaculo muro = new Obstaculo(1);
       addObject(muro, 570, 190);
       
       Obstaculo hoyo = new Obstaculo(2);
       addObject (hoyo, 570,100);
       
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


