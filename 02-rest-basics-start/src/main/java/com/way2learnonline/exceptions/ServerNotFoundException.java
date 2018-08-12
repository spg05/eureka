package com.way2learnonline.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


// TODO-4 Map this Exception to status code 404 and give the reason as  "Server Not Found !!!"
@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Server Not Found Error")
public class ServerNotFoundException  extends RuntimeException{

	private static final long serialVersionUID = 5535312329906341257L;

	public ServerNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ServerNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	
	
}
