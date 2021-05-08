package com.clariel.DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.clariel.Conexion.ConexionBd;
import com.clariel.entidades.Proveedor;

public class ClsProveedor {
	
	ConexionBd conexion = new ConexionBd();
	Connection con = conexion.RetornarConexion();

	public ArrayList<Proveedor> ListadoProductos() {
		ArrayList<Proveedor> Lista = new ArrayList<>();

		try {

			CallableStatement consulta = con.prepareCall("call SP_S_Proveedor()");
            ResultSet rs = consulta.executeQuery();
            while (rs.next()) {
            	Proveedor cat = new Proveedor();
                cat.setIdProveedor(rs.getInt("idProveedor"));
                cat.setNombreProveedor(rs.getString("nombre_proveedor"));                
                cat.setDireccion(rs.getString("direccion"));
                cat.setTelefono(rs.getString("telefono"));   
                              
                
                Lista.add(cat);
			}
		} catch (Exception e) {
			// JOptionPane.showMessageDialog(null, "Ha ocurrido un error en: \n\n\n\n" + e);
		}

		return Lista;
	}
	
	public void Guardar (Proveedor cat) {
		
		try {
			CallableStatement consulta = con.prepareCall("call SP_I_Proveedor(?,?,?)");				
			consulta.setString("pnombre_proveedor", cat.getNombreProveedor());
			consulta.setString("pdireccion", cat.getDireccion());
			consulta.setString("ptelefono", cat.getTelefono());					
			consulta.executeQuery();
			System.out.println("Exito");
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

	public void Eliminar(Proveedor cat) {

		try {
			CallableStatement consulta = con.prepareCall("call SP_D_Proveedor(?)");
			consulta.setInt("pid", cat.getIdProveedor());
			consulta.executeQuery();
			System.out.println("Exito");
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void Actualizar(Proveedor cat) {

		try {
			CallableStatement consulta = con.prepareCall("call SP_U_Proveedor(?,?,?,?)");
			consulta.setInt("pid", cat.getIdProveedor());
			consulta.setString("pnombre_proveedor", cat.getNombreProveedor());
			consulta.setString("pdireccion", cat.getDireccion());
			consulta.setString("ptelefono", cat.getTelefono());		
			consulta.executeQuery();
			System.out.println("Exito");
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
