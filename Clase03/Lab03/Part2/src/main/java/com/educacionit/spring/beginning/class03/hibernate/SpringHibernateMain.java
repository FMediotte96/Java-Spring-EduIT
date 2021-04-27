
package com.educacionit.spring.beginning.class03.hibernate;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.apache.log4j.Logger;

import com.educacionit.spring.beginning.class03.hibernate.dao.PersonDAO;
import com.educacionit.spring.beginning.class03.hibernate.model.Person;



public class SpringHibernateMain {
	
	
	private static final Logger logger = Logger.getLogger (SpringHibernateMain.class);
	
	
	public SpringHibernateMain () {
		
		super ();
	}
	

	public static void main(String[] args) {

		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("applicationContext.xml");
		
		PersonDAO personDAO = context.getBean (PersonDAO.class);
		
		Person person = new Person();
		person.setName("Homer Simpson"); person.setCountry("EEUU");
		
		personDAO.save(person);
		
		logger.info (String.format ("Person  %s ", person.toString ()));
		
		List<Person> list = personDAO.list();
		
		for (Person p : list){
			
			logger.info (String.format ("Person  %s ", p.toString ()));
		}
		
		context.close();
	}
}