/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2024.clase07.solid;

import pkg2024.clase07.solid.lsp.Paquete;
import pkg2024.clase07.solid.lsp.PaquetePremium;
import pkg2024.clase07.solid.lsp.PaqueteStandard;
import pkg2024.clase07.solid.ocp.Dosis;
import pkg2024.clase07.solid.ocp.Rumiante;

/**
 *
 * @author miguelcatalan
 */
public class Clase07SOLID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //System.out.println(calcularDosisMedicamento(new Rumiante()));
        
        Paquete p1 = new PaqueteStandard();
        System.out.println(p1.obtenerPaquete());
        
        
    }
    
    public static float calcularDosisMedicamento(Dosis paciente) {
        return paciente.dosisASuministrar();
    }
    
}
