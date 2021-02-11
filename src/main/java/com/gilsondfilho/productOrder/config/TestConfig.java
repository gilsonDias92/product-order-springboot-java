package com.gilsondfilho.productOrder.config;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.gilsondfilho.productOrder.entities.User;
import com.gilsondfilho.productOrder.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		// tudo que está aqui irá executar quando a app for iniciada
		
		User user1 = new User(null, "Jane Brown", "janeb@gmail.com", "988333888", "123456");
		User user2 = new User(null, "Nate Gibbins", "ngibbins@gmail.com", "972347777", "123456"); 
		
		userRepository.saveAll(Arrays.asList(user1, user2));

	}
	
	
	
}
