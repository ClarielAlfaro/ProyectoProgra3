package com.clariel.negocio;

import com.clariel.entidades.Loguin;

public class ClsLoguin {
	
	public int acceso(Loguin log) {
		int acceso = 1;
		if(log.getUser().equals("clariel") && log.getPass().equals("123")) {
			
			acceso = 1;
		}
		
		return acceso;
	}

}
