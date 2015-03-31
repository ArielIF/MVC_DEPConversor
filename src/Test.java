
import controller.ControlConversor;
import model.ConversorDolaresPesos;
import model.ConversorEuro;
import model.ConversorMonedas;
import view.VentanaConversor;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


public class Test {
    public static void main(String []args){
        ConversorDolaresPesos pesos= new ConversorDolaresPesos();
        ConversorEuro e= new ConversorEuro();
        
        VentanaConversor v= new VentanaConversor();
        ControlConversor c = new ControlConversor(v, pesos,e);
        
        
        v.setControl(c);
        v.arrancar();
    }
}
