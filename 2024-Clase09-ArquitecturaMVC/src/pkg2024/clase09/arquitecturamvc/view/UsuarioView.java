/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024.clase09.arquitecturamvc.view;

import java.util.List;
import pkg2024.clase09.arquitecturamvc.model.Usuario;

/**
 *
 * @author miguelcatalan
 */
public class UsuarioView {
    
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
    
    public void mostrarUsuarios(List<Usuario> usuarios) {
        System.out.println("Listado de usuarios:");
        for (Usuario usuario : usuarios) {
            System.out.println("- " + usuario.getNombre());
        }
    }
}