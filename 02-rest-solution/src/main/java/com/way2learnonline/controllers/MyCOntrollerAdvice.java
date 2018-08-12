package com.way2learnonline.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.way2learnonline.exceptions.ServerNotFoundException;

@ControllerAdvice(assignableTypes= {ServerController.class})
@Component
public class MyCOntrollerAdvice {
	
	@ExceptionHandler({Exception.class })
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	public @ResponseBody ErrorMessage handleErr(Exception e) {
		
		ErrorMessage msg = new ErrorMessage();
		msg.setMessage(e.getMessage());
		
		return msg;
	}
}
