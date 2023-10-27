/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2023.solid;

/**
 *
 * @author miguelcatalan
 */
public class ImpuestoSobreLaRenta implements CalcularImpuesto {
    private float impuesto;
    
    public float calcularImpuestos(float ingresos) {
        impuesto = ingresos * 0.01f;
        return impuesto;
    }
}
