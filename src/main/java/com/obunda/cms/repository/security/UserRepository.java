package com.obunda.cms.repository.security;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.obunda.cms.domain.security.User;

public interface UserRepository extends CrudRepository<User, UUID>{
	Optional<User> findById(UUID id);
	Optional<User> findByUsername(String username);
	Optional<User> findByEmail(String email);
}
