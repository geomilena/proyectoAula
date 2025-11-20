public class Usuario {
    private String nombre;
    private String apellidos;
    private String correo;
    private String contraseña;
    
    public Usuario(String nombre, String apellidos, String correo, String contraseña) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.contraseña = contraseña;
    }
    
    public Usuario(String correo, String contraseña) {
        this.nombre = "";
        this.apellidos = "";
        this.correo = correo;
        this.contraseña = contraseña;
    }
    
    public String getNombre() { 
        return nombre;
    }
    public String getApellidos() {
        return apellidos; 
    }
    public String getCorreo() {
        return correo; 
    }
    public String getContraseña() {
        return contraseña;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos) { 
        this.apellidos = apellidos; 
    }
    public void setCorreo(String correo) {
        this.correo = correo; 
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
