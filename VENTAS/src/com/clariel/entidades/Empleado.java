package com.clariel.entidades;

public class Empleado {
	
	protected int idEmpleado;
	protected int idCargo;
	protected String nombre_empleado;
	protected String apellido_empleado;
	protected String usuario;
	protected String contrasenia;
	
	
	public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpledo(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    
    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int id_cargo) {
        this.idCargo = id_cargo;
    }
    
    public String getNombreEmpleado() {
        return nombre_empleado;
    }

    public void setNombreEmpleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }
    
    public String getApellidoEmpleado() {
        return apellido_empleado;
    }

    public void setApellidoEmpleado(String apellido_empleado) {
        this.apellido_empleado = apellido_empleado;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    

}
