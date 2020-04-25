package com.obunda.cms.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.obunda.cms.domain.security.Role;
import com.obunda.cms.domain.security.User;
import com.obunda.cms.repository.security.RoleRepository;
import com.obunda.cms.repository.security.UserRepository;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;

@Service
public class UserService {

	@Autowired
    private UserRepository userRepository;
	@Autowired
    private RoleRepository roleRepository;
	@Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public Optional<User> findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public Optional<User> findUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public User saveUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActive(true);
        Optional<Role> userRole = roleRepository.findByName("ADMIN");
        if (userRole.isPresent()) {
        	user.setRoles(new HashSet<Role>(Arrays.asList(userRole.get())));
        }
        return userRepository.save(user);
    }

}