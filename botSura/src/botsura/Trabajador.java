
package botsura;


/**
 *
 * @author japb1
 */
public class Trabajador {
    public String matricula;
    public String correo;
    public String archivo;
    leerArchivo trabajadores;
    //public ArrayList<String> listaMat;
    //Scanner file;
    /**
     *
     * @param matricula
     * @param correo
     */
    
    public Trabajador(String matricula, String correo){
        this.archivo="base1.txt";
        
        
        this.matricula = matricula;
        
         this.correo=correo;
        
        trabajadores= new leerArchivo(archivo);
        
        
    }    

   public Trabajador() {
   }
  
   
    public int buscarTrabajador(){
        int i;
        i=trabajadores.buscarTrabajador(this.matricula, this.correo);
       
        return i;
    }
    
    
    
    //concatenar la nueva matricula el correo 
    //y el resultado del quiz para ser guardado en el archivo
    //
    public String cadenaActualizacion(String resultado){
       String content = "";
       content= matricula + "," + correo + "," + resultado;
     return content;
    }

    public  void actualizarArchivo(String resultado){
        int i;
        i=this.buscarTrabajador();
        if(i>=0){
        trabajadores.ActualizarArchivo(i,this.cadenaActualizacion(resultado));
        System.out.println("se actualizo con exito el archivo");
        
        }else{
        System.out.println("no se encontro al trababajador asi que el archivo no fue actualizado");
        }
       
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public leerArchivo getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(leerArchivo trabajadores) {
        this.trabajadores = trabajadores;
    }
    
    
    
 
    
   
   

}