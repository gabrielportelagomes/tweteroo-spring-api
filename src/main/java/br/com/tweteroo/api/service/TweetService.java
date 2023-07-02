package br.com.tweteroo.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tweteroo.api.dto.TweetDTO;
import br.com.tweteroo.api.model.Tweet;
import br.com.tweteroo.api.repository.TweetRepository;
import jakarta.validation.Valid;

@Service
public class TweetService {

	@Autowired
    private TweetRepository repository;
	
	public void createTweet(@Valid TweetDTO req) {
		repository.save(new Tweet(req));
	}
}
