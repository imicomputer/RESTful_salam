package com.example.rest.greeting.repository;

import com.example.rest.greeting.entity.Posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface PostsJpaRepository extends JpaRepository<Posts, Long> {

    Posts findBySlug(String slug);

}
