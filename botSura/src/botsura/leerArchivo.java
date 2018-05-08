/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botsura;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author japb1
 */
public class leerArchivo {
    public String matricula;
    public String correo;
    public ArrayList<String> lista;
    Scanner file;
  
    
    public leerArchivo(String Archivo){
        
    this.lista =new ArrayList<>();  
    try {
        file = new Scanner(new File(Archivo));
        } catch (FileNotFoundException ex){
           // Logger.getLogger(FileReader.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
    while (file.hasNextLine()!=false){
         lista.add(file.nextLine());
        }
       file.close();    
    }   
    
    
    
    public boolean identificarse(){
       boolean existe=false;
       int i = 0;
       
       if(i!=-1){
           existe=true;
       }
       
        return existe;
    }
    
    
    //concatenar la nueva matricula
    
    public void actualizarTrabajador(String respuestas){
       String content = "";
       content+= matricula + "," + correo + "," + respuestas;
    }
    public ArrayList<String> getlista() {
        return lista;
    }
    
    
    public int getlistaCounter(){
        return lista.size();
    }
    
    
    
    public void closeFile(){
        file.close();
    } 

}