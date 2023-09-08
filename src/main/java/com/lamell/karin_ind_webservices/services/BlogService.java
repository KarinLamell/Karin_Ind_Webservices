package com.lamell.karin_ind_webservices.services;

import com.lamell.karin_ind_webservices.exceptions.ResourceNotFoundException;
import com.lamell.karin_ind_webservices.model.Blog;
import com.lamell.karin_ind_webservices.repositories.BlogRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Qualifier("blog")
@Service
public class BlogService implements BlogServiceInterface {

    private BlogRepository blogRepository;



    /*public BlogService(BlogRepository blogRepository) { //Konstruktor ger samma funktionalitet som @Autowired
        super();
        this.blogRepository = blogRepository;
    }*/

    @Override
    public Blog saveBlog(Blog blog) {
        return blogRepository.save(blog);
    }

    @Override
    public List<Blog> getAllBlogs() {
        return blogRepository.findAll();
    }

    @Override
    public Blog getBlogById(int postId) {
        Optional<Blog> blog = blogRepository.findById(postId);
        if (blog.isPresent()) {
            return blog.get();
        } else {
            throw new ResourceNotFoundException("Post", "Id", blog);
        }
    }


    @Override
    public Blog updateBlog(Blog blog, int postId) {
        Blog b = blogRepository.findById(postId).orElseThrow(() -> new ResourceNotFoundException("Post", "Id", blog));
        b.setPost(blog.getPost());
        blogRepository.save(b);
        return b;
    }

    @Override
    public void deleteBlog(int postId) {
    Blog b = blogRepository.findById(postId).orElseThrow(() -> new ResourceNotFoundException("Post", "Id", postId));
    }
}
