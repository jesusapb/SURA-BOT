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
    Scanner file;
    public ArrayList<String> lista;
    
    public leerArchivo(String archivo){

    this.lista =new ArrayList<>();  
    try {
            file = new Scanner(new File(archivo));
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    while (file.hasNextLine()){
         lista.add(file.nextLine());
        }
    }
    
    
    
    
    public ArrayList<String> getlista() {
        return lista;
    }
    public void borrarTrabajador(int i){
        lista.remove(i);
    }
    
    public void setactualizarLista(int i,String Actualizar){
      this.lista.set(i, Actualizar);
    }
    
    
      public int getlistaCounter() {
        return lista.size();
    }

    
    //actualizar el archivo
     public void ActualizarArchivo(int linea, String Actualizacion){
       FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("base1.txt");
            pw = new PrintWriter(fichero);
                lista.set(linea, Actualizacion);
            for (int i = 0; i < lista.size(); i++){
              pw.println(lista.get(i));
               
            }    
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
    //en la forma en la que se creo el metodo permite añadir mas informacion ademas de la contraseña y matricula
    public int buscarTrabajador(String matricula, String contra){
       int k=-1;
       for(int i=0;i<lista.size();i++){
           String[] buscar=lista.get(i).split(",");
          if(buscar[0].equals(matricula) && buscar[1].equals(contra)){
              k=i;
          }
       }
       return k;
    }
    
    
    
    //cierro el archivo
    public void closeFile(){
        file.close();
    }    
    
    
}
