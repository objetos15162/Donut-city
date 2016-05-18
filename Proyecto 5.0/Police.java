import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase se encarga del comportamiento de los policias.
 * 
 * @author Sandra García y Cecilia Vazquez
 * @version Versión 2.0 / Abril 2016
 */
public class Police extends Actor
{
    private GreenfootImage imgPolice1; 
    private GreenfootImage imgPolice11;
        
    private GreenfootImage imgPolice2;
    private GreenfootImage imgPolice22;
    
    private int np;
    /**
     * Constructor de la clase Policias
     * Con un try se cargan las imagenes correspodientes a los enemigos 
     * en caso de que ocurriera una excepción manda un mensaje 
     */
    public Police(int numPolice)
    {
        super();
        np=numPolice;
        try{
            imgPolice1= new GreenfootImage("p1.png");
            imgPolice11 = new GreenfootImage("p3.png");
            imgPolice2= new GreenfootImage("pR1.png");
            imgPolice22 = new GreenfootImage("pR3.png");
         } 
         catch(Exception e){
             System.out.println("No pudo cargar la imagen Policia");
         }
    }
    
    public void act()
    {
         if(np == 1)
            {
                actPoliceOne();
            }
            
            else if(np==2)
            {
                actPoliceTwo();
            }
    }
    
    /**
     * Esta clase se encarga de intercalar las imagenes del policia uno
    */
    public void actPoliceOne()
    {
        if(getImage()==imgPolice1){
             setImage(imgPolice11);

            }
            else{ 
                setImage(imgPolice1);
            }
    }
    
    /**
     * Esta clase se encarga de intercalar las imagenes del policia dos
     */
    public void actPoliceTwo()
    {
         if(getImage()==imgPolice2){
             setImage(imgPolice22);

            }
            else{ 
                setImage(imgPolice2);
            }
    }
}
