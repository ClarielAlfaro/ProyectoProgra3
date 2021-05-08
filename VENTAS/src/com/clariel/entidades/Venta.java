package com.clariel.entidades;

import java.util.Date;

public class Venta {
	
	protected int idVenta;
	protected int idEmpleado;
	protected int idCliente;
	protected int idDocumento;
	protected double TotalVenta;
	protected Date fecha;
	
	public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idventa) {
        this.idVenta = idventa;
    }
    
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int id_empleado) {
        this.idEmpleado = id_empleado;
    }
    
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int id_cliente) {
        this.idCliente = id_cliente;
    }
    
    public int getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(int id_documento) {
        this.idDocumento = id_documento;
    }
    
    public double getTotalVenta() {
        return TotalVenta;
    }

    public void setTotalVenta(double total_venta) {
        this.TotalVenta = total_venta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
