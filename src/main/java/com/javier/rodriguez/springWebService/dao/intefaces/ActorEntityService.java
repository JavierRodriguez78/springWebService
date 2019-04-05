package com.javier.rodriguez.springWebService.dao.intefaces;

import java.util.List;

import com.javier.rodriguez.springWebService.dao.entity.ActorEntity;

public interface ActorEntityService {
   public ActorEntity getEntityById(int id);
   public List<ActorEntity> getAllEntities();
   public ActorEntity addEntity(ActorEntity entity);
   public boolean updateEntity(ActorEntity entity);
   public boolean deleteEntity(int id);
}
