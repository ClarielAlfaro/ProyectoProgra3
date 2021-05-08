package com.clariel.DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.clariel.Conexion.ConexionBd;
import com.clariel.entidades.Cargo;

public class ClsCargo {
	
	ConexionBd conexion = new ConexionBd();
	Connection con = conexion.RetornarConexion();

	public ArrayList<Cargo> ListadoCargos() {
		ArrayList<Cargo> Lista = new ArrayList<>();

		try {

			CallableStatement consulta = con.prepareCall("call SP_S_Cargo()");
            ResultSet rs = consulta.executeQuery();
            while (rs.next()) {
            	Cargo cat = new Cargo();
                cat.setIdCargo(rs.getInt("idCargo"));
                cat.setNombreCargo(rs.getString("nombre_cargo"));
                cat.setSueldo(rs.getDouble("sueldo"));
                
                Lista.add(cat);
			}
		} catch (Exception e) {
			// JOptionPane.showMessageDialog(null, "Ha ocurrido un error en: \n\n\n\n" + e);
		}

		return Lista;
	}
	
	public void Guardar (Cargo cat) {
		
		try {
			CallableStatement consulta = con.prepareCall("call SP_I_Cargo(?,?)");			
			consulta.setString("pnombre", cat.getNombreCargo());
			consulta.setDouble("psueldo", cat.getSueldo());
			consulta.executeQuery();
			System.out.println("Exito");
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

	public void Eliminar(Cargo cat) {

		try {
			CallableStatement consulta = con.prepareCall("call SP_D_Cargo(?)");
			consulta.setInt("pid", cat.getIdCargo());
			consulta.executeQuery();
			System.out.println("Exito");
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void ActualizarUsuario(Cargo cat) {

		try {
			CallableStatement consulta = con.prepareCall("call SP_U_Cargo(?,?,?)");
			consulta.setInt("pid", cat.getIdCargo());
			consulta.setString("pnombre", cat.getNombreCargo());	
			consulta.setDouble("psueldo", cat.getSueldo());
			consulta.executeQuery();
			System.out.println("Exito");
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
