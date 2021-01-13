package com.eduit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ClientesFrecuentes")
public class ClienteFrecuente {

	@Id
	@Column(name="id")
	private String idCliente;
	@Column(name="nombre")
	private String nombre;
	@Column(name="apellido")
	private String apellido;
	@Column(name = "tipoDescuento")
	private Integer tipoDescuento;
	
	public ClienteFrecuente() {
		
	}

	public ClienteFrecuente(String idCliente, String nombre, String apellido, Integer tipoDescuento) {
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipoDescuento = tipoDescuento;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getTipoDescuento() {
		return tipoDescuento;
	}

	public void setTipoDescuento(Integer tipoDescuento) {
		this.tipoDescuento = tipoDescuento;
	}
	
}
