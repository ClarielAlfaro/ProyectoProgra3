package com.clariel.entidades;

import java.util.Date;

public class Compra {
	
	protected int idCompra;
	protected int idEmpleado;
	protected double TotalCompra;
	protected Date fecha;
	
	public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idcompra) {
        this.idCompra = idcompra;
    }
    
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int id_empleado) {
        this.idEmpleado = id_empleado;
    }
    
    public double getTotalCompra() {
        return TotalCompra;
    }

    public void setTotalCompra(double total_compra) {
        this.TotalCompra = total_compra;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
