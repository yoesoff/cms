package com.obunda.cms.repository.asset;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.obunda.cms.domain.asset.Post;

public interface PostRepository extends CrudRepository<Post, UUID>{
	Optional<Post> findById(UUID id);
	Optional<Post> findByTitle(String title);
}
