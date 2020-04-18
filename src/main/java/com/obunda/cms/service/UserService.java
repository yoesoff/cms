package com.obunda.cms.service;

import com.obunda.cms.domain.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}