/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2024.clase09.arquitecturamvc;

import java.util.Scanner;
import pkg2024.clase09.arquitecturamvc.controller.UsuarioController;
import pkg2024.clase09.arquitecturamvc.model.UsuarioModel;
import pkg2024.clase09.arquitecturamvc.view.UsuarioView;

/**
 *
 * @author miguelcatalan
 */
public class Clase09ArquitecturaMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UsuarioModel usuarioModel = new UsuarioModel();
        UsuarioView usuarioView = new UsuarioView();
        UsuarioController usuarioController = new UsuarioController(usuarioModel, usuarioView);
        
        Scanner scan = new Scanner(System.in);
        String usuario = scan.nextLine();
        usuarioController.agregarUsuario(usuario);
        
        usuarioController.mostrarUsuarios();
        
    }
    
}
