/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControlConversor;


public interface InterfaceVista {

    static final String ADOLARES = "Pesos a dolares";
    static final String APESOS = "Dolares a pesos";
    static final String AEUROS = "Euros a pesos";
    static final String PESOSAEUROS= "Pesos a Euros";
    
    

    void setControl(ControlConversor c);

    void arrancar();

    double getCantidad();

    void escribeCambio(String s);
}
