/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marii
 */
public class ValidarDatosCoo {
  public static boolean validarNombre(String nombre) {
        if (nombre == null) return false;
        String nomLimpio = nombre.trim();
        return !nomLimpio.isEmpty() && nomLimpio.length() >= 2;
    }
    
    public static boolean validarApellidos(String apellidos) {
        if (apellidos == null) return false;
        String apeLimpios = apellidos.trim();
        return !apeLimpios.isEmpty() && apeLimpios.length() >= 2;
    }
    
    public static boolean validarCorreo(String correo) {
        if (correo == null) return false;
        String corrLimpio = correo.trim();
        return !corrLimpio.isEmpty() && 
               corrLimpio.contains("@") && 
               corrLimpio.contains(".");
    }
    
    public static boolean validarClave(String clave) {
        return clave != null && !clave.isEmpty() && clave.length() >= 4;
    }
    public static boolean validarArea(String area){
       if (area == null) return false;
        String areaLimpia = area.trim();
        return !areaLimpia.isEmpty() && areaLimpia.length() >= 2;
    }
      public static boolean validarCodigo(String codigo){
       if (codigo == null) return false;
        String codigoLiompio = codigo.trim();
        return !codigoLiompio.isEmpty() && codigoLiompio.length() >= 2;
    }
    
    public static boolean validarId(String id){
        if (id == null) return false;
        String idLimpio = id.trim();
        return !idLimpio.isEmpty() && idLimpio.matches ("[0-9]+");
    }
    
    public static boolean validarCargo(String cargo){
    if (cargo == null) return false;
        String cargoLimpio = cargo.trim();
        return !cargoLimpio.isEmpty() && cargoLimpio.length() >= 3;
}
}