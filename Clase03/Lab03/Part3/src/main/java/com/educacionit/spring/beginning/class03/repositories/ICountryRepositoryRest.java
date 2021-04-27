

package com.educacionit.spring.beginning.class03.repositories;



import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.educacionit.spring.beginning.class03.entities.CountryEntity;
import com.educacionit.spring.beginning.class03.excerpt.CountryExcerpt;





@RepositoryRestResource (itemResourceRel="country", collectionResourceRel = "country", path = "country", 
                         excerptProjection = CountryExcerpt.class)
public interface ICountryRepositoryRest extends CrudRepository<CountryEntity, Integer> {

	

}