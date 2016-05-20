import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;

/**
 * Clase vida- Representa la salud del jugador (taco)
 * La cual al hacer contacto con algún objeto de la clase
 * 'Obstaculo' o 'Policia' disminuye
 * Y al hacer contacto con algún objeto de la clase 'Bonus' aumenta
 * 
 * @author Sandra García 
 * @author Cecilia Vazquez
 * @version Versión 4.0 / Mayo 2016
 */
public class Life extends Actor
{
    /**
       *Contructor de Vida, se inicializa la variable
       *'vida' la cual representa visualmente la salud del jugador
       */
    public Life()
    {
        super();
        GreenfootImage vida = new GreenfootImage(262, 20);
        vida.setColor(Color.GREEN);
        vida.fill();
        setImage(vida);
    }
    
    /**
     * Reduce la vida del Jugador
     * El ancho de la figura cambia y además cambia su color
     * 
     * @param  damage valor del daño recibido
     * @param  life, imagen acutal
     * 
     * @return Devuelve true si disminuyo, false sino
       **/
    public boolean disminuyeVida(int damage, GreenfootImage life)
    {
        boolean ban;
        if(ancho(damage,life)==false)
        {
            int vid=(life.getWidth())-damage;
            GreenfootImage vida =new GreenfootImage(vid, 20);
            if(vid>176)
            {
                vida.setColor(Color.GREEN);
            }
            else if(vid>88)
            {
                vida.setColor(Color.ORANGE);
            }
            else
            {
                vida.setColor(Color.RED);
            }
            vida.fill();
            setImage(vida);
            ban= true;
        }
        else
        {
            life.clear();
            setImage(life);
            ban= false;
        }
        return ban;
    }
    
    /**
     * Aumenta la vida(ancho) del rectangulo 
     * 
     * @param inc el valor de lo que aumentara
     * @param life la imagen actual(Rectangulo) que representa la vida
     * 
     * @return Devuelve 'true' si se aumento, y 'false' si no
     */
    public boolean incrementaVida(int inc,GreenfootImage life)
    {
        if(limite(inc,life)==false)
        {
            int vid=(life.getWidth())+inc;
            GreenfootImage vida =new GreenfootImage(vid, 20);
            if(vid>176)
            {
                vida.setColor(Color.GREEN);
            }
            else if(vid>88)
            {
                vida.setColor(Color.ORANGE);
            }
            else
            {
                vida.setColor(Color.RED);
            }
            vida.fill();
            setImage(vida);
            return true;
        }
        else
        {
            setImage(life);
            return false;
        }
        
    }
    
    /**
     * Indica si el daño es mayor al ancho de la imagen
     * 
     * @param damage valor del daño recibido
     * @param life imagen actual (Rectangulo) que representa la salud del jugador
     * 
     * @return Devuelve un true en caso que si sea mayor 
     * y un false en caso contrario
     */
    public boolean ancho (int damage, GreenfootImage life)
    {
        boolean ban = false;
         if(life.getWidth()<=damage)
         {
             ban= true;
         }

            return ban;
     }
     
      /**
     * Indica si ya no se puede aumentar mas a la vida puesto que llego 
     * a su máximo
     * 
     * @param inc valor del incremento recibido
     * @param life la imagen actual (Rectangulo) que representa la vida
     * 
     * @return Devuelve un true si esta en el tope y un false en su caso contrario
     */
    public boolean limite(int inc,GreenfootImage life)
    {
        boolean ban=false;
        if(life.getWidth()+inc>262)
        { 
            ban= true;
        }
    
          return ban;
    }
}