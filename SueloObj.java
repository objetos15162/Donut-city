import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase SueloObj, contiene los elementos del Scroll del suelo
 * 
 * @author Sandra García 
 * @author Cecilia Vazquez
 * @version Mayo 2016
 */
public class SueloObj extends Scroll
{
    /**Image suelo1**/
    private GreenfootImage nivel1;
    private GreenfootImage nivel2;
    private GreenfootImage nivel3;
    
    /**Image suelo2**/
    private GreenfootImage n1;
    private GreenfootImage n2;
    private GreenfootImage n3;
   
    private int n;  //Nivel
    private int nImage; //Número de imagen
    
   /**
     * El constructor recibe como parametro el número de nivel y el nuúmero de imagen
     * Mediante un try catch abre las imagenes
     * @param nivel número de nivel
     * @param numImagen número de objeto a pintar
     * 
    */
    public SueloObj(int nivel, int numImage)
    {
        super(nivel, numImage);
        n= nivel;
        nImage= numImage;
        try
        {
            n1= new GreenfootImage("flores1.png"); 
            n2= new GreenfootImage("nopal.png");
            n3= new GreenfootImage("piedra1.png"); 
            
            nivel1= new GreenfootImage("flores2.png");
            nivel2= new GreenfootImage("cactus2.png");
            nivel3= new GreenfootImage("piedra2.png");
        }
        catch(Exception e)
        {
            System.out.println("Error al cargar imagenes de suelo");
        }
        
        
    } 
    
    /**
     * Comportamiento del Scroll
       */
    public void act() 
    {
       
        if(nImage == 1)
        {
            switch(n)
            {
                case 1: setImage(n1);
                    break;
                case 2: setImage(n2);
                    break;
                case 3: setImage(n3);
                    break;
            }
        }
        else  if (nImage == 2)
        {
             switch(n)
            {
                case 1:  setImage(nivel1);
                    break;
                case 2: setImage(nivel2);
                    break;
                case 3: setImage(nivel3);
                    break;
            }
        }
         movObje();
    }
    
    /**
       *Movimiento del objeto
       **/
    public  void movObje()
    {
        move(-( Greenfoot.getRandomNumber(8)));
        super.verifica();
    }
}
