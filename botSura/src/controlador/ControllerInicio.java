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
    
        //creamos el contructor de la clase con la vista y el modelo
    public ControllerInicio(inicio view,Trabajador model){
        this.model =model;
        this.view = view;
        this.view.Trabajador.addActionListener(this); //acción del botón.
    }
        //método para iniciar la vista
    public void inciar(){
        view.setTitle("Inicio"); //titulo
        view.setLocationRelativeTo(null); //posicion.
        view.setVisible(true);
    }
    
    @Override  //función que realiza el botón
    public void actionPerformed(ActionEvent e) {
       Trabajador t= new Trabajador(view.matricula.getText(),view.correo.getText()); 
      int valor;
<<<<<<< HEAD
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
=======
      if(e.getSource()== view.Trabajador){ //si se realiza el evento con ese botón, entonces
        valor=t.buscarTrabajador(); //Devuelve -1 si no se escontro el trabajador.
        if(valor>=0){ //pasa a la siguinte ventana
        ventana1 abrir = new ventana1();
        abrir.setVisible(true);
        }
        else{ //Se queda para pedir la matricula una vez más
        view.setTitle("Matricula incompleta");
        inicio abrir= new inicio();
        abrir.setVisible(true);
>>>>>>> master
        }
      }
    }



}
