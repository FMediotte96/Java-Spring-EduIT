package edu.educacionit.services;

import org.springframework.stereotype.Component;

import com.bolivarsoft.sensorclima.SensorClima;
import com.bolivarsoft.sensorclima.TipoClima;
import com.bolivarsoft.sensorvelocidad.DatosVehiculo;
import com.bolivarsoft.sensorvelocidad.SensorVelocidad;

/**
 * @author fmediotte
 *
 */
@Component
public class SensorInEternum {
	
	SensorClima sensorClima;
	SensorVelocidad sensorVelocidad;
	EvaluadorMultas evaluadorMultas;
	
	public SensorInEternum(EvaluadorMultas evaluadorMultas) {
		this.sensorClima = new SensorClima();
		this.sensorVelocidad = new SensorVelocidad();
		this.evaluadorMultas = evaluadorMultas;
	}

	public void sensar() {
		TipoClima tipoClima = sensorClima.sensar();
		System.out.println(tipoClima);
		
		for(;;) {
			DatosVehiculo datosVehiculo = sensorVelocidad.sensarVehiculo();
			System.out.println(datosVehiculo);
			evaluadorMultas.evaluar(tipoClima, datosVehiculo);
		}
	}
	

}
