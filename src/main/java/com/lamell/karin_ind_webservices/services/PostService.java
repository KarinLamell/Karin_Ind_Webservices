package com.lamell.karin_ind_webservices.services;

import com.lamell.karin_ind_webservices.exceptions.ResourceNotFoundException;
import com.lamell.karin_ind_webservices.model.Post;
import com.lamell.karin_ind_webservices.model.Post;
import com.lamell.karin_ind_webservices.repositories.PostRepository;
import com.lamell.karin_ind_webservices.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Qualifier("post")
@Service
public class PostService implements PostServiceInterface{

    //@Autowired
    private PostRepository postRepository;

    @Override
    public Post savePost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }


    @Override
    public Optional<Post> getPost(int postId) {
        return postRepository.findById(postId);   }

    @Override
    public Post updatePost(Post post, int postId) {

        Post b = postRepository.findById(postId).orElseThrow(() -> new ResourceNotFoundException("Post", "Id", postId));
        b.setPost(post.getPost());
        postRepository.save(b);
        return b;
    }


    @Override
    public void deletePost(int postId) {
        postRepository.findById(postId).orElseThrow(() -> new ResourceNotFoundException("Post", "Id", postId));
        postRepository.deleteById(postId);

    }
}
