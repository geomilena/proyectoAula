/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pynky
 */
public class ValidadorFormulario {
    
    public static boolean validarNombre(String nombre) {
        if (nombre == null) return false;
        String nombreLimpio = nombre.trim();
        return !nombreLimpio.isEmpty() && nombreLimpio.length() >= 2;
    }
    
    public static boolean validarApellidos(String apellidos) {
        if (apellidos == null) return false;
        String apellidosLimpios = apellidos.trim();
        return !apellidosLimpios.isEmpty() && apellidosLimpios.length() >= 2;
    }
    
    public static boolean validarCorreo(String correo) {
        if (correo == null) return false;
        String correoLimpio = correo.trim();
        return !correoLimpio.isEmpty() && 
               correoLimpio.contains("@") && 
               correoLimpio.contains(".");
    }
    
    public static boolean validarClave(String clave) {
        return clave != null && !clave.isEmpty() && clave.length() >= 4;
    }
}