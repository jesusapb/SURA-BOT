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
    
     
      
      
       inicio view = new inicio();
       Trabajador mod = new Trabajador();
       
               
      
       ControllerInicio ctrl = new ControllerInicio(view,mod);
       ctrl.inciar();
       view.setVisible(true);
       
    }
}
