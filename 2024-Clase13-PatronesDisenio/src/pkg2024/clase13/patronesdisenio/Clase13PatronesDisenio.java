/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2024.clase13.patronesdisenio;

import pkg2024.clase13.patronesdisenio.decorador.Bebida;
import pkg2024.clase13.patronesdisenio.decorador.Cocoa;
import pkg2024.clase13.patronesdisenio.decorador.CremaChantilli;
import pkg2024.clase13.patronesdisenio.decorador.Espresso;
import pkg2024.clase13.patronesdisenio.decorador.HouseBlend;
import pkg2024.clase13.patronesdisenio.observador.EstacionClima;
import pkg2024.clase13.patronesdisenio.observador.SmartPhone;
import pkg2024.clase13.patronesdisenio.observador.Insivumeh;

/**
 *
 * @author miguelcatalan
 */
public class Clase13PatronesDisenio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        /*
       EstacionClima estacionClima = new EstacionClima();
       
       SmartPhone smartPhone = new SmartPhone(estacionClima);
       Insivumeh insivumeh = new Insivumeh(estacionClima);
       
       estacionClima.setMediciones(12, 13, 14);
       estacionClima.setMediciones(14, 15, 16);
*/
        
        Bebida houseBlend = new HouseBlend();
        System.out.println(houseBlend.getDescripcion() + 
                " GTQ" + houseBlend.precio());
        
        houseBlend = new CremaChantilli(houseBlend);
        houseBlend = new Cocoa(houseBlend);
        System.out.println(houseBlend.getDescripcion() + 
                " GTQ" + houseBlend.precio());
        
        Bebida espresso = new Espresso();
        System.out.println(espresso.getDescripcion() + 
                " GTQ" + espresso.precio());
        
    }
    
}
