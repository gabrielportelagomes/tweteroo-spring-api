package br.com.tweteroo.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.tweteroo.api.dto.TweetDTO;
import br.com.tweteroo.api.model.Tweet;
import br.com.tweteroo.api.repository.TweetRepository;
import jakarta.validation.Valid;

@Service
public class TweetService {

	@Autowired
    private TweetRepository repository;
	
	public Page<Tweet> findAll(int page) {
		int pageSize = 5;
        PageRequest pageRequest = PageRequest.of(page, pageSize, Sort.by(Sort.Direction.DESC, "id"));
        return repository.findAll(pageRequest);
	}
	
	public void createTweet(@Valid TweetDTO req) {
		repository.save(new Tweet(req));
	}
}
