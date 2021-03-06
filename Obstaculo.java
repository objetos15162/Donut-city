import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *Clase obstaculo, se encarga de evitar que el jugador llegue a la meta
 * 
 * @author Sandra García y Cecilia Vazquez
 * @version Versión 2.0 / Abril 2016
 */
public class Obstaculo extends Actor
{
    private GreenfootImage imgObs1; 
    private GreenfootImage imgObs2;
    private int nivel;
    private int numObs;
    /**
     * Contructor de la clase obstaculo.
     *  Con un try se cargan las imagenes correspodientes a los enemigos 
     * en caso de que ocurriera una excepción manda un mensaje 
    **/
    public Obstaculo(int numObstaculo)
    {
        super();
        numObs = numObstaculo;
        try{
            imgObs1= new GreenfootImage("muro.png");
            imgObs2= new GreenfootImage("hoyo.png");
            
         } 
         catch(Exception e){
             System.out.println("No pudo cargar la imagen obstaculo");
         }
    }
    
    /**
     * Act - Comportamiento del obstaculo
     */
    public void act() 
    {      
      
        
        
      if(numObs ==1)
      {
          setImage(imgObs1);
         
      }
      
      else if(numObs ==2)
      {
          setImage(imgObs2);
      } 
      move(-( Greenfoot.getRandomNumber(6)));  
     
      
      verificaPiso();
    }
 public void verificaPiso()
    {
        int iY;
       
        Nivel1 mundo1 = (Nivel1)getWorld();
        nivel = mundo1.getNivel();
        if(getX()<3)
        {
            mundo1.removeObject(this);
         
          
         
        }
        
    }}  