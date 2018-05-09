/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botsura;

/**
 *
 * @author japb1
 */
public class BotSura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       leerArchivo art= new leerArchivo("base1.txt");
       art.imprimirlista();
       
       leerArchivo base= new leerArchivo("base1.txt");
       base.ActualizarArchivo(5,"gato");
       preguntas cuest= new preguntas();
       cuest.imprimir();
       trabajador emp= new trabajador("gato","solo esta");
       emp.imprimir();
       
    }
    
}
