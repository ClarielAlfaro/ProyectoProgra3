package com.clariel.entidades;

public class Producto {
	
	protected int idProducto;
	protected int idCategoria;
	protected int idProveedor;
	protected String nombre_producto;
	protected int cantidad;
	protected double costo;
	protected double precio;
	
	public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    
    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int id_categoria) {
        this.idCategoria = id_categoria;
    }
    
    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int id_proveedor) {
        this.idProveedor = id_proveedor;
    }
    
    public String getNombre_Producto() {
        return nombre_producto;
    }

    public void setNombre_Producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }
    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
