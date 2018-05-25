package botsura;

import controlador.ControllerInicio;
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
    
     
      
      //creamos 2 objetos para llamar al controlador
       inicio view = new inicio();
       Trabajador mod = new Trabajador();
       
               
      //llamamos al controlador
       ControllerInicio ctrl = new ControllerInicio(view,mod);
       ctrl.inciar(); //iniciamos la primera ventana
       view.setVisible(true); 
       
    }
}
