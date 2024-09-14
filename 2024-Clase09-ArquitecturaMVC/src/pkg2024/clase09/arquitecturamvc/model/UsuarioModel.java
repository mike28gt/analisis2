/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024.clase09.arquitecturamvc.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author miguelcatalan
 */
public class UsuarioModel {
    
    private List<Usuario> usuarios = new ArrayList();
    
    public void agregarUsuario(String nombre) {
        usuarios.add(new Usuario(nombre));
    }
    
    public List<Usuario> getUsuarios() {
        return usuarios;
    }
}
