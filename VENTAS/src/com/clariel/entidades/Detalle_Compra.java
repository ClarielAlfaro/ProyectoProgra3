package com.clariel.entidades;

public class Detalle_Compra {
	
	protected int idDetalleCompra;
	protected int idCompra;
	protected int idProducto;
	protected int idProveedor;
	protected int cantidad;
	protected double precio;
	
	public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int id_compra) {
        this.idCompra = id_compra;
    }
    
    public int getIdDetalleCompra() {
        return idDetalleCompra;
    }

    public void setIdDetalleCompra(int iddetalle_compra) {
        this.idDetalleCompra = iddetalle_compra;
    }
    
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int id_producto) {
        this.idProducto = id_producto;
    }
    
    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int id_proveedor) {
        this.idProveedor = id_proveedor;
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
