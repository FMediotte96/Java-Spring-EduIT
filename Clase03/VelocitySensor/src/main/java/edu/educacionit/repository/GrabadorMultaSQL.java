package edu.educacionit.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.educacionit.annotations.Medible;

import edu.educacionit.components.ContenedorJPA;
import edu.educacionit.model.Ticket;

/**
 * @author fmediotte
 *
 */
@Repository("GrabadorSQL")
public class GrabadorMultaSQL implements GrabadorMulta {
	
	@Autowired
	ContenedorJPA contenedorJPA;
	
	@Override
	@Medible
	public void grabar(Ticket t) {
		System.out.println("Grabando multa en SQL");
		
		EntityManager entityManager = contenedorJPA.getEntityManager();
		
		EntityTransaction tx = null;
		try {
			tx = entityManager.getTransaction();
			tx.begin();
			entityManager.persist(t);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}

}
