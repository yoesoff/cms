package com.obunda.cms.repository.security;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.obunda.cms.domain.security.Role;

@RepositoryRestResource(collectionResourceRel = "roles", path = "roles")
public interface RoleRepository extends PagingAndSortingRepository<Role, UUID>{
	Optional<Role> findById(UUID id);
	Optional<Role> findByName(String name);
}
