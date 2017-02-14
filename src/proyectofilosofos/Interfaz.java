/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofilosofos;

import javax.swing.JLabel;

/**
 *
 * @author Guillermo Veintemilla
 * Clase Interfaz donde se ve todo el proceso del codigo implementado
 */
public class Interfaz extends javax.swing.JFrame {
    
    int numero;
    
    /**
     * Creates new form Interfaz
     */
    public Interfaz(int numero) {
        this.numero=numero;
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filosofo2 = new javax.swing.JLabel();
        filosofo1 = new javax.swing.JLabel();
        filosofo3 = new javax.swing.JLabel();
        filosofo4 = new javax.swing.JLabel();
        filosofo5 = new javax.swing.JLabel();
        filosofo6 = new javax.swing.JLabel();
        tenedor2 = new javax.swing.JLabel();
        tenedor1 = new javax.swing.JLabel();
        tenedor3 = new javax.swing.JLabel();
        tenedor4 = new javax.swing.JLabel();
        tenedor5 = new javax.swing.JLabel();
        tenedor6 = new javax.swing.JLabel();
        comenzar = new javax.swing.JButton();
        texto1 = new javax.swing.JLabel();
        texto2 = new javax.swing.JLabel();
        texto3 = new javax.swing.JLabel();
        texto4 = new javax.swing.JLabel();
        texto5 = new javax.swing.JLabel();
        texto6 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Solucion");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        filosofo2.setIcon(new javax.swing.ImageIcon("F:\\Programación de servicios y procesos\\ProyectoFilosofos\\filosofo2.png"));
        filosofo2.setVisible(false);
        getContentPane().add(filosofo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 120, 130));

        filosofo1.setIcon(new javax.swing.ImageIcon("F:\\Programación de servicios y procesos\\ProyectoFilosofos\\filosofo1.png"));
        filosofo1.setVisible(false);
        getContentPane().add(filosofo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, -1));

        filosofo3.setIcon(new javax.swing.ImageIcon("F:\\Programación de servicios y procesos\\ProyectoFilosofos\\filosofo3.png"));
        filosofo3.setVisible(false);
        getContentPane().add(filosofo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        filosofo4.setIcon(new javax.swing.ImageIcon("F:\\Programación de servicios y procesos\\ProyectoFilosofos\\filosofo4.png"));
        filosofo4.setVisible(false);
        getContentPane().add(filosofo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, -1, -1));

        filosofo5.setIcon(new javax.swing.ImageIcon("F:\\Programación de servicios y procesos\\ProyectoFilosofos\\filosofo5.png"));
        filosofo5.setVisible(false);
        getContentPane().add(filosofo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, -1, -1));

        filosofo6.setIcon(new javax.swing.ImageIcon("F:\\Programación de servicios y procesos\\ProyectoFilosofos\\filosofo6.png"));
        filosofo6.setVisible(false);
        getContentPane().add(filosofo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, -1));

        tenedor2.setIcon(new javax.swing.ImageIcon("F:\\Programación de servicios y procesos\\ProyectoFilosofos\\tenedor.png"));
        tenedor2.setVisible(false);
        getContentPane().add(tenedor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        tenedor1.setIcon(new javax.swing.ImageIcon("F:\\Programación de servicios y procesos\\ProyectoFilosofos\\tenedor.png"));
        tenedor1.setVisible(false);
        getContentPane().add(tenedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        tenedor3.setIcon(new javax.swing.ImageIcon("F:\\Programación de servicios y procesos\\ProyectoFilosofos\\tenedor.png"));
        tenedor3.setVisible(false);
        getContentPane().add(tenedor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, -1));

        tenedor4.setIcon(new javax.swing.ImageIcon("F:\\Programación de servicios y procesos\\ProyectoFilosofos\\tenedor.png"));
        tenedor4.setVisible(false);
        getContentPane().add(tenedor4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, -1, -1));

        tenedor5.setIcon(new javax.swing.ImageIcon("F:\\Programación de servicios y procesos\\ProyectoFilosofos\\tenedor.png"));
        tenedor5.setVisible(false);
        getContentPane().add(tenedor5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, -1, -1));

        tenedor6.setIcon(new javax.swing.ImageIcon("F:\\Programación de servicios y procesos\\ProyectoFilosofos\\tenedor.png"));
        tenedor6.setVisible(false);
        getContentPane().add(tenedor6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, -1));

        comenzar.setText("Comenzar");
        comenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzarActionPerformed(evt);
            }
        });
        getContentPane().add(comenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 473, 140, 30));
        getContentPane().add(texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));
        getContentPane().add(texto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));
        getContentPane().add(texto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));
        getContentPane().add(texto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, -1, -1));
        getContentPane().add(texto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, -1, -1));
        getContentPane().add(texto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon("F:\\Programación de servicios y procesos\\ProyectoFilosofos\\mesa.png")); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metodo donde se implementa la accion al pulsar el boton
     * @param evt 
     */
    private void comenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzarActionPerformed
        Tenedor[] tenedores = new Tenedor[numero];
        for (int i = 0; i < numero; i++) {
            tenedores[i] = new Tenedor();
        }
        FilosofoZurdo fz = new FilosofoZurdo(0, tenedores,filosofo1,tenedor1,elegirTenedor(numero-1),texto1);
        fz.start();
        for (int i = 1; i < numero; i++) {
            Filosofo f = new Filosofo(i, tenedores,elegirFilosofo(i),elegirTenedor((i)),elegirTenedor(i-1),elegirTexto(i));
            f.start();
        }
    }//GEN-LAST:event_comenzarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }
    
    /**
     * Metodo que devuelve un Jlabel con el filosofo que queremos trabajar
     * @param num
     * @return Jlabel
     */
    public JLabel elegirFilosofo(int num){
        switch(num){
            case 1:
                return filosofo2;
            case 2:
                return filosofo3;
            case 3:
                return filosofo4;
            case 4:
                return filosofo5;
            case 5:
                return filosofo6;
        }
        return null;
    }
    
    /**
     * Metodo que devuelve un Jlabel con el tenedor que queremos trabajar
     * @param num
     * @return JLabel
     */
    public JLabel elegirTenedor(int num){
        switch(num){
            case 1:
                return tenedor2;
            case 2:
                return tenedor3;
            case 3:
                return tenedor4;
            case 4:
                return tenedor5;
            case 5:
                return tenedor6;
        }
        return tenedor1;
    }
    
    /**
     * Metodo que devuelve un Jlabel con el texto que queremos trabajar
     * @param num
     * @return JLabel
     */
    public JLabel elegirTexto(int num){
        switch(num){
            case 1:
                return texto2;
            case 2:
                return texto3;
            case 3:
                return texto4;
            case 4:
                return texto5;
            case 5:
                return texto6;
        }
        return texto1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton comenzar;
    private javax.swing.JLabel filosofo1;
    private javax.swing.JLabel filosofo2;
    private javax.swing.JLabel filosofo3;
    private javax.swing.JLabel filosofo4;
    private javax.swing.JLabel filosofo5;
    private javax.swing.JLabel filosofo6;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel tenedor1;
    private javax.swing.JLabel tenedor2;
    private javax.swing.JLabel tenedor3;
    private javax.swing.JLabel tenedor4;
    private javax.swing.JLabel tenedor5;
    private javax.swing.JLabel tenedor6;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    private javax.swing.JLabel texto3;
    private javax.swing.JLabel texto4;
    private javax.swing.JLabel texto5;
    private javax.swing.JLabel texto6;
    // End of variables declaration//GEN-END:variables
}
