package com.gilsondfilho.productOrder.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gilsondfilho.productOrder.entities.User;

// recurso web implementado por um controlador rest

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	// endpoint para acessar usuários
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		
		User user = new User(
				1L,
				"João",
				"joao.123@xxx.com",
				"1234567",
				"222222");
		
		return ResponseEntity.ok().body(user);
	}
	

}
