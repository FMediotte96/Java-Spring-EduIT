package edu.educacionit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.bolivarsoft.sensorvelocidad.DatosVehiculo;

/**
 * @author fmediotte
 *
 */
@Entity
@Table
public class Ticket {
	
	@Id
	@Column(name="idTicket")
	private String idTicket;
	
	@Column(name="fechaYhora")
	private Long fechaYHora;
	
	@Column(name="patente")
    private String patente;
	
	@Column(name="tipoVehiculo")
	private String tipoVehiculo;
	
	@Column(name="velocidadMedida")
	private int velocidadMedida;

	@Column(name="situacionClimatologica")
	private String situacionClimatologica;
	
	@Column(name="limiteVelocidadPermitido")
	private Integer limiteVelocidadPermitido;
	
	@Column(name="limiteMedido")
	private Integer limiteMedido;
	
	public Ticket() {
	}

	public Ticket(String idTicket, Long fechaYHora, DatosVehiculo datosDelVehiculo,
			String situacionClimatologica, Integer limiteVelocidadPermitido, Integer limiteMedido) {
		this.idTicket = idTicket;
		this.fechaYHora = fechaYHora;
		this.patente = datosDelVehiculo.patente;
		this.tipoVehiculo = datosDelVehiculo.tipoVehiculo.name();
		this.velocidadMedida = datosDelVehiculo.velocidadMedida;
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

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public int getVelocidadMedida() {
		return velocidadMedida;
	}

	public void setVelocidadMedida(int velocidadMedida) {
		this.velocidadMedida = velocidadMedida;
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
