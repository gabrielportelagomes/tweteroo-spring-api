package br.com.tweteroo.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tweteroo.api.model.Tweet;

public interface TweetRepository extends JpaRepository<Tweet, Long> {

	List<Tweet> findByUserId(long userId);
}
