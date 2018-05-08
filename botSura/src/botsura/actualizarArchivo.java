/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botsura;
//https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author japb1
 */
public class actualizarArchivo {
    //se requiere una clase especial para actualizar los datos
    FileWriter fichero = null;
    PrintWriter pw = null; 
  
    public actualizarArchivo(){
        try
        {
            
            
            fichero = new FileWriter("base1.txt");
            pw = new PrintWriter(fichero);
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (IOException e2) {
              e2.printStackTrace();
           }
    }
    }
    
    
    
    
    public void actualizar(int num, String Actualizacion){
       int i;
        leerArchivo arreglo= new leerArchivo("base1.txt");
        arreglo.lista.set(num, Actualizacion);
        for(i=0;i < arreglo.lista.size();i++){
          pw.println(arreglo.lista.get(i));
        }
        
         
        //remove(int index)
    }
  
    
   
    
    
}