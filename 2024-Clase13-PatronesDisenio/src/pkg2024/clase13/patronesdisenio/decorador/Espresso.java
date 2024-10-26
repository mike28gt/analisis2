/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024.clase13.patronesdisenio.decorador;

/**
 *
 * @author miguelcatalan
 */
public class Espresso extends Bebida {

    public Espresso() {
        descripcion = "Espresso";
    }
    
    @Override
    public double precio() {
        return 20.00;
    }
    
}
