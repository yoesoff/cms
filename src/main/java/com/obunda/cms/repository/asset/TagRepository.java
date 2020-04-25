package com.obunda.cms.repository.asset;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.obunda.cms.domain.asset.Tag;

public interface TagRepository extends CrudRepository<Tag, UUID>{
	Optional<Tag> findById(UUID id);
	Optional<Tag> findByTitle(String title);
}
