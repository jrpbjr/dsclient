package com.dev.dsclient.services;

import java.util.ArrayList;
import java.util.List;

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
		 * converter a lista de categoria para uma lista de categoria DTO
		 */
		List<ClientDTO> listDto = new ArrayList<>();
		for(Client clie : list) {
			listDto.add(new ClientDTO(clie));
		}
		
		return listDto;
		
	}

}
