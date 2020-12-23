package edu.educacionit.services;

import edu.educacionit.model.Ticket;
import edu.educacionit.repository.GrabadorMulta;

/**
 * @author fmediotte
 *
 */
public class GrabadorMultaSQL implements GrabadorMulta {
	
	@Override
	public void grabar(Ticket t) {
		System.out.println("Grabando multa en SQL");
	}

}
