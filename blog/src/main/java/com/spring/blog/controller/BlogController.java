package com.spring.blog.controller;

import com.spring.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BlogController {

    @Autowired
    BlogService blogService;



}
