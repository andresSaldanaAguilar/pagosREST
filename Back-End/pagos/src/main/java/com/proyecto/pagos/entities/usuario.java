package com.proyecto.pagos.entities;

public class usuario {
	private Integer idUsuario;
	private String correo;
	private String contraseña;
	
	public usuario() {
		super();
	}

	public usuario(Integer idUsuario, String correo, String contraseña) {
		super();
		this.idUsuario = idUsuario;
		this.correo = correo;
		this.contraseña = contraseña;
	}

	public Integer getidUsuario() {
		return idUsuario;
	}

	public void setidUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
    public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
}
