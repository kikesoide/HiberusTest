package com.hiberus.checkout.model.dto;

public class RespuestaDTO {
	String message;

	public RespuestaDTO(String msj) {
		this.message = msj;
	}
	
	/**
	 * @return the mensaje
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param mensaje the mensaje to set
	 */
	public void setMessage(String mensaje) {
		this.message = mensaje;
	}
}
