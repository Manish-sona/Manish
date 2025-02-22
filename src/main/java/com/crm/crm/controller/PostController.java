package com.crm.crm.controller;


import com.crm.crm.entity.Post;
import com.crm.crm.repository.CommentRepository;
import com.crm.crm.repository.PostRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {

    private PostRepository postRepository;
    private CommentRepository commentRep;

    public PostController(PostRepository postRepository, CommentRepository commentRep) {
        this.postRepository = postRepository;
        this.commentRep = commentRep;
    }

    @PostMapping
    public String createPost(
            @RequestBody Post post
    ){
        postRepository.save(post);
        return "Post created successfully";
    }
    @DeleteMapping
    public void deletePost(){
        postRepository.deleteById(1L);
    }


}
