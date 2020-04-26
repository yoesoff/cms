package com.obunda.cms.repository.asset;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.obunda.cms.domain.asset.Post;

@RepositoryRestResource(collectionResourceRel = "posts", path = "posts")
public interface PostRepository extends PagingAndSortingRepository<Post, UUID>{
	Optional<Post> findById(UUID id);
	Optional<Post> findByTitle(String title);
}
