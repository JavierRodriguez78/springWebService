package com.javier.rodriguez.springWebService.dao.repository;

import com.javier.rodriguez.springWebService.dao.entity.ActorEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorEntityRepository extends CrudRepository<ActorEntity, Integer> {
	
	//	public ActorEntity findByfirstName(String name);

}
