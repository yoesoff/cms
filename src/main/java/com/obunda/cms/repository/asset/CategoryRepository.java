package com.obunda.cms.repository.asset;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.obunda.cms.domain.asset.Category;

public interface CategoryRepository extends CrudRepository<Category, UUID>{
	Optional<Category> findById(UUID id);
	Optional<Category> findByTitle(String title);
}
