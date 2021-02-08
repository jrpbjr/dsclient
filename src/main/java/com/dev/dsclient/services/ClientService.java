package com.dev.dsclient.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dev.dsclient.dto.ClientDTO;
import com.dev.dsclient.entities.Client;
import com.dev.dsclient.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public List<ClientDTO> findAll(){
		List<Client> list =repository.findAll();
		/*
		 * converter a lista de categoria para uma lista de categoria DTO com for ou expressão Lambda
		 */
		return list.stream().map(x -> new ClientDTO(x)).collect(Collectors.toList());
		
		 
		
	}

	public ClientDTO findById(Long id) {
		Optional<Client> obj = repository.findById(id);
		Client entity = obj.get();
		return new ClientDTO(entity);
	}

}
