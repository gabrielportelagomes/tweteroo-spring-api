package br.com.tweteroo.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tweteroo.api.dto.UserDTO;
import br.com.tweteroo.api.model.User;
import br.com.tweteroo.api.repository.UserRepository;
import jakarta.validation.Valid;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;

	public void signUp(@Valid UserDTO req) {
		repository.save(new User(req));
		
	}

}