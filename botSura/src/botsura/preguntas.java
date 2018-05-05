/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botsura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author japb1
 */
public class preguntas {
   public ArrayList<String> cuestionario;
    Scanner file;
    //el constructor abre el archivo, lo lee y vacea el contenido en un arreglo dinamico
    public preguntas(String archivo){
    this.cuestionario =new ArrayList<String>();  
    try {
            file = new Scanner(new File(archivo));
        } catch (FileNotFoundException ex) {
           // Logger.getLogger(FileReader.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
    while (file.hasNextLine()){
         cuestionario.add(file.nextLine());
        }
        file.close();
    }     
    
    
   
   
    public ArrayList<String> getcuestionario() {
        return cuestionario;
    }
    
      public int getcuestionarioCounter() {
        return cuestionario.size();
    }
    

    //este medodo solo es para comprobar que lo vacie en un arreglo
    public void imprimirArreglo(){
        for(int i=0;i<this.cuestionario.size();i++){
            System.out.println(cuestionario.get(i));
        }
    }
    
    //este medodo solo es para comprobar que lo vacie en un arreglo
    public void imprimirPreguntas(){
       for(int i=0;i<this.cuestionario.size();i=1+3){
        System.out.println(cuestionario.get(i));
        }
    }
    
    //este medodo solo es para comprobar que lo vacie en un arreglo
    public void imprimirOpciones(){
        for(int i=0;i<this.cuestionario.size();i=1+3){
        System.out.println(cuestionario.get(i+1));
        System.out.println(cuestionario.get(i+2));
        }
    }
    
    
    //cierro el archivo
    public void closeFile(){
        file.close();
    }    
    
}
