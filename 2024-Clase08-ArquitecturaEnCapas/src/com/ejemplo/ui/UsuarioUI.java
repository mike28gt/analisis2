/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.ui;

import com.ejemplo.service.UsuarioService;
import java.util.Scanner;

/**
 *
 * @author miguelcatalan
 */
public class UsuarioUI {
    
    private UsuarioService usuarioService = new UsuarioService();
    
    public void mostrarMenu() {
        
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            System.out.println("1.- Listar usuarios");
            System.out.println("2.- Agregar usuario");
            System.out.println("3.- Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = Integer.valueOf(scan.nextLine());
            
            switch(opcion) {
                case 1: listarUsuarios();
                        break;
                case 2: System.out.print("Ingrese nombre de usuario: ");
                        String usuario = scan.nextLine();
                        agregarUsuario(usuario);
                        break;
                case 3: System.out.println("Saliendo del sistema...");
                        scan.close();
                    break;
                default: System.out.println("Opción no válida.");
            }
        }    
    }
    
    private void listarUsuarios() {
        for (String user : usuarioService.getUsers()) {
            System.out.println("- " + user);
        }
    }
    
    private void agregarUsuario(String usuario) {
        try {
            usuarioService.agregarUsuario(usuario);
            System.out.println("Usuario agregado exitosamente.");
        } catch (IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
}
