/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024.clase13.patronesdisenio.observador;

/**
 *
 * @author miguelcatalan
 */
public class SmartPhone implements Observador {

    private float temperatura;
    private float presion;
    private float humedad;
    private Sujeto sujeto;

    public SmartPhone(Sujeto sujeto) {
        this.sujeto = sujeto;
        sujeto.registrarObservador(this);
    }

    @Override
    public void actualizar(float temperatura, float humedad, float presion) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.presion = presion;
        visualizar();
    }
    
    public void visualizar() {
        System.out.println("SmartPhone - Condiciones climáticas: " +
                this.temperatura + " gracos celcius, " +
                this.humedad + " % de humedad y " +
                this.presion + " unidades de presión.");
    }
    
    
    
}
