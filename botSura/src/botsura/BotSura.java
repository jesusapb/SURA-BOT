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
        // TODO code application logic here
        //preguntas consul= new preguntas("quiz1.txt");
        //consul.imprimirArreglo();
        //consul.imprimirPreguntas();
        
       
       //actualizarArchivo act = new actualizarArchivo("base1.txt");
       //act.Actualizar3(1,"actualizacion correcta");
     // 
     // act.actualizar(2,"actualizar");
       //trabajadordos base = new trabajadordos("base1.txt"); 
        //base.actualizar("hola");
        //base.imprimir();
       // leerArchivo art= new leerArchivo("base1.txt");
        //art.getContentFile();
        
        actualizarArchivo base= new actualizarArchivo("base1.txt");
        base.actualizar(2,"hola4");
        base.terminarActualizacion();
    }
    
}
