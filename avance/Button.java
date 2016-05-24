import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase abstracta que guarda el método de 'mouseSobreBoton', el cual
 * actua diferente para cada cla
 * 
 * @author Sandra García
 * @author Cecilia Vazquez
 * @version Mayo 2016
 */
public abstract class Button extends Actor
{

    /**Cuando se coloque el mouse en el objeto, se cambiará
       de imagen para que el usuario sepa la opción que está por 
       habilitar*/  
        public abstract void mouseSobreBoton();
}
