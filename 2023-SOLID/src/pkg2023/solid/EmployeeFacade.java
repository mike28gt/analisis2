/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2023.solid;

/**
 *
 * @author miguelcatalan
 */
public class EmployeeFacade {
    private PayCalculator pc = new PayCalculator();
    private HourReporter hr = new HourReporter();
    private EmployeeSaver es = new EmployeeSaver();
   
    public void calculatePay() {
        //System.out.println("Calcular pagos 2.");
        pc.calculatePay();
    }
    
    public void reportHours() {
        //System.out.println("Reportar horas 2.");
        hr.reportHours();
    }
    
    public void save() {
        //System.out.println("Guardar empleado 2.");
        es.saveEmployee();
    }
}
