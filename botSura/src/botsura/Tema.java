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
   /* 
    //este medodo solo es para comprobar que lo vacie en un arreglo
    public void imprimirContenido(){
        for(int i=0;i<this.temas.size();i=i+2){
        System.out.println(temas.get(i));
        }
    }    
    
    */
    
    
}
