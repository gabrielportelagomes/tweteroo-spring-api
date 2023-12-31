package br.com.tweteroo.api.model;

import br.com.tweteroo.api.dto.TweetDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "tweet")
public class Tweet {

	public Tweet(TweetDTO req) {
		this.username = req.username();
		this.avatar = req.avatar();
		this.tweet = req.tweet();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String username;

	@Column(nullable = false)
	private String avatar;

	@Column(nullable = false)
	private String tweet;
}
