package br.com.tweteroo.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tweteroo.api.dto.UserDTO;
import br.com.tweteroo.api.service.UserService;
import jakarta.validation.Valid;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/auth/sign-up")
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping
	public ResponseEntity<Void> signUp(@RequestBody @Valid UserDTO req) {
		service.signUp(req);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
}
