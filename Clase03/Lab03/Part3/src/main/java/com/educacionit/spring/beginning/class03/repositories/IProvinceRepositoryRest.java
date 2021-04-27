

package com.educacionit.spring.beginning.class03.repositories;



import java.util.List;


import org.springframework.data.jpa.repository.Query;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.educacionit.spring.beginning.class03.entities.ProvinceEntity;
import com.educacionit.spring.beginning.class03.excerpt.ProvinceExcerpt;




@RepositoryRestResource (itemResourceRel="province", collectionResourceRel = "province", path = "province", 
                         excerptProjection = ProvinceExcerpt.class)
public interface IProvinceRepositoryRest extends CrudRepository<ProvinceEntity, Integer> {

	

	@RestResource (path="byCountry")
	@Query ("select p from Province p where p.country.id=:id order by p.name")
	List<ProvinceEntity> findByCountryId (@Param ("id") int id);
}