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
        if (calorias < 1500) return "• Intenta caminar 30 minutos al día, incluso si es en casa o cerca.\n" +
"                                    • Evita comidas rápidas y procesadas. Prefiere vegetales, frutas y agua.\n" +
"                                    • Prueba hobbies relajantes como leer, escuchar música o colorear.";
        if (calorias > 2500) return " • Sigue con tu rutina, pero añade algo diferente como yoga o bicicleta.\n" +
"                                     • Come proteínas magras como pollo, huevos, legumbres y arroz integral.\n" +
"                                     • Puedes explorar hobbies como la fotografía o salir a caminar en la naturaleza.";
        return " • ¡Sigue así! Incluye días de descanso o actividades suaves como estiramiento.\n" +
"                • Incrementa tus snacks saludables: nueces, yogur griego, batidos naturales.\n" +
"                • Aprovecha tu energía para explorar nuevos deportes o voluntariados físicos.";
    }
}
