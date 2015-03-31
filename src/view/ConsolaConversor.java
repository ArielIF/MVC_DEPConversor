/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.*;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.awt.event.ActionEvent;


public class ConsolaConversor implements InterfaceVista {
    
    private ControlConversor control;
    
    private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    

    private int leeOpcion(){
        
        String s = null;
        try{
            
            s = in.readLine();
            return Integer.parseInt(s);
        }catch(Exception e){
            
            operacionIncorrecta();
            return 0;
        }
    }
    
    private double leeCantidad(){
        
        String s = null;
        try{
        
            s = in.readLine();
            return Double.parseDouble(s);
        }catch(Exception e){
            
            System.out.println("Error eb firnati dek nynerim tuebe qye ser 00.00: ");
            return leeCantidad();
        }
    }
    
    private void solicitaOperacion(){
        
        System.out.println("\t\t**********MENU***********");
        System.out.println("\t\t=========================");
        System.out.println("[1] Convertir dolares a pesos");
        System.out.println("[2] Convertir pesos a dolares");
        System.out.println("[3] Salir");
    }
    
    private void procesaNuevaOperacion(){
        
        int operacion;
        solicitaOperacion();
        operacion = leeOpcion();
        
        //Cuando agrega el nuevo evento, se cae
        if(operacion == 1) control.actionPerformed(new ActionEvent(this, operacion, ADOLARES));
        if(operacion == 2) control.actionPerformed(new ActionEvent(this, operacion, APESOS));
        if(operacion == 3){
            System.out.println("Hasta luego");
            System.exit(0);
        }
        
        operacionIncorrecta();
    }
    
        private void operacionIncorrecta(){
        
        System.out.println("Operacion incorrecta.");
        procesaNuevaOperacion();
    }
    
    @Override
    public void setControl(ControlConversor c){
    
        control = c;
    }
    
    @Override
    public void arrancar(){
        
        procesaNuevaOperacion();
    }
    
    @Override
    public double getCantidad(){
        
        System.out.print("Cantidad a convertir (formato 99.99): ");
        return leeCantidad();
    }
    
    @Override
    public void escribeCambio(String s){
        
        System.out.println(s);
        procesaNuevaOperacion();
    }
}
