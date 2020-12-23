package edu.educacionit.services;

import java.util.UUID;

import com.bolivarsoft.sensorclima.TipoClima;
import com.bolivarsoft.sensorvelocidad.DatosVehiculo;
import com.bolivarsoft.sensorvelocidad.TipoVehiculo;

import edu.educacionit.model.Ticket;
import edu.educacionit.repository.GrabadorMulta;

public class EvaluadorMultas {
	
	private GrabadorMulta grabadorMulta;
	private static final Integer MAX_130 = 130;
	private static final Integer MAX_110 = 110;
	private static final Integer MAX_90 = 90;
	private static final Integer MAX_80 = 80;
	private static final Integer MAX_70 = 70;
	private static final Integer MAX_60 = 60;

	public EvaluadorMultas(GrabadorMulta grabadorMulta) {
		this.grabadorMulta = grabadorMulta;
	}

	public void evaluar(TipoClima tc, DatosVehiculo dv) {
		//si se dan las condiciones hay que llamar a ....
		//Auto 
		if(tc == TipoClima.NORMAL && (dv.tipoVehiculo == TipoVehiculo.Auto || dv.tipoVehiculo == TipoVehiculo.Moto)) {
			if(dv.velocidadMedida <= MAX_130) {
				return;
			}
		}
		
		if(tc == TipoClima.LLUVIAS_MODERADAS && (dv.tipoVehiculo == TipoVehiculo.Auto || dv.tipoVehiculo == TipoVehiculo.Moto)) {
			if(dv.velocidadMedida <= MAX_110) {
				return;
			}
		}
		
		if(tc == TipoClima.LLUVIAS_TORRENCIALES && (dv.tipoVehiculo == TipoVehiculo.Auto || dv.tipoVehiculo == TipoVehiculo.Moto)) {
			if(dv.velocidadMedida <= MAX_90) {
				return;
			}
		}
		
		//Moto
		if(tc == TipoClima.NORMAL && dv.tipoVehiculo == TipoVehiculo.Camion) {
			if(dv.velocidadMedida <= MAX_90) {
				return;
			}
		}
		
		if(tc == TipoClima.LLUVIAS_MODERADAS && dv.tipoVehiculo == TipoVehiculo.Camion) {
			if(dv.velocidadMedida <= MAX_80) {
				return;
			}
		}
		
		if(tc == TipoClima.LLUVIAS_TORRENCIALES && dv.tipoVehiculo == TipoVehiculo.Camion) {
			if(dv.velocidadMedida <= MAX_70) {
				return;
			}
		}
		
		//Tractor
		if(dv.tipoVehiculo == TipoVehiculo.Tractor) {
			if(dv.velocidadMedida <= MAX_60) {
				return;
			}
		}
		
		System.out.println("Se debe generar ticket");
		
		Ticket t = new Ticket(
				UUID.randomUUID().toString(),
				System.currentTimeMillis()/100,
				dv, 
				tc.name(), 
				100, 
				dv.velocidadMedida
		);
		
		grabadorMulta.grabar(t);
	}
	
}
