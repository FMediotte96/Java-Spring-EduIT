

package com.educacionit.spring.beginning.class03.excerpt;



import org.springframework.data.rest.core.config.Projection;

import com.educacionit.spring.beginning.class03.entities.CountryEntity;




@Projection (name="CountryExcerpt", types = CountryEntity.class)
public interface CountryExcerpt { 
	
	
	
	Integer getId ();
	
	
	String getCode ();
	
	
	String getName ();
}