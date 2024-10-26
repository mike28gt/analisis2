/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024.clase13.patronesdisenio.observador;

import java.util.ArrayList;

/**
 *
 * @author miguelcatalan
 */
public class EstacionClima implements Sujeto {

    private float humedad;
    private float temperatura;
    private float presion;
    private ArrayList<Observador> observadores;

    public EstacionClima() {
        this.observadores = new ArrayList<>();
    }
    
    @Override
    public void registrarObservador(Observador o) {
        this.observadores.add(o);
    }

    @Override
    public void eliminarObservador(Observador o) {
        int i = this.observadores.indexOf(o);
        if (i >= 0) {
            this.observadores.remove(i);
        }
    }

    @Override
    public void notificarObservadores() {
        for (int i = 0; i < this.observadores.size(); i++) {
            Observador observador = this.observadores.get(i);
            observador.actualizar(temperatura, humedad, presion);
        }
    }
    
    public void setMediciones(float humedad, float temperatura, float presion) {
        this.humedad = humedad;
        this.temperatura = temperatura;
        this.presion = presion;
        
        notificarObservadores();
        
    }
    
}
