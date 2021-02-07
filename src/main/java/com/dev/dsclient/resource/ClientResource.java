package com.dev.dsclient.resource;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dev.dsclient.entities.Client;

@Controller
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List<Client>> fildAll(){
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Maria Aparecida","123456789",(double) 3000,Instant.parse("1973-12-25T20:30:50Z"),2));
		list.add(new Client(2L, "Maria Aparecida","123456789",(double) 3000,Instant.parse("1973-12-25T20:30:50Z"),3));
		return ResponseEntity.ok().body(list);
	}

}
