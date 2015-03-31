/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.JOptionPane;


public class ConversorDolaresPesos extends ConversorMonedas {
    
    public ConversorDolaresPesos(){
        
        super(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del Dolar")));
    }
    
    public double dolaresApesos(double cantidad){
        
        return dolaresAmoneda(cantidad);
    }
    
    public double pesosAdolares(double cantidad){
        
        return monedaAdolares(cantidad);
    }
}
