package com.obunda.cms.repository.asset;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.obunda.cms.domain.asset.Tag;

@RepositoryRestResource(collectionResourceRel = "tags", path = "tags")
public interface TagRepository extends PagingAndSortingRepository<Tag, UUID>{
	Optional<Tag> findById(UUID id);
	Optional<Tag> findByTitle(String title);
}
