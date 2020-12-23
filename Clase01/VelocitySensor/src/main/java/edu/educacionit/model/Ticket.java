package edu.educacionit.model;

import com.bolivarsoft.sensorvelocidad.DatosVehiculo;

/**
 * @author fmediotte
 *
 */
public class Ticket {
	
	private String idTicket;
	private Long fechaYHora;
	private DatosVehiculo datosVehiculo;
	private String situacionClimatologica;
	private Integer limiteVelocidadPermitido;
	private Integer limiteMedido;
	
	public Ticket() {
	}

	public Ticket(String idTicket, Long fechaYHora, DatosVehiculo datosVehiculo, String situacionClimatologica,
			Integer limiteVelocidadPermitido, Integer limiteMedido) {
		this.idTicket = idTicket;
		this.fechaYHora = fechaYHora;
		this.datosVehiculo = datosVehiculo;
		this.situacionClimatologica = situacionClimatologica;
		this.limiteVelocidadPermitido = limiteVelocidadPermitido;
		this.limiteMedido = limiteMedido;
	}

	public String getIdTicket() {
		return idTicket;
	}

	public void setIdTicket(String idTicket) {
		this.idTicket = idTicket;
	}

	public Long getFechaYHora() {
		return fechaYHora;
	}

	public void setFechaYHora(Long fechaYHora) {
		this.fechaYHora = fechaYHora;
	}

	public DatosVehiculo getDatosVehiculo() {
		return datosVehiculo;
	}

	public void setDatosVehiculo(DatosVehiculo datosVehiculo) {
		this.datosVehiculo = datosVehiculo;
	}

	public String getSituacionClimatologica() {
		return situacionClimatologica;
	}

	public void setSituacionClimatologica(String situacionClimatologica) {
		this.situacionClimatologica = situacionClimatologica;
	}

	public Integer getLimiteVelocidadPermitido() {
		return limiteVelocidadPermitido;
	}

	public void setLimiteVelocidadPermitido(Integer limiteVelocidadPermitido) {
		this.limiteVelocidadPermitido = limiteVelocidadPermitido;
	}

	public Integer getLimiteMedido() {
		return limiteMedido;
	}

	public void setLimiteMedido(Integer limiteMedido) {
		this.limiteMedido = limiteMedido;
	}

}
