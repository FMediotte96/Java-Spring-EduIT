
package com.educacionit.spring.beginning.class03.hibernate.dao;

import java.util.List;

import com.educacionit.spring.beginning.class03.hibernate.model.Person;



public interface PersonDAO {

	public void save(Person p);
	
	public List<Person> list();
	
}
