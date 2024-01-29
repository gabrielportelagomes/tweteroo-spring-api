package br.com.tweteroo.api.model;

import br.com.tweteroo.api.dto.TweetDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tweet")
public class Tweet {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String tweet;

	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private User user;
}
