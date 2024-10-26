/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pkg2024.clase13.patronesdisenio.observador;

/**
 *
 * @author miguelcatalan
 */
public interface Sujeto {
    public void registrarObservador(Observador o);
    public void eliminarObservador(Observador o);
    public void notificarObservadores();
}
