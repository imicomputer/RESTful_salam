package com.example.rest.greeting.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.rest.greeting.entity.UserPosts;

@Repository
public interface UserPostsRepository extends JpaRepository<UserPosts, Long> {
    
    @Query(value = "SELECT NEW com.example.rest.greeting.entity.UserPosts(P.body, P.created, P.slug, P.title, U.name)"
    		+ " FROM Users U INNER JOIN U.posts P ON U.id=P.userid", nativeQuery = true)
    List<UserPosts> fetchAllUserPostsInnerJoin();
}
