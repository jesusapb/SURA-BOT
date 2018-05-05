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
        file = new Scanner(new File("base2.txt"));
        } catch (FileNotFoundException ex) {
           // Logger.getLogger(FileReader.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
    while (file.hasNextLine()){
         listaMat.add(file.nextLine());
        }
        //file.close();    
    }    
        
    //hay que parsear el archivo
    
    
    public int buscarTra(){
        
        return i;
    }
    
    
    
    
    public boolean identificarse(){
       boolean existe=false;
       int i;
       
       if(i!=-1){
           existe=true;
       }
       
        return existe;
    }
    
    
    //concatenar archivos
    
    public void actualizarDatos(String respuestas){
       String content = "";
       content+= matricula + "," + correo + "," + respuestas;
    }
    
   //esta clase es la unica que elimina y edita el archivo
    
    
    
    public String getMatricula(){
        return matricula;
    }
    
    public String setMatricula(){
        return matricula;
    }
    
    
    
    public String getCorreo(){
        return correo;
    }
    
    
    public void closeFile(){
        file.close();
    }    
    
    
}
