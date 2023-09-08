package com.lamell.karin_ind_webservices.controller;

import com.lamell.karin_ind_webservices.model.Blog;
import com.lamell.karin_ind_webservices.services.BlogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api") //Innehåller första delen av mappningskommandot
public class BlogController {


    private BlogService blogService;

    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping("posts")
    @PreAuthorize("hasRole('basic')")
    public List<Blog> getAllBlogs() {return blogService.getAllBlogs();}

    @GetMapping("posts/{id}")
    @PreAuthorize("hasRole('enhanced')")
    public ResponseEntity<Blog> getBlogById(@PathVariable("id") int postId) {   //ResponseEntity ger oss möjlighet att skicka med en status, header och body
                                                                            //Det gör att vi kan ha full kontroll över vår response
        return new ResponseEntity<>(blogService.getBlogById(postId), HttpStatus.OK);
    }

    @PostMapping("newpost")
    @PreAuthorize("hasRole('basic')")
    public ResponseEntity<Blog> saveBlog(@RequestBody Blog blog){
        return new ResponseEntity<>(blogService.saveBlog(blog), HttpStatus.CREATED);

    }

    @PutMapping("updatepost/{id}")
    @PreAuthorize("hasRole('enhanced')")
    public ResponseEntity<Blog> updateBlog(@PathVariable("id") int postId, @RequestBody Blog blog){
        return ResponseEntity.ok(blogService.updateBlog(blog, postId));
    }

    @DeleteMapping("deletepost/{id}")
    @PreAuthorize("hasRole('premium')")
    ResponseEntity<String> deleteBlog(@PathVariable("id") int postId){
        blogService.deleteBlog(postId);
        return new ResponseEntity<>("Post deleted!", HttpStatus.OK);
    }

}
