package edu.educacionit.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import edu.educacionit.model.Ticket;

/**
 * @author fmediotte
 *
 */
@Repository
@Primary
public class GrabadoJsonMasSQL implements GrabadorMulta {
	
	@Autowired
	private GrabadorMultaJson grabadorMultaJson;
	
	@Autowired
	private GrabadorMultaSQL grabadorMultaSQL;

	@Override
	public void grabar(Ticket t) {
		try {
			grabadorMultaJson.grabar(t);
		} catch (Exception e) {
			System.out.println("No se pudo grabar en formato JSON");
		}
		
		try {
			grabadorMultaSQL.grabar(t);
		} catch (Exception e) {
			System.out.println("No se pudo grabar en formato SQL");
		}
		
	}
	

}
