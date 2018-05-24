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
    
      /*int valor;
      leerArchivo buscar= new leerArchivo("base1.txt");
      valor=buscar.buscarTrabajador("113","perro");
      System.out.println(valor);
      Trabajador busc= new Trabajador("111","facebook");
        int buscarTrabajador = busc.buscarTrabajador();
      
      busc.actualizarArchivo("aprobado");*/
      
      
       inicio view = new inicio();
       Trabajador mod = new Trabajador();
       
               
      
       ControllerInicio ctrl = new ControllerInicio(view,mod);
       ctrl.inciar();
       view.setVisible(true);
       
    }
}
