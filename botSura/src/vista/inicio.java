/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author japb1
 */
public class inicio extends javax.swing.JFrame {

    /**
     * Creates new form inicio
     */
    public inicio() {
        initComponents();
        setLocationRelativeTo(null);
    }
            //
            //crear tres variables para enviar el dato a la ventana del quiz donde se guardaran el nombre el correo y el numero de linea
            //
     //public static String identificador;
    // public static String segundoIdentificador;
     //public static int num;
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Trabajador = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        correo = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        matricula = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("inicio");

        Trabajador.setText("guardar");
        Trabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrabajadorActionPerformed(evt);
            }
        });

        jLabel1.setText("trabajador");

        jScrollPane1.setViewportView(correo);

        matricula.setName("matricula"); // NOI18N
        jScrollPane2.setViewportView(matricula);

        jLabel2.setText("matricula");

        jLabel3.setText("correo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(Trabajador)))))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(Trabajador)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrabajadorActionPerformed
        try {
            // TODO add your handling code here:
           File trabajador = new File("datos.txt");
            
            FileWriter escribir = new FileWriter(trabajador, true); //en donde vamos a guardar 
           
            String texto = matricula.getText();
            String cor =  correo.getText();
            PrintWriter imprime = new PrintWriter(escribir); //escribe en la direccion dada
           
           imprime.append("\r\n");
            imprime.append("Matrícula: ");
            imprime.print(texto); 
            imprime.append("\r\n");
            imprime.append("Correo: ");
            imprime.print(cor);
            imprime.append("\r\n");
            escribir.close();
        } catch (Exception ex) {
            Logger.getLogger(inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        //se tomaran los valores de la ventana y se invocara al la clase 
        //trabajador en ellos se buscara si existe o no el trabajador y 
        //si es el caso se abrira la segunda ventana 
        /*int i=-1;
       if( i>=0){
        ventana1 abrir = new ventana1();
        abrir.setVisible(true);
        }
        else{
        inicio abrir= new inicio();
        abrir.setVisible(true);
        abrir.dispose();
        setTitle("Matricula incompleta");
        }*/
        setVisible(false);
       //si la se segenera un numero que sea distinto de -1 se abrira la segunda ventana;
        //ventana1 abrir = new ventana1();
        setVisible(true);
        
        
        //se cierra la ventana para que todo pase en la nueva ventana oculto solo para trabajar
       this.dispose();
    }//GEN-LAST:event_TrabajadorActionPerformed

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
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
                
                //centrar ventana y agregar un nombre a esta
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Trabajador;
    public javax.swing.JTextPane correo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    public javax.swing.JTextPane matricula;
    // End of variables declaration//GEN-END:variables
}
