/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024.clase13.patronesdisenio.decorador;

/**
 *
 * @author miguelcatalan
 */
public class CremaChantilli extends Decorador {

    private Bebida bebida;
    
    public CremaChantilli(Bebida bebida) {
        this.bebida = bebida;
    }
    
    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Crema Chantilli";
    }

    @Override
    public double precio() {
        return bebida.precio() + 5.00;
    }
    
}
