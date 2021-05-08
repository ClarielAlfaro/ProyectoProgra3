package com.clariel.DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.clariel.Conexion.ConexionBd;
import com.clariel.entidades.Producto;

public class ClsProducto {
	
	ConexionBd conexion = new ConexionBd();
	Connection con = conexion.RetornarConexion();

	public ArrayList<Producto> ListadoProductos() {
		ArrayList<Producto> Lista = new ArrayList<>();

		try {

			CallableStatement consulta = con.prepareCall("call SP_S_Producto()");
            ResultSet rs = consulta.executeQuery();
            while (rs.next()) {
            	Producto cat = new Producto();
                cat.setIdProducto(rs.getInt("idProducto"));
                cat.setIdCategoria(rs.getInt("id_categoria"));
                cat.setIdProveedor(rs.getInt("id_proveedor"));
                cat.setNombre_Producto(rs.getString("nombre_producto"));
                cat.setCantidad(rs.getInt("cantidad"));
                cat.setCosto(rs.getDouble("costo"));
                cat.setPrecio(rs.getDouble("precio"));
                              
                
                Lista.add(cat);
			}
		} catch (Exception e) {
			// JOptionPane.showMessageDialog(null, "Ha ocurrido un error en: \n\n\n\n" + e);
		}

		return Lista;
	}
	
	public void Guardar (Producto cat) {
		
		try {
			CallableStatement consulta = con.prepareCall("call SP_I_Producto(?,?,?,?,?,?)");	
			consulta.setInt("pid_categoria", cat.getIdCategoria());
			consulta.setInt("pid_proveedor", cat.getIdProveedor());
			consulta.setString("pnombre_producto", cat.getNombre_Producto());
			consulta.setInt("pcantidad", cat.getCantidad());
			consulta.setDouble("pcosto", cat.getCosto());
			consulta.setDouble("pprecio", cat.getPrecio());			
			consulta.executeQuery();
			System.out.println("Exito");
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

	public void Eliminar(Producto cat) {

		try {
			CallableStatement consulta = con.prepareCall("call SP_D_Producto(?)");
			consulta.setInt("pid", cat.getIdProducto());
			consulta.executeQuery();
			System.out.println("Exito");
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void Actualizar(Producto cat) {

		try {
			CallableStatement consulta = con.prepareCall("call SP_U_Empleado(?,?,?,?,?,?,?)");
			consulta.setInt("pid", cat.getIdProducto());
			consulta.setInt("pid_categoria", cat.getIdCategoria());
			consulta.setInt("pid_proveedor", cat.getIdProveedor());
			consulta.setString("pnombre_producto", cat.getNombre_Producto());
			consulta.setInt("pcantidad", cat.getCantidad());
			consulta.setDouble("pcosto", cat.getCosto());
			consulta.setDouble("pprecio", cat.getPrecio());			
			consulta.executeQuery();
			System.out.println("Exito");
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
