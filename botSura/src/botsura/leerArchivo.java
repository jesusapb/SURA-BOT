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
public class leerArchivo {
    Scanner file;
    public ArrayList<String> lista;
    
    public leerArchivo(String archivo){

    this.lista =new ArrayList<String>();  
    try {
            file = new Scanner(new File(archivo));
        } catch (FileNotFoundException ex) {
           // Logger.getLogger(FileReader.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
    while (file.hasNextLine()){
         lista.add(file.nextLine());
        }
       file.close();
    }
    
    public ArrayList<String> getlista() {
        return lista;
    }
    
    
    public void setactualizarLista(int i,String Actualizar){
      this.lista.set(i, Actualizar);
    }
    
    
      public int getlistaCounter() {
        return lista.size();
    }
    

    //este medodo solo es para comprobar que lo vacie en un arreglo
    public void imprimirlista(){
        for(int i=0;i<this.lista.size();i++){
            System.out.println(lista.get(i));
        }
    }
    
    //este medodo solo es para comprobar que lo vacie en un arreglo
    public void imprimirlistados(){
       for(int i=0;i<this.lista.size();i=1+3){
        System.out.println(lista.get(i));
        }
    }
    
    public String getContentFile(){
     String content = "";
     int i;
     for(i=0;i<lista.size();i++){
         content+=lista.get(i)+ "\n"; 
     }
     System.out.println(content);
    return content;
    }
    
    //este medodo solo es para comprobar que lo vacie en un arreglo
    public void imprimirOpciones(){
        for(int i=0;i<this.lista.size();i=1+3){
        System.out.println(lista.get(i+1));
        System.out.println(lista.get(i+2));
        }
    }
    
    
    //cierro el archivo
    public void closeFile(){
        file.close();
    }    
    
    
}
