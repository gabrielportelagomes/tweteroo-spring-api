package br.com.tweteroo.api.service;

import java.util.List;
import java.util.Optional;

import br.com.tweteroo.api.model.User;
import br.com.tweteroo.api.repository.UserRepository;
import jakarta.transaction.Transactional;
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
    private TweetRepository tweetRepository;

	@Autowired
	private UserRepository userRepository;
	
	public Page<Tweet> findAll(int page) {
		int pageSize = 5;
        PageRequest pageRequest = PageRequest.of(page, pageSize, Sort.by(Sort.Direction.DESC, "id"));
        return tweetRepository.findAll(pageRequest);
	}
	
	public List<Tweet> findByUserId(long userId) {
		return tweetRepository.findByUserId(userId);
	}

	@Transactional
	public void createTweet(@Valid TweetDTO req) {
		Optional<User> userOptional = userRepository.findById(req.userId());
		if(userOptional.isEmpty()){
			throw new RuntimeException("Usuário não encontrado");
		}
		User user = userOptional.get();

		Tweet newTweet = new Tweet();
		newTweet.setTweet(req.tweet());
		newTweet.setUser(user);

		tweetRepository.save(newTweet);
	}
}
