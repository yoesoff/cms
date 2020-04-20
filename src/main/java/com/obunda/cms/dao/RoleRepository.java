package com.obunda.cms.dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.obunda.cms.domain.Role;

public interface RoleRepository extends JpaRepository<Role, UUID>{
	Role findByName(String name);
}