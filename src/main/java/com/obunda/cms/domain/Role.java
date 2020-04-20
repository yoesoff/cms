package com.obunda.cms.domain;

import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "roles")
public class Role {
	// https://www.callicoder.com/hibernate-spring-boot-jpa-many-to-many-mapping-example/
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private UUID id;
	@Column
    private String name;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;
}