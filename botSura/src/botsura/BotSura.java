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
     


     ParsearArchivo busc= new ParsearArchivo();
     busc.getString();
      
      System.out.println(busc.validarTrabajador(busc.parsingContent(),"111", "facebook"));
      int valor;
      leerArchivo buscar= new leerArchivo("base1.txt");
      valor=buscar.buscarTrabajador("113","perro");
      System.out.println(valor);
      
    }
    
}
