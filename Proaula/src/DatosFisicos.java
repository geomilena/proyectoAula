/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pynky
 */
public class DatosFisicos {
    private int edad;
    private int estatura;
    private double peso;
    private String genero;
    private String actividad;
    private double caloriasDiarias;
    
    public DatosFisicos(int edad, int estatura, double peso, String genero, String actividad) {
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
        this.genero = genero;
        this.actividad = actividad;
        this.caloriasDiarias = calcularCalorias();
    }
    
    private double calcularCalorias() {
        
        double tmb;
        
        if (genero.equalsIgnoreCase("Masculino")) {
            tmb = 88.362 + (13.397 * peso) + (4.799 * estatura) - (5.677 * edad);
        } else {
            tmb = 447.593 + (9.247 * peso) + (3.098 * estatura) - (4.330 * edad);
        }
        
      
        double factorActividad = obtenerFactorActividad();
        return tmb * factorActividad;
    }
    
    private double obtenerFactorActividad() {
        switch(actividad.toLowerCase()) {
            case "sedentario":
                return 1.2; 
            case "moderado":
                return 1.55; 
            case "activo":
                return 1.725; 
            default:
                return 1.2; 
        }
    }
    
    
    
    
    public int getEdad() {
        return edad; 
    }
    public int getEstatura() {
        return estatura; 
    }
    public double getPeso() {
        return peso;
    }
    public String getGenero() {
        return genero;
    }
    public String getActividad() { 
        return actividad;
    }
    public double getCaloriasDiarias() {
        return caloriasDiarias;
    }
    
    public String getRecomendacion() {
        if (caloriasDiarias < 1500) {
            return "Recomendación: Considera aumentar tu actividad física para un mejor metabolismo";
        } else if (caloriasDiarias > 2500) {
            return "Recomendación: Mantén un balance adecuado entre dieta y ejercicio";
        } else {
            return "Recomendación: ¡Excelente! Tu consumo calórico es adecuado para tu estilo de vida";
        }
    }
    
    public String getResumen() {
        return String.format(
            "Edad: %d años | Estatura: %d cm | Peso: %.1f kg | Género: %s | Actividad: %s",
            edad, estatura, peso, genero, actividad
        );
    }
}
