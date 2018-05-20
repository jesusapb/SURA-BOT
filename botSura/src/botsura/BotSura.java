package botsura;

import java.util.Arrays;
import vista.inicio;

/**
 *
 * @author japb1
 */
public class BotSura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
     //trabajador emp= new trabajador("hola","111");
      //emp.imprimir();
//<<<<<<< Updated upstream
      //ParsearArchivo busc= new ParsearArchivo();
     // busc.getString();
      inicio window = new inicio(); 
      window.setVisible(true);
      //System.out.println(busc.validarTrabajador(busc.parsingContent(),"111", "facebook"));
      Pregunta consulta= new Pregunta();
      System.out.println(consulta.optenerpregunta(0));
      
      Tema temit = new Tema();
     System.out.println(temit.imprimirTema(0));
//=======
     ParsearArchivo busc= new ParsearArchivo();
     busc.getString();
      
      System.out.println(busc.validarTrabajador(busc.parsingContent(),"444", "twitter"));
     

      // Pregunta consulta= new Pregunta();
      //System.out.println(consulta.optenerpregunta(0));
      
      //Tema temit = new Tema();
     //System.out.println(temit.imprimirTema(0));
//>>>>>>> Stashed changes
      
      
    }
    
}
