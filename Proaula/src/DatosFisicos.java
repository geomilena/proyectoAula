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

    
    private double imc;
    private String estadoImc;
    
    public DatosFisicos(int edad, int estatura, double peso, String genero, String actividad) {
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
        this.genero = genero;
        this.actividad = actividad;
        
        this.caloriasDiarias = calcularCalorias(); // cálculo existente
        calcularIMC(); // cálculo nuevo
    }
    
    private double calcularCalorias() {
        double tmb;
        
        //tasa metabolica basal
        // Harris benedict
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
            case "sedentario": return 1.2;
            case "moderado": return 1.55;
            case "activo": return 1.725;
            default: return 1.2;
        }
    }

    
    private void calcularIMC() {
        double estaturaM = estatura / 100.0; // convertir cm a metros
        imc = peso / (estaturaM * estaturaM);

        if (imc < 18.5) {
            estadoImc = "Bajo peso";
        } else if (imc < 24.9) {
            estadoImc = "Normal";
        } else if (imc < 29.9) {
            estadoImc = "Sobrepeso";
        } else {
            estadoImc = "Obesidad";
        }
    }

    
    public double getImc() {
        return imc;
    }

    public String getEstadoImc() {
        return estadoImc;
    }
    
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad() { return edad; }
    public int getEstatura() { return estatura; }
    public double getPeso() { return peso; }
    public String getGenero() { return genero; }
    public String getActividad() { return actividad; }
    public double getCaloriasDiarias() { return caloriasDiarias; }

    public String getRecomendacion() {
        if (caloriasDiarias < 1500) {
            return " • Intenta caminar 30 minutos al día, "
                    + "incluso si es en casa o cerca.\n" +
"                • Evita comidas rápidas y procesadas. "
                    + "Prefiere vegetales, frutas y agua.\n" +
"                • Prueba hobbies relajantes como leer,"
                    + " escuchar música o colorear.";
        } else if (caloriasDiarias > 2500) {
            return "• Sigue con tu rutina, pero añade "
                    + "algo diferente como yoga o bicicleta.\n" +
"                • Come proteínas magras como pollo, "
                    + "huevos, legumbres y arroz integral.\n" +
"                • Puedes explorar hobbies como la fotografía "
                    + "o salir a caminar en la naturaleza.";
        } else {
            return "• ¡Sigue así! Incluye días de descanso o "
                    + "actividades suaves como estiramiento.\n" +
"                • Incrementa tus snacks saludables: nueces,"
                    + " yogur griego, batidos naturales.\n" +
"                • Aprovecha tu energía para explorar nuevos "
                    + "deportes o voluntariados físicos.";
        }
    }
    
    public String getResumen() {
        return String.format(
            "Edad: %d años | Estatura: %d cm | Peso: %.1f kg | Género: %s | Actividad: %s",
            edad, estatura, peso, genero, actividad
        );
    }
}
