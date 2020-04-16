package com.obunda.cms.domain;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name="users")
public class User {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private UUID id;
	
	@Column
    private String username;
	
	@Column
    private String firstname;
	
	@Column
    private String lastname;
	
	@Column
    private String password;

    private String matchingPassword;
    
    @Column
    private String email;
}
