/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofilosofos;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Guillermo Veintemilla
 * Clase tenedor donde el tenedor actua como semaforo
 */
public class Tenedor {

    private Semaphore semaforo;

    /**
     * Constructor de la clase
     */
    public Tenedor() {
        this.semaforo= new Semaphore(1);
    }
    
    /**
     * Metodo donde implementamos el coger un tenedor en la mesa
     */
    public void coger(){
        try {
        semaforo.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(Tenedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Metodo donde implementamos el dejar un tenedor en la mesa
     */
    public void dejar(){
        semaforo.release();
    }

}
