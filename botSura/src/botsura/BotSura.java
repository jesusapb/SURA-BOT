/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botsura;

import java.util.Arrays;

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
      ParsearArchivo busc= new ParsearArchivo();
      busc.getString();
      
      System.out.println(busc.validarTrabajador(busc.parsingContent(),"111", "facebook"));
      
      
    }
    
}
