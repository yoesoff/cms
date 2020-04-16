package com.obunda.cms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.obunda.cms.dao.UserRepository;
import com.obunda.cms.domain.User;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;
	
	public void dummy(User user) {
		userRepo.save(user);
	}
}
