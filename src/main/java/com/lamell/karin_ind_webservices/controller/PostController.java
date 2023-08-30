package com.lamell.karin_ind_webservices.controller;

import com.lamell.karin_ind_webservices.model.Post;
import com.lamell.karin_ind_webservices.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PostController {

    @Autowired
    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("posts")
    public List<Post> getAllPosts() {return postService.getAllPosts();}

   /* @GetMapping("posts/{id}")
    public Optional<Post> getPost() {return PostService.getPost(getPost());
    )}*/

    @PostMapping("newpost")
    public ResponseEntity<Post> savePost(@RequestBody Post post){
        return new ResponseEntity<>(postService.savePost(post), HttpStatus.CREATED);

    }

    @PutMapping("updatepost/{id}")
    public ResponseEntity<Post> updatePost(@PathVariable("id") int postId, @RequestBody Post post){
        return ResponseEntity.ok(postService.updatePost(post, postId));
    }

    @DeleteMapping("deletepost/{id}")
    ResponseEntity<String> deletePost(@PathVariable("id") int postId){
        postService.deletePost(postId);
        return new ResponseEntity<String>("Post deleted!", HttpStatus.OK);
    }

}
