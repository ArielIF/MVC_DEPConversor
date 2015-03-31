/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class ConversorMonedas {
    
    private double cambio;
    
    public ConversorMonedas(double valorCambio){
        
        cambio = valorCambio;
    }
    
    public double dolaresAmoneda(double cantidad){
    
        return cantidad*cambio;
    }
    
    public double monedaAdolares(double cantidad){
        
        return cantidad/cambio;
    }
    public double pesosAeuros (double cantidad){
        return cantidad*cambio;
    }
    public double euroAmoneda(double cantidad){
        return cantidad/cambio;
    }
}
