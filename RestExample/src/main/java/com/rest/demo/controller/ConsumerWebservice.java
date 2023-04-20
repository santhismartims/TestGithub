package com.rest.demo.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class ConsumerWebservice {
   @Autowired
   RestTemplate restTemplate;

   @RequestMapping(value = "/template/studentsList")
   public String getStudentList() {
	  HttpHeaders headers = new HttpHeaders();
	  headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON)); 
	  HttpEntity <String> entity = new HttpEntity<String>(headers);
	   

      return restTemplate.exchange("http://localhost:8080/students", HttpMethod.GET, entity, String.class).getBody();
   }
}