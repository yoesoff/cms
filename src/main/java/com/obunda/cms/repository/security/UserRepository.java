package com.obunda.cms.repository.security;

import java.util.Optional;
import java.util.Set;
import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.obunda.cms.domain.security.User;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends PagingAndSortingRepository<User, UUID>{
	Optional<User> findById(@Param("id") UUID id);
	Optional<User> findByUsername(@Param("username") String username);
	Optional<User> findByEmail(@Param("email") String email);
	Set<User> findByActive(@Param("active") Boolean active);
}
