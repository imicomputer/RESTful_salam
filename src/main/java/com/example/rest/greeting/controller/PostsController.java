package com.example.rest.greeting.controller;

import java.util.List;

import com.example.rest.greeting.entity.Posts;
import com.example.rest.greeting.repository.PostsJpaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostsController {
    @Autowired
    private PostsJpaRepository postsJpaRepository;
    
    @GetMapping("/all")
    public List<Posts> getAll() {
        return postsJpaRepository.findAll();
    }

    @GetMapping("/get/{slug}")
    public Posts getPost(@PathVariable final String slug){
        return postsJpaRepository.findBySlug(slug);
    }

    @PostMapping("/create")
    public Posts create(@RequestBody final Posts posts){
        postsJpaRepository.save(posts);
        return postsJpaRepository.findBySlug(posts.getSlug());
    }

    @GetMapping("/delete/{id}")
    public List<Posts> delete(@PathVariable final Long id){
        postsJpaRepository.deleteById(id);
        return postsJpaRepository.findAll();

    }
}
