package com.obunda.cms.repository.security;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.obunda.cms.domain.security.Role;

public interface RoleRepository extends CrudRepository<Role, UUID>{
	Optional<Role> findById(UUID id);
	Optional<Role> findByName(String name);
}
