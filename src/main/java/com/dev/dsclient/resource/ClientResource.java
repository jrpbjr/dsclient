package com.dev.dsclient.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dev.dsclient.entities.Client;
import com.dev.dsclient.services.ClientService;

@Controller
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@Autowired
	private ClientService service;
	
	@GetMapping
	public ResponseEntity<List<Client>> fildAll(){
		List<Client> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
