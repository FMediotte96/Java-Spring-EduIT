package edu.educacionit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.bolivarsoft.sensorclima.SensorClima;
import com.bolivarsoft.sensorvelocidad.SensorVelocidad;

import edu.educacionit.services.EvaluadorMultas;
import edu.educacionit.services.GrabadorMultaJson;
import edu.educacionit.services.SensorInEternum;

/**
 * @author fmediotte
 *
 */
@Service
public class Init implements CommandLineRunner {
	
	private static SensorInEternum factory() {
		return new SensorInEternum(
				new SensorClima(), 
				new SensorVelocidad(), 
				new EvaluadorMultas(new GrabadorMultaJson())
			);
	}

	@Override
	public void run(String... args) throws Exception {
		factory().sensar();
	}
	
}
