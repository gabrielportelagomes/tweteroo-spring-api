package br.com.tweteroo.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tweteroo.api.dto.TweetDTO;
import br.com.tweteroo.api.service.TweetService;
import jakarta.validation.Valid;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/tweets")
public class TweetController {

	
	@Autowired
	private TweetService service;

	@PostMapping
	public ResponseEntity<Void> createTweet(@RequestBody @Valid TweetDTO req) {
		service.createTweet(req);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
}
