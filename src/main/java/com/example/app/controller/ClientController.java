package com.example.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.model.Client;
import com.example.app.repository.ClientRepository;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("api/v1/")
public class ClientController {

	@Autowired
	ClientRepository clientRepository;
	
	//recuper la liste des client
	
	
	@GetMapping("/clients")
	List<Client> getListClientList() {
	return clientRepository.findAll();
	}
	
	
	@PostMapping("/clients")
	public void createClient(@RequestBody Client client) {
		clientRepository.save(client);
	}
	
	@GetMapping("clients/{id}")
	 Optional<Client> getClient(@PathVariable ("id") long id) {
		return clientRepository.findById(id);
		
	}
	@PutMapping("/clients/{id}")
	public void updateClient(@RequestBody Client client) {
		clientRepository.save(client);
	}
	
	@DeleteMapping("/clients/{id}") 
		public void deleteClient(@PathVariable ("id") long id) {
			clientRepository.deleteById(id);
	}
	
}
