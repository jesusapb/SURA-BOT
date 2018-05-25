
package botsura;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * esta clase ya resulta incesaria hay que borrarla en futuras actualizaciones la funcion para
 * la que estaba diseñada ya no es nesesia implementarla aqui
 * @author japb1
 */
public class ParsearArchivo {
    public ArrayList<String> baseDatos;
    String content;
    
    
    public ParsearArchivo(){
        this.baseDatos= new ArrayList<>();

    }
    
    public void getString(){
       // content = new leerArchivo("base1.txt").getContentFile();
    
    }
    public String[] parsingContent(){
        
        String[] parsing= content.split(",");
       for(int i = 0; i<parsing.length; i++) {
       System.out.println(parsing[i]);
       }
        return parsing;
    }
    
    public int validarTrabajador(String[] parsing, String trabajador, String correo){
        int j=-1;
        for(int i=0;i<parsing.length;i=i+3){
            if(parsing[i].equals(trabajador)){
                if (parsing[i+1].equals(correo)) {
                    j=0;
                    return j;
                }
            }
        }
        return j;
    }
    
    
   
    
    
}
