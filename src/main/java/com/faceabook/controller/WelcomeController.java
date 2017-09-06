package com.faceabook.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.faceabook.bean.Response;


@RestController
@RequestMapping(value = "/rest/api/v1")
public class WelcomeController {

	@RequestMapping(value="/", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Response> getHelloMessage(){
		Response response = new Response();
		response.setStatus(Boolean.TRUE);
		response.setStatusCode(HttpStatus.OK.value());
		response.setMessage("Welcome to Spirng Boot Application");
		return new ResponseEntity<Response>(response,new HttpHeaders(), HttpStatus.OK);
	}
}
