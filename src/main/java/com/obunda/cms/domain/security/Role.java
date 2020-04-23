package com.obunda.cms.domain.security;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

import com.obunda.cms.domain.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity
@Audited
@Table(name = "roles")
public class Role extends BaseEntity{
	// https://www.callicoder.com/hibernate-spring-boot-jpa-many-to-many-mapping-example/

	/**
	 * 
	 */
	private static final long serialVersionUID = 8454595129644237788L;

	@Column
    private String name;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "roles")
    private Set<User> users;
}