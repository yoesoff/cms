package com.obunda.cms.domain.config;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.envers.Audited;
import org.hibernate.validator.constraints.URL;

import com.obunda.cms.domain.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Audited
@Entity
@Table(name = "organizations")
public class Organization extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6567705970294767272L;

	@Column
	@NotNull
	@Size(min=1, max=100)
	private String name;
	
	@Column
	private String tagline;
	
	@Column(columnDefinition="TEXT")
	private String vision;
	
	@Column(columnDefinition="TEXT")
	private String mission;
	
	@Column(columnDefinition="TEXT")
	private String description;
	
	@Column(columnDefinition="TEXT")
	private String address;
	
	@Column
	@URL
	private String website;
	
	@Column
	@Email
	private String email;

	@Column
	private String fax;
	
	@Column
	private String mobile;
	
	@Column
	private String phone;
	
}
