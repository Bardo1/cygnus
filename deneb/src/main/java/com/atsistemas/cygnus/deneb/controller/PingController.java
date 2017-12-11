package com.atsistemas.cygnus.deneb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.atsistemas.cygnus.deneb.generated.api.PingApi;
import com.atsistemas.cygnus.deneb.generated.model.PingResponse;
import com.atsistemas.cygnus.deneb.service.CygnusClient;

@Controller
public class PingController implements PingApi{

	private static Logger logger = LoggerFactory.getLogger(PingController.class);
	
	@Autowired
	private CygnusClient cygnusClient;

	@Override
	public ResponseEntity<PingResponse> pingGet() {
		
		logger.debug("--> pingGet");
		PingResponse pingResponse = new PingResponse();
		//TODO generate uuid
		pingResponse.setId("0");
		pingResponse.setResponseMessage("hello from Deneb");
		return new ResponseEntity<PingResponse>(pingResponse, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<PingResponse> pingServiceGet(String serviceName) {
		
		logger.debug("--> pingServiceGet - serviceName: {}",serviceName);
		
		return new ResponseEntity<PingResponse>(cygnusClient.pingService(serviceName), HttpStatus.OK);
		
		
		
	}


    
   
}