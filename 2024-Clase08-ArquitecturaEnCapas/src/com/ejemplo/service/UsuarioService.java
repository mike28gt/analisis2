/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.service;

import com.ejemplo.dao.UsuarioDAO;
import java.util.List;

/**
 *
 * @author miguelcatalan
 */
public class UsuarioService {
    
    private UsuarioDAO usuarioDao = new UsuarioDAO();
 
    public void agregarUsuario(String usuario) {
        
        if (usuario != null && !usuario.trim().isEmpty()) {
            usuarioDao.agregarUsuario(usuario);
        } else {
            throw new IllegalArgumentException("El nombre de usuario no es válido.");
        }
    }
    
    public List<String> getUsers() {
        return usuarioDao.users();
    }
    
}
