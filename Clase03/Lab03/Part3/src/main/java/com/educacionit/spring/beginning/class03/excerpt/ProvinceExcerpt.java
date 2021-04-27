

package com.educacionit.spring.beginning.class03.excerpt;



import org.springframework.data.rest.core.config.Projection;

import com.educacionit.spring.beginning.class03.entities.CountryEntity;
import com.educacionit.spring.beginning.class03.entities.ProvinceEntity;




@Projection (name="ProvinceExcerpt", types = ProvinceEntity.class)
public interface ProvinceExcerpt { 
	
	
	
	Integer getId ();
	
	String getName ();
	
	
	CountryEntity getCountry ();
}