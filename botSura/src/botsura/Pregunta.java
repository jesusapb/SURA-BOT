
package botsura;


/**
 *
 * @author japb1
 */
public class Pregunta {
   String archivo;
   leerArchivo preguntas;
   
    //el constructor abre el archivo, lo lee y vacea el contenido en un arreglo dinamico
    public Pregunta(){
   this.archivo="quiz1.txt";
   preguntas= new leerArchivo(this.archivo);    
     
   }
    
   public String optenerpregunta(int i){
       String cadena="";
       // para dos lineas
       cadena= preguntas.lista.get(i) + "\n"+ preguntas.lista.get(i+1)+"\n"+ preguntas.lista.get(i+2) +"\n" + preguntas.lista.get(i+3);
       
       
       
       return cadena;
   }
     
}
