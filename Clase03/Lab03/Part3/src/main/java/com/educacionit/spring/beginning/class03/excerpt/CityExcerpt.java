

package com.educacionit.spring.beginning.class03.excerpt;



import org.springframework.data.rest.core.config.Projection;

import com.educacionit.spring.beginning.class03.entities.CityEntity;
import com.educacionit.spring.beginning.class03.entities.ProvinceEntity;




@Projection (name="CityExcerpt", types = CityEntity.class)
public interface CityExcerpt { 
	
	
	Integer getId ();
	
	
	String getName ();
	
	
	ProvinceEntity getProvince ();
}