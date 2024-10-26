/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024.clase13.patronesdisenio.decorador;

/**
 *
 * @author miguelcatalan
 */
public class HouseBlend extends Bebida {
    
    public HouseBlend() {
        descripcion = "House Blend";
    }

    @Override
    public double precio() {
        return 18.00;
    }
    
    
}
