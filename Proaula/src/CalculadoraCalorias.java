/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pynky
 */
public class CalculadoraCalorias {
    
    public static double calcularCalorias(int edad, int estatura, double peso, String genero, String actividad) {
        double tmb;
        
        if (genero.equals("Masculino")) {
            tmb = 10 + (6.25 * peso) + (5 * estatura) - (5 * edad);
        } else {
            tmb = 10 + (6.25 * peso) + (5 * estatura) - (161 * edad);
        }
        
        if (actividad.equals("Sedentario")) return tmb * 1.2;
        if (actividad.equals("Moderado")) return tmb * 1.55;
        if (actividad.equals("Activo")) return tmb * 1.9;
        
        return tmb * 1.2;
    }
    
    public static String getRecomendacion(double calorias) {
        if (calorias < 1500) return "Recomendación: Considera aumentar tu actividad física";
        if (calorias > 2500) return "Recomendación: Mantén un balance en tu dieta";
        return "Recomendación: ¡Excelente! Tu consumo calórico es adecuado";
    }
}
