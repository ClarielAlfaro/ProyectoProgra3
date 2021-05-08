package com.clariel.DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.clariel.Conexion.ConexionBd;
import com.clariel.entidades.Categoria;


public class ClsCategoria {

	ConexionBd conexion = new ConexionBd();
	Connection con = conexion.RetornarConexion();

	public ArrayList<Categoria> ListadoCategorias() {
		ArrayList<Categoria> Lista = new ArrayList<>();

		try {

			CallableStatement consulta = con.prepareCall("call SP_S_Categoria()");
            ResultSet rs = consulta.executeQuery();
            while (rs.next()) {
                Categoria cat = new Categoria();
                cat.setIdCategoria(rs.getInt("idCategoria"));
                cat.setNombreCategoria(rs.getString("nombre_categoria"));
                
                Lista.add(cat);
			}
		} catch (Exception e) {
			// JOptionPane.showMessageDialog(null, "Ha ocurrido un error en: \n\n\n\n" + e);
		}

		return Lista;
	}
	
	public void Guardar (Categoria cat) {
		
		try {
			CallableStatement consulta = con.prepareCall("call SP_I_Categoria(?,?)");			
			consulta.setString("pnombrec", cat.getNombreCategoria());
			consulta.executeQuery();
			System.out.println("Exito");
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

	public void Eliminar(Categoria cat) {

		try {
			CallableStatement consulta = con.prepareCall("call SP_D_Categoria(?)");
			consulta.setInt("pid", cat.getIdCategoria());
			consulta.executeQuery();
			System.out.println("Exito");
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void ActualizarUsuario(Categoria cat) {

		try {
			CallableStatement consulta = con.prepareCall("call SP_U_Categoria(?,?)");
			consulta.setInt("pid", cat.getIdCategoria());
			consulta.setString("pnombrec", cat.getNombreCategoria());			
			consulta.executeQuery();
			System.out.println("Exito");
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	
}
