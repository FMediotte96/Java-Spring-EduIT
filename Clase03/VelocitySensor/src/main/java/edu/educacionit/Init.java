package edu.educacionit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import edu.educacionit.services.SensorInEternum;

/**
 * @author fmediotte
 *
 */
@Component
public class Init implements CommandLineRunner {
	
	@Autowired
	SensorInEternum sensorInEternum;
	
	@Override
	public void run(String... args) throws Exception {
		sensorInEternum.sensar();
	}
	
}
