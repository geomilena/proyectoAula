/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pynky
 */
public class ValidadorDatosFisicos {
    
    public static String getMensajeErrorEdad(String edad) {
        if (edad == null || edad.trim().isEmpty()) {
            return "La edad es obligatoria";
        }
        try {
            int edadNum = Integer.parseInt(edad);
            if (edadNum < 1 || edadNum > 120) {
                return "La edad debe estar entre 1 y 120 años";
            }
        } catch (NumberFormatException e) {
            return "La edad debe ser un número válido";
        }
        return null; // No hay error
    }
    
    public static String getMensajeErrorEstatura(String estatura) {
        if (estatura == null || estatura.trim().isEmpty()) {
            return "La estatura es obligatoria";
        }
        try {
            int estaturaNum = Integer.parseInt(estatura);
            if (estaturaNum < 50 || estaturaNum > 250) {
                return "La estatura debe estar entre 50 y 250 cm";
            }
        } catch (NumberFormatException e) {
            return "La estatura debe ser un número válido";
        }
        return null;
    }
    
    public static String getMensajeErrorPeso(String peso) {
        if (peso == null || peso.trim().isEmpty()) {
            return "El peso es obligatorio";
        }
        try {
            double pesoNum = Double.parseDouble(peso);
            if (pesoNum < 2 || pesoNum > 300) {
                return "El peso debe estar entre 2 y 300 kg";
            }
        } catch (NumberFormatException e) {
            return "El peso debe ser un número válido";
        }
        return null;
    }
}
