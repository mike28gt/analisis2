/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024.clase09.arquitecturamvc.controller;

import pkg2024.clase09.arquitecturamvc.view.UsuarioView;
import pkg2024.clase09.arquitecturamvc.model.UsuarioModel;

/**
 *
 * @author miguelcatalan
 */
public class UsuarioController {
    
    private UsuarioModel usuarioModel;
    private UsuarioView usuarioView;
    
    public UsuarioController(UsuarioModel usuarioModel,
                             UsuarioView usuarioView) {
        this.usuarioModel = usuarioModel;
        this.usuarioView = usuarioView;
    }
    
    public void agregarUsuario(String usuario) {
        if (usuario != null && !usuario.trim().isEmpty()) {
            usuarioModel.agregarUsuario(usuario);
            usuarioView.mostrarMensaje("Usuario agregado: " + usuario);
        } else {
            usuarioView.mostrarMensaje("El nombre de usuario no es válido.");
        }
    }
    
    public void mostrarUsuarios() {
        usuarioView.mostrarUsuarios(usuarioModel.getUsuarios());
    }
    
}
