/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024.clase07.solid.dip;

/**
 *
 * @author miguelcatalan
 */
public class Veterinario implements CitaVeterinario {
    
    @Override
    public void administrarMedicamento() {
        System.out.println("Se esta administrando medicamento");
    }
    
    @Override
    public void inspeccionarPaciente() {
        System.out.println("Se esta inspeccionando al paciente.");
    }
}
