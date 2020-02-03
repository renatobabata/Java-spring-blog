package com.spring.blog.service;

import com.spring.blog.model.Post;

import java.util.List;

public interface BlogService {

    List<Post> findAll(); // It will list all posts

    Post findBYId(long id); // It will show a post with specify ID

    Post save(Post post); // It will send a post to save in DB
}
