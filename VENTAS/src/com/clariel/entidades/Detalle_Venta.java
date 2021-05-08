package com.clariel.entidades;



public class Detalle_Venta {
	
	protected int idDetalle;
	protected int idVenta;
	protected int idProducto;
	protected int cantidad;
	protected double precio;
	
	public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int id_venta) {
        this.idVenta = id_venta;
    }
    
    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int iddetalle_venta) {
        this.idDetalle = iddetalle_venta;
    }
    
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int id_producto) {
        this.idProducto = id_producto;
    }
    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    


}
