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
public class trabajador {
    public String matricula;
    public String correo;
    public ArrayList<String> listaMat;
    Scanner file;
    /**
     *
     * @param matricula
     * @param correo
     */
    
    public trabajador(String matricula, String correo){
        
        this.matricula = matricula;
        this.correo=correo;
    //el constructor abre el archivo, lo lee y vacea el contenido en un arreglo dinamic
    this.listaMat =new ArrayList<String>();  
    try {
        file = new Scanner(new File("base1.txt"));
        } catch (FileNotFoundException ex) {
           // Logger.getLogger(FileReader.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
    while (file.hasNextLine()){
         listaMat.add(file.nextLine());
        }
       file.close();    
    }    
        
    //hay que parsear el archivo
    //se borrara del arreglo
    
    public void borrarTrabajador(int i){
        listaMat.remove(i);
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
    
   
    
    public String getMatricula(){
        return matricula;
    }
    
    public String setMatricula(){
        return matricula;
    }
    
    public String getCorreo(){
        return correo;
    }
    
    
    
    public ArrayList<String> getlistaMat() {
        return listaMat;
    }
    
    public int getlistaMatCounter(){
        return listaMat.size();
    }
    
    
    //esta clase es la unica que elimina y edita el archivo
    public void ActualizarArchivo(int linea, String Actualizacion){
       FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("base1.txt");
            pw = new PrintWriter(fichero);
                listaMat.set(linea,Actualizacion);
            for (int i = 0; i < listaMat.size(); i++)
               // if(i!=linea){
                pw.println(listaMat.get(i));
                //}else{
                  //  pw.println(Actualizacion +"\n");
                //} 
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
    
    
    
    public void closeFile(){
        file.close();
    } 

}