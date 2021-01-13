package com.eduit.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.eduit.components.ContenedorJPA;
import com.eduit.model.ClienteFrecuente;
import com.github.javafaker.Faker;

/**
 * @author fmediotte
 *
 */
@RestController //Anotación que expone esta API al mundo exterior
@RequestMapping("/clifrec")
public class ClienteFrecuenteController {
	
	@Autowired
	private ContenedorJPA contenedorJPA;

	private int[] crearArray(int n) {
		int[] arrayEnteros = new int[n];
		
		for (int i = 0; i < n; i++) {
			arrayEnteros[i] = i;
		}
		
		return arrayEnteros;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<ClienteFrecuente> getTodos() {
		List<ClienteFrecuente> retValue = new ArrayList<>();
		
		try {
			EntityManager em = contenedorJPA.getEntityManager();
			TypedQuery<ClienteFrecuente> clifrec = em.createQuery("FROM ClienteFrecuente c", ClienteFrecuente.class);
			retValue = clifrec.getResultList();
		} catch (Exception e) {
			System.out.println("error: " + e.getMessage());
		}
		
		return retValue;
	}
	
	@RequestMapping(value = "/inventar", method = RequestMethod.GET)
	public List<ClienteFrecuente> getInventados() {
		ArrayList<ClienteFrecuente> retValue = new ArrayList<>();
		
		for(int z: crearArray(10)) {
			retValue.add(new ClienteFrecuente(
					UUID.randomUUID().toString(), 
					Faker.instance().address().firstName(), 
					Faker.instance().address().lastName(), 
					(z%2) + 1
			));
		}
		
		return retValue;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void agregar(@RequestBody ClienteFrecuente clienteFrecuente) {
		System.out.println("Agregamos a:");
		System.out.println(clienteFrecuente.getNombre());
		System.out.println(clienteFrecuente.getApellido());
		
		EntityTransaction tx = null;
		
		try {
			EntityManager em = contenedorJPA.getEntityManager();
			tx = em.getTransaction();
			tx.begin();
			em.persist(clienteFrecuente);
			tx.commit();
		} catch (Exception e) {
			System.out.println("error: " + e.getMessage());
			tx.rollback();
		}

	}
}
