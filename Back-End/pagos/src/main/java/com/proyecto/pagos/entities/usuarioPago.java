package com.proyecto.pagos.entities;

public class usuarioPago {
	private Integer idUsuarioPago;
    private Integer idUsuario;
	
	public usuarioPago() {
		super();
	}

	public usuarioPago(Integer idUsuarioPago, Integer idUsuario) {
		super();
		this.idUsuarioPago = idUsuarioPago;
        this.idUsuario = idUsuario;
	}

	public Integer getidUsuarioPago() {
		return idUsuarioPago;
	}

	public void setidUsuarioPago(Integer idUsuarioPago) {
		this.idUsuarioPago = idUsuarioPago;
	}

	public Integer getidUsuario() {
		return idUsuario;
	}

	public void setidUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
}