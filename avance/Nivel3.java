import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel3 here.
 * 
 *@author Sandra García y Cecilia Vazquez
 *@version Versión 2.0 / Abril 2016
 */
public class Nivel3 extends World
{
      private Label jugador; 
    private String jug;
    private Counter  puntuaje;
    private Counter timerDisplay;
    private SimpleTimer timer;
    private int nivel;
    private int numPolice;
    private int life=5;
    private int lemon=0;
    private int onion1=0;
    private int onion2=0;
    private int muro=0;
    private int hoyo=0;
    private int time=0;
    private Counter  puntos;
    private Counter lifes;
    /**
     * Constructor for objects of class Nivel3.
     * 
     */
    public Nivel3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
          super(600, 400, 1);  
         nivel =3;    
        //Tiempo
        timerDisplay = new Counter ("Time");
        addObject(timerDisplay,177,16);
         
        timer = new SimpleTimer(); 
        
        //Nombree del jugador y contador de vidas
        lifes= new Counter("Paco taco: ");
        addObject(lifes,61,16);

        
         puntos= new Counter("Puntos:");
         addObject(puntos,275,16);
        
        //Jugador (Taco)
        Jugador jug = new Jugador ();
        addObject(jug,340,225);
         //Jugador (Taco)
     
          CieloObj nube = new CieloObj (2, 1);
        addObject(nube, 500, 60);
        
        CieloObj nube1 = new CieloObj (2,2);
        addObject(nube1, 450, 50);
        
        CieloObj nube2 = new CieloObj (2,1);
        addObject (nube2, 255, 55);
        
        CieloObj nube3 = new CieloObj (2,2);
        addObject(nube3, 111, 45);
        
        CieloObj nube4 = new CieloObj (2,1);
        addObject (nube4, 50, 65);
        
       /**Añade flores al escenario  **/
        SueloObj q = new SueloObj(2,1);
        addObject(q, 200, 370);
      
        SueloObj sue = new SueloObj (2,2);
        addObject (sue, 250, 370);
        
        SueloObj su = new SueloObj (2,2);
        addObject(su, 425, 370);
        
        SueloObj suelo = new SueloObj(2,1);
        addObject(suelo, 600, 370);
        
        SueloObj s = new SueloObj(2,1);
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
    }
}
