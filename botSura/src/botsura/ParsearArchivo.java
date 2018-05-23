/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botsura;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
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
    //AQUI ESTOY PRESENCIADO UN ERROR DE PRGRMACIOM
    public String[] parsingContent(){
        
        String[] parsing= content.split(",");
       for(int i = 0; i<parsing.length; i++) {
       System.out.println(parsing[i]);
       }
        return parsing;
    }
    
    //EL MISMO ERROR SOLO FUNCIONA SI EL VALOR BUSCADO ESTA EN LA PRIMERA LINEA
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
