package com.obunda.cms.domain;

import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity(name="users")
public class User {
	// https://www.callicoder.com/hibernate-spring-boot-jpa-many-to-many-mapping-example/

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
	
	@Transient
	private String passwordConfirm;
    
    @Column
    private String email;
    
    @Column(name = "active")
    private Boolean active;
    
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role",
    joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
    private Set<Role> roles;
}
