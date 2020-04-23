package com.obunda.cms.domain.asset;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

import com.obunda.cms.domain.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity
@Audited
@Table(name = "categories")
public class Category  extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7005355493298249911L;

	@Column
    private String name;
	
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "post_category",
    joinColumns = @JoinColumn(name = "category_id", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "post_id", referencedColumnName = "id"))
    private Set<Post> posts;
}
