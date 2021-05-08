package com.clariel.entidades;

public class Proveedor {
	
	protected int idProveedor;
	protected String nombre_proveedor;
	protected String direccion;
	protected String telefono;
	
	public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }
    
    public String getNombreProveedor() {
        return nombre_proveedor;
    }

    public void setNombreProveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }
    
    public String getDireccion() {    	
    	return direccion;
    }
    
    public void setDireccion(String direccion) {
    	this.direccion = direccion;
    }
    
    public String getTelefono () {    	
    	return telefono;
    }
    
    public void setTelefono(String telefono) {
    	this.telefono = telefono;
    }

}
