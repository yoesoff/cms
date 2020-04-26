package com.obunda.cms.repository.asset;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.obunda.cms.domain.asset.Category;

@RepositoryRestResource(collectionResourceRel = "categories", path = "categories")
public interface CategoryRepository extends PagingAndSortingRepository<Category, UUID>{
	Optional<Category> findById(UUID id);
	Optional<Category> findByTitle(String title);
}
