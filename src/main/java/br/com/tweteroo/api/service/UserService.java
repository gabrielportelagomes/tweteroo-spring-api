package br.com.tweteroo.api.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tweteroo.api.dto.UserDTO;
import br.com.tweteroo.api.model.User;
import br.com.tweteroo.api.repository.UserRepository;
import jakarta.validation.Valid;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Transactional
	public void signUp(@Valid UserDTO req) {
		System.out.println("aqui");
		User user = new User();
		user.setUsername(req.username());
		user.setAvatar(req.avatar());

		userRepository.save(user);
		
	}

}