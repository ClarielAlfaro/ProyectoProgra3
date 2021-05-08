package com.clariel.entidades;

public class Cargo {
	
	protected int idCargo;
	protected String nombre_cargo;
	protected double sueldo;
	
	
	public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }
    
    public String getNombreCargo() {
        return nombre_cargo;
    }

    public void setNombreCargo(String nombre_cargo) {
        this.nombre_cargo = nombre_cargo;
    }
    
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

}
