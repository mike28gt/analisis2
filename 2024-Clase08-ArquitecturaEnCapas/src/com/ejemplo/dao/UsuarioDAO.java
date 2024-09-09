/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.dao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author miguelcatalan
 */
public class UsuarioDAO {
    
    private List<String> usuarios = new ArrayList<>();
    
    public void agregarUsuario(String usuario) {
        usuarios.add(usuario);
    }
    
    public List<String> users() {
        return usuarios;
    }
    
}
