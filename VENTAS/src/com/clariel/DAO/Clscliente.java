package com.clariel.DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.clariel.Conexion.ConexionBd;
import com.clariel.entidades.Cliente;

public class Clscliente {
	
	ConexionBd conexion = new ConexionBd();
	Connection con = conexion.RetornarConexion();

	public ArrayList<Cliente> ListadoClientes() {
		ArrayList<Cliente> Lista = new ArrayList<>();

		try {

			CallableStatement consulta = con.prepareCall("call SP_S_Cliente()");
            ResultSet rs = consulta.executeQuery();
            while (rs.next()) {
            	Cliente cat = new Cliente();
                cat.setIdCliente(rs.getInt("idcliente"));
                cat.setNombreCliente(rs.getString("nombre_cliente"));
                cat.setApellidoCliente(rs.getString("apellido_cliente"));
                cat.setDireccion(rs.getString("direccion"));
                cat.setTelefono(rs.getString("telefono"));
                cat.setDui(rs.getString("dui"));
                cat.setNit(rs.getString("nit"));
                cat.setNrc(rs.getString("nrc"));
                
                Lista.add(cat);
			}
		} catch (Exception e) {
			// JOptionPane.showMessageDialog(null, "Ha ocurrido un error en: \n\n\n\n" + e);
		}

		return Lista;
	}
	
	public void Guardar (Cliente cat) {
		
		try {
			CallableStatement consulta = con.prepareCall("call SP_I_Cliente(?,?,?,?,?,?,?)");			
			consulta.setString("pnombre", cat.getNombreCliente());
			consulta.setString("papellido", cat.getApellidoCliente());
			consulta.setString("pdireccion", cat.getDireccion());
			consulta.setString("ptelefono", cat.getTelefono());
			consulta.setString("pdui", cat.getDui());
			consulta.setString("pnit", cat.getNit());
			consulta.setString("pnrc", cat.getNrc());
			consulta.executeQuery();
			System.out.println("Exito");
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

	public void Eliminar(Cliente cat) {

		try {
			CallableStatement consulta = con.prepareCall("call SP_D_Cliente(?)");
			consulta.setInt("pid", cat.getIdCliente());
			consulta.executeQuery();
			System.out.println("Exito");
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void ActualizarUsuario(Cliente cat) {

		try {
			CallableStatement consulta = con.prepareCall("call SP_U_Cliente(?,?,?)");
			consulta.setInt("pid", cat.getIdCliente());
			consulta.setString("pnombre", cat.getNombreCliente());
			consulta.setString("papellido", cat.getApellidoCliente());
			consulta.setString("pdireccion", cat.getDireccion());
			consulta.setString("ptelefono", cat.getTelefono());
			consulta.setString("pdui", cat.getDui());
			consulta.setString("pnit", cat.getNit());
			consulta.setString("pnrc", cat.getNrc());
			consulta.executeQuery();
			System.out.println("Exito");
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
