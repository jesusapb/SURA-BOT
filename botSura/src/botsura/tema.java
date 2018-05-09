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
public class tema {
     public ArrayList<String> temas;
    Scanner file;
    //el constructor abre el archivo, lo lee y vacia 
    //como el contenido en un arreglo dinamico
    public tema(String archivo){
    this.temas =new ArrayList<String>();  
    try {
            file = new Scanner(new File(archivo));
        } catch (FileNotFoundException ex) {
           // Logger.getLogger(FileReader.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
    while (file.hasNextLine()){
         temas.add(file.nextLine());
        }
        file.close();
    }     
    
    
     public ArrayList<String> gettemas() {
        return temas;
    }
    
      public int gettemasCounter() {
        return temas.size();
    }
    
public void imprimirTema(){
       for(int i=0;i<this.temas.size();i=i+2){
        System.out.println(temas.get(i));
        }
    }
    
    //este medodo solo es para comprobar que lo vacie en un arreglo
    public void imprimirContenido(){
        for(int i=0;i<this.temas.size();i=i+2){
        System.out.println(temas.get(i));
        }
    }    
    
    
    
    
}
