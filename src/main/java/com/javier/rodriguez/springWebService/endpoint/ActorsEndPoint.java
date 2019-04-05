package com.javier.rodriguez.springWebService.endpoint;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.javier.rodriguez.gs_ws.ActorType;
import com.javier.rodriguez.gs_ws.GetActorByIdRequest;
import com.javier.rodriguez.gs_ws.GetActorByIdResponse;
import com.javier.rodriguez.springWebService.dao.entity.ActorEntity;
import com.javier.rodriguez.springWebService.dao.intefaces.ActorEntityService;



@Endpoint
public class ActorsEndPoint {

	public static final String NAMESPACE_URI="http://www.javier.rodriguez/actors-ws";
	
	private ActorEntityService service;
	
	public ActorsEndPoint() {
		
	}
	
	@Autowired
	public ActorsEndPoint(ActorEntityService service) {
		this.service = service;
	}
	
	@PayloadRoot(namespace= NAMESPACE_URI, localPart="getActorByIdRequest")
	@ResponsePayload
	public GetActorByIdResponse getActorById(@RequestPayload GetActorByIdRequest request) {
		GetActorByIdResponse response = new GetActorByIdResponse();
		ActorEntity actorEntity = service.getEntityById(request.getActorId());
		ActorType actorType = new ActorType();
		actorType.setActorId(actorEntity.getActor_id());
		actorType.setFirstName(actorEntity.getFirst_name());
		actorType.setLastName(actorEntity.getLast_name());
		actorType.setLastUpdate(actorType.getLastUpdate());
		response.setActorType(actorType);
		return response;
		
	}
	
}
