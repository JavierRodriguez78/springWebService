package com.javier.rodriguez.springWebService.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.javier.rodriguez.gs_ws.GetActorByIdRequest;
import com.javier.rodriguez.gs_ws.GetActorByIdResponse;

@Endpoint
public class ActorsEndPoint {

	public static final String NAMESPACE_URI="http://javier.rodriguez.com/actors-ws";
	
	public ActorsEndPoint() {
		
	}
	
	@PayloadRoot(namespace= NAMESPACE_URI, localPart="getActorByIdRequest")
	@ResponsePayload
	public GetActorByIdResponse getActorById(@RequestPayload GetActorByIdRequest request) {
		GetActorByIdResponse response = new GetActorByIdResponse();
		return response;
	}
	
}
