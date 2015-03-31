/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import view.*;
import model.*;

import java.awt.event.ActionListener;


public class ControlConversor implements ActionListener {
    
    private InterfaceVista vista;
    private ConversorDolaresPesos modelo;
    private ConversorMonedas modelo1;
    
    public ControlConversor(InterfaceVista vista, ConversorDolaresPesos modelo, ConversorEuro modelo1){
    
        this.vista = vista;
        this.modelo = modelo;
        this.modelo1=modelo1;
    }
    
    @Override
    public void actionPerformed(ActionEvent evento){
    
                
        double cantidad = vista.getCantidad();
        
        if(evento.getActionCommand().equals(vista.ADOLARES)){
        
            vista.escribeCambio(cantidad + " pesos son: " + modelo.pesosAdolares(cantidad) + " dolares");
        }
        
        else if(evento.getActionCommand().equals(vista.APESOS)){
            
            vista.escribeCambio(cantidad + " dolares son: " + modelo.dolaresApesos(cantidad) + " pesos");
        }
        
        else if (evento.getActionCommand().equals(vista.AEUROS)){
            vista.escribeCambio(cantidad + " pesos son : "+modelo1.euroAmoneda(cantidad)+ " euros");
        }
        
        else if (evento.getActionCommand().equals(vista.PESOSAEUROS)){
            vista.escribeCambio(cantidad + " euros son : "+ modelo1.pesosAeuros(cantidad)+ " a pesos");
        }
        
        else{
            
            vista.escribeCambio("ERROR");
        }
    }
}
