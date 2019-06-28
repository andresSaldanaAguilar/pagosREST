package com.proyecto.pagos.entities;

public class pago {
	private Integer idPago;
    private Integer idUsuarioPago;
    private String descripcion;
    private Integer monto;
	
	public pago() {
		super();
	}

	public pago(Integer idPago, Integer idUsuarioPago, String descripcion, Integer monto) {
		super();
		this.idPago = idPago;
        this.idUsuarioPago = idUsuarioPago;
        this.descripcion = descripcion;
        this.monto = monto;
	}

	public Integer getidPago() {
		return idPago;
	}

	public void setidPago(Integer idPago) {
		this.idPago = idPago;
	}

	public Integer getidUsuarioPago() {
		return idUsuarioPago;
	}

	public void setidUsuarioPago(Integer idUsuarioPago) {
		this.idUsuarioPago = idUsuarioPago;
	}

    public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

    public Integer getMonto() {
		return monto;
	}

	public void setMonto(Integer monto) {
		this.monto = monto;
	}
}