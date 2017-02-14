/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofilosofos;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Guillermo Veintemilla
 * Clase FilosofoZurdo donde el filosofo es zurdo y extiende de Thread
 */
public class FilosofoZurdo extends Thread {

    private int numeroFilosofo;
    private Tenedor[] tenedores;
    JLabel filosofo;
    JLabel tenedorDerecha;
    JLabel tenedorIzquierda;
    JLabel texto;

    /**
     * Constructor de la clase
     * @param num id filosofo
     * @param t array de tenedores total
     * @param filosofo imagen del filosofo
     * @param tenedor imagen del tenedor derecho
     * @param tenedor2 imagen del tenedor izquierdo
     * @param texto imagen del texto
     */
    public FilosofoZurdo(int num, Tenedor[] t, JLabel filosofo, JLabel tenedor, JLabel tenedor2, JLabel texto) {
        this.numeroFilosofo = num;
        this.tenedores = t;
        this.filosofo = filosofo;
        this.tenedorDerecha = tenedor;
        this.tenedorIzquierda = tenedor2;
        this.texto = texto;
        filosofo.setVisible(true);
        tenedorDerecha.setVisible(true);
    }

    /**
     * Metodo run que implenta la accion de comer
     */
    public void run() {
        while (true) {
            comer();
        }
    }

    /**
     * Metodo donde el filosofo come
     */
    public void comer() {
        try {
            texto.setText("Esperando tenedor");
            sleep(2000);
            cogerTenedorDerecho();
            texto.setText("Un tenedor");
            sleep(2000);
            cogerTenedorIzquierdo();
            texto.setText("Dos tenedores");
            sleep(2000);
            texto.setText("Comiendo");
            sleep(3000);
            dejarTenedorDerecho();
            texto.setText("Dejo un tenedor");
            sleep(2000);
            dejarTenedorIzquierdo();
            texto.setText("Tenedores dejados");
            sleep(2000);
            pensar();
        } catch (InterruptedException ex) {
            Logger.getLogger(Filosofo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Metodo en el que dejamos el tenedor izquierdo
     */
    private void dejarTenedorIzquierdo() {
        tenedores[numeroFilosofo].dejar();
        tenedorIzquierda.setEnabled(true);
        //System.out.println("Tenedor "+numeroFilosofo+" dejado por filosofo zurdo "+numeroFilosofo);
    }

    /**
     * Metodo donde dejamos el tenedor derecho
     */
    private void dejarTenedorDerecho() {
        tenedores[(numeroFilosofo + 1) % tenedores.length].dejar();
        tenedorDerecha.setEnabled(true);
        //System.out.println("Tenedor "+(numeroFilosofo+1)+" dejado por filosofo zurdo "+numeroFilosofo);
    }

    /**
     * Metodo donde cogemos el tenedor izquierdo
     */
    private void cogerTenedorIzquierdo() {
        tenedores[numeroFilosofo].coger();
        tenedorIzquierda.setEnabled(false);
        //System.out.println("Tenedor "+numeroFilosofo+" cogido por filosofo zurdo "+numeroFilosofo);
    }

    /**
     * Metodo en el que cogemos el tenedor derecho
     * @throws InterruptedException 
     */
    private void cogerTenedorDerecho() throws InterruptedException {
        tenedores[(numeroFilosofo + 1) % tenedores.length].coger();
        tenedorDerecha.setEnabled(false);
        //System.out.println("Tenedor "+(numeroFilosofo+1)+" cogido por filosofo zurdo "+numeroFilosofo);
        sleep(1000);
    }

    /**
     * Metodo donde el filosofo piensa
     */
    public void pensar() {
        try {
            texto.setText("Pensando");
            sleep(4000);
        } catch (InterruptedException ex) {
            Logger.getLogger(FilosofoZurdo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
