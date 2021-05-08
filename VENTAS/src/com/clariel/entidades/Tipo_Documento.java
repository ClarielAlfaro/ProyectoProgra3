package com.clariel.entidades;

public class Tipo_Documento {
	
	protected int idTipoDocumento;
	protected String TipoDocumento;
	
	public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(int idtipo_documento) {
        this.idTipoDocumento = idtipo_documento;
    }
    
    public String getTipoDocumento() {
        return TipoDocumento;
    }

    public void setTipoDocumento(String tipo_documento) {
        this.TipoDocumento = tipo_documento;
    }

}
