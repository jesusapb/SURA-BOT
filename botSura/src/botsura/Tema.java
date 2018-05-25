
package botsura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author japb1
 */
public class Tema {
   String archivo;
   leerArchivo temas;
    
   public Tema(){
        this.archivo="temas.txt";
        temas= new leerArchivo(this.archivo);     
    }     
    
    
    
    //crea la cadena que sera enviada a la vista extrayendola del modelo(archivo .txt)
       
public String imprimirTema(int i){
       String cadena="";
       cadena = temas.lista.get(i) + "\n" + temas.lista.get(i+1) + "\n";
       //cadena por si el tema es mas grande
       //cadena = temas.lista.get(i) + "\n" + temas.lista.get(i+1) + "\n" + temas.lista.get(i+2) + "\n" + temas.lista.get(i+3);
       return cadena;
    }   
}
