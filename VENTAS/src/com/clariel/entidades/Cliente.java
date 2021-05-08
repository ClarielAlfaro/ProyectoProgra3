package com.clariel.entidades;

public class Cliente {
	
	protected int idCliente;
	protected String nombre_cliente;
	protected String apellido_cliente;
	protected String direccion;
	protected String telefono;
	protected String dui;
	protected String nit;
	protected String nrc;
	
	public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idcliente) {
        this.idCliente = idcliente;
    }
    
    public String getNombreCliente() {
        return nombre_cliente;
    }

    public void setNombreCliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }
    
    public String getApellidoCliente() {
        return apellido_cliente;
    }

    public void setApellidoCliente(String apellido_cliente) {
        this.apellido_cliente = apellido_cliente;
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
    
    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }
    
    
    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
    public String getNrc() {
        return nrc;
    }

    public void setNrc(String nrc) {
        this.nrc = nrc;
    }

}
