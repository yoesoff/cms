package com.obunda.cms.dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.obunda.cms.domain.User;

public interface UserRepository extends JpaRepository<User, UUID>{
	User findByUsername(String username);
	
}
