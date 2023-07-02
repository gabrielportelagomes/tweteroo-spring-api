package br.com.tweteroo.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.tweteroo.api.dto.TweetDTO;
import br.com.tweteroo.api.model.Tweet;
import br.com.tweteroo.api.service.TweetService;
import jakarta.validation.Valid;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/tweets")
public class TweetController {

	@Autowired
	private TweetService service;

	@GetMapping
	public Page<Tweet> getTweets(@RequestParam("page") int page) {
		return service.findAll(page);
	}
	
	@GetMapping("/{username}")
	public List<Tweet> getTweetsByUsername(@PathVariable String username) {
		return service.findByUsername(username);
	}

	@PostMapping
	public ResponseEntity<Void> createTweet(@RequestBody @Valid TweetDTO req) {
		service.createTweet(req);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
}
