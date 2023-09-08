package com.lamell.karin_ind_webservices.services;

import com.lamell.karin_ind_webservices.model.Blog;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogServiceInterface {

    Blog saveBlog( Blog blog);

    List< Blog> getAllBlogs();

    Blog getBlogById(int postId) ;

    Blog updateBlog( Blog blog, int postId);

    void deleteBlog(int postId);

  }
