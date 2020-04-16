package com.obunda.cms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.obunda.cms.domain.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
}
