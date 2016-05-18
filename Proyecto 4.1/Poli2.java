import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Poli2 es un tipo de policia (Enemigo) del juego
 * @author Sandra García y Cecilia Vazquez
 * @version Versión 2.0 / Abril 2016
 */
public class Poli2 extends Police
{
    /**
     * Constructor de Poli2
     * Por medio de un try intenta inicializar las variables tipo GreenfootImage
     * y muestra la imagen 1
     * De no se posible abrir la imagen, por medio de catch
     * se atrapará la excepción
     **/
    public Poli2()
    {
       super();
    }
   
    /**
     * Act intercambia las imagenes para dar la apariencia de movimiento
     */
    public void act() 
    {       
        super.actPoliceTwo();
    } 
}

