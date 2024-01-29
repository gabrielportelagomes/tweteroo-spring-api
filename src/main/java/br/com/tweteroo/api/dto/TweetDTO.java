package br.com.tweteroo.api.dto;

import jakarta.validation.constraints.NotBlank;

public record TweetDTO(@NotBlank long userId, @NotBlank String tweet) {

}
