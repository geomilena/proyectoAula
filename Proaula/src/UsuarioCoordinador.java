/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marii
 */
public class UsuarioCoordinador extends Usuario {
    
    private String area;
    private String codigo;
    private String id;
    private String cargo;

    public UsuarioCoordinador() {
        super("", "", "", "");
        this.area = "";
        this.codigo = "";
        this.id = "";
        this.cargo = "";
    }

    public UsuarioCoordinador(String nombre, String apellidos, String correo, String contraseña, 
                              String area, String codigo, String id, String cargo) {
        super(nombre, apellidos, correo, contraseña);
        this.area = area;
        this.codigo = codigo;
        this.id = id;
        this.cargo = cargo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {  
        this.codigo = codigo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {           
        this.id = id;    
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {     
        this.cargo = cargo;
    }

    
    public String getTipoUsuario() {
        return "Coordinador";
    }
}
