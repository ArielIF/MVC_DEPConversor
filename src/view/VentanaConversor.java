/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.*;

import java.awt.BorderLayout;
import javax.swing.*;


public class VentanaConversor extends JFrame implements InterfaceVista{
    
    private JButton convertirApesos;
    private JButton convertirAdolares;
    private JButton convertirAeuros;
    private JButton convertirEurosAPesos;
    private JTextField cantidad;
    private JLabel resultado;
    
    public VentanaConversor(){
        
        super("Conversor de Dolares,Pesos y Euros");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout(10,10));
        
        cantidad = new JTextField(8);
        JPanel panelaux = new JPanel();
        panelaux.add(cantidad);
        panelPrincipal.add(panelaux, BorderLayout.NORTH);
        
        resultado = new JLabel("Indique una cantidad y pulse uno de los botones");
        JPanel panelaux2 = new JPanel();
        panelaux2.add(resultado);
        panelPrincipal.add(panelaux2, BorderLayout.CENTER);
        
        convertirApesos = new JButton("A pesos");
        convertirApesos.setActionCommand(APESOS);
        convertirAdolares = new JButton("A dolares");
        convertirAdolares.setActionCommand(ADOLARES);
        convertirAeuros = new JButton("A euros");
        convertirAeuros.setActionCommand(AEUROS);
        convertirEurosAPesos = new JButton("A pesos");
        convertirEurosAPesos.setActionCommand(PESOSAEUROS);
        
        JPanel botonera = new JPanel();
        botonera.add(convertirApesos);
        botonera.add(convertirAdolares);
        botonera.add(convertirAeuros);
        botonera.add(convertirEurosAPesos);
        panelPrincipal.add(botonera, BorderLayout.SOUTH);
        getContentPane().add(panelPrincipal);
    }
    
    @Override
    public double getCantidad(){
        
        try{
            return Double.parseDouble(cantidad.getText());
        }catch(NumberFormatException e){
            return 0.0;
        }
    }
    
    @Override
    public void setControl(ControlConversor c){
        
        convertirApesos.addActionListener(c);
        convertirAdolares.addActionListener(c);
        convertirAeuros.addActionListener(c);
        convertirEurosAPesos.addActionListener(c);
    }
    
    @Override
    public void arrancar(){
        
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    @Override
    public void escribeCambio(String s){
        
        resultado.setText(s);
    }
}
