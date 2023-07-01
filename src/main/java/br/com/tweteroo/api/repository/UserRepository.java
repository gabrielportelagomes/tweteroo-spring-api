package br.com.tweteroo.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.tweteroo.api.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
