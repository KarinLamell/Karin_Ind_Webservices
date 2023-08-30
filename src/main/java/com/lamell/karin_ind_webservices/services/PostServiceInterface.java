package com.lamell.karin_ind_webservices.services;

import com.lamell.karin_ind_webservices.model.Post;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostServiceInterface {

    Post savePost(Post post);

    List<Post> getAllPosts();

    Optional<Post> getPost(int postId) ;

    Post updatePost(Post post, int id);

    void deletePost(int id);

  }
