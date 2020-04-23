package com.obunda.cms.domain.asset;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.obunda.cms.domain.BaseEntity;
import com.obunda.cms.domain.security.User;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity
@Table(name = "posts")
public class Post extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3123538914419373366L;

	@Column
    private String title;
	
	@Column(columnDefinition="TEXT")
    private String body;
	
	@Column
    private String type;
	
	@ManyToOne(fetch = FetchType.LAZY)
    private User user;
}
