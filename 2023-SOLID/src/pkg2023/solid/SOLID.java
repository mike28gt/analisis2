/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2023.solid;

/**
 *
 * @author miguelcatalan
 */
public class SOLID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Employee e1 = new Employee();
        EmployeeFacade e1 = new EmployeeFacade();
        
        //e1.calculatePay();
        //e1.reportHours();
        //e1.save();
        
        Billing b1 = new Billing();
        //b1.calcBilling();
        
        Rectangulo r1 = new Rectangulo();
        //r1.setAlto(10);
        //r1.setLargo(12);
        
        Rectangulo r2 = new Cuadrado();
        //r2.setAlto(5);
        
        //ImpuestoSobreLaRenta isr = new ImpuestoSobreLaRenta();
        CalcularImpuesto isr = new ImpuestoSobreLaRenta();
        System.out.println(isr.calcularImpuestos(100));
       
        
    }
    
}
