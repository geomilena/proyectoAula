/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pynky
 */
public class UsuarioNormal extends Usuario {
    
    public UsuarioNormal(String nombre, String apellidos, String correo, String contraseña) {
        super(nombre, apellidos, correo, contraseña);
    }
    
    public UsuarioNormal(String correo, String contraseña) {
        super(correo, contraseña);
    }
    
    @Override
    public String getTipoUsuario() {
        return "Usuario Normal";
    }
}
