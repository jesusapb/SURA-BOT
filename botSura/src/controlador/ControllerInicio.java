/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
//package botsura;

import botsura.Trabajador;
import botsura.leerArchivo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.inicio;
import vista.ventana1;

/**
 *
 * @author japb1
 */
public class ControllerInicio implements ActionListener{
        //LA VISTA
    private inicio view;
    // EL MODELO
    
    private Trabajador model;
    private leerArchivo LE;
    
    public ControllerInicio(inicio view,Trabajador model){
        this.model =model;
        this.view = view;
        this.view.Trabajador.addActionListener(this);
    }
    
    public void inciar(){
        view.setTitle("Inicio");
        view.setLocationRelativeTo(null);
        view.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       Trabajador t= new Trabajador(view.matricula.getText(),view.correo.getText());
      int valor;
      if(e.getSource()== view.Trabajador){
        valor=t.buscarTrabajador();
        if(valor>=0){
        ventana1 abrir = new ventana1();
        abrir.setVisible(true);
        }
        else{
        view.setTitle("Matricula incompleta");
        inicio abrir= new inicio();
        abrir.setVisible(true);
        }
      }
    }


    //aqui se implementara la busqueda si existe el trabajador
    
  
    
    
    
    //aqui se implentara la actualizacion del archivo


}
