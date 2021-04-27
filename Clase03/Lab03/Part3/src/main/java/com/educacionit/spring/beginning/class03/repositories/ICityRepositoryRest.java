

package com.educacionit.spring.beginning.class03.repositories;



import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.educacionit.spring.beginning.class03.entities.CityEntity;
import com.educacionit.spring.beginning.class03.excerpt.CityExcerpt;




@RepositoryRestResource (itemResourceRel="city", collectionResourceRel = "city", path = "city", 
                         excerptProjection = CityExcerpt.class)
public interface ICityRepositoryRest extends CrudRepository<CityEntity, Integer> {

	

}