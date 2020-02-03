package com.spring.blog.repository;

import com.spring.blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
// Jpa.repository imports add/update/delete methods

public interface BlogRepository extends JpaRepository<Post, Long> {


}
