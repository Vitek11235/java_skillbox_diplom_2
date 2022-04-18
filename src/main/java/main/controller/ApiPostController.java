package main.controller;

import main.api.response.PostResponse;
import main.service.PostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiPostController {

    private PostResponse postResponse;
    private PostService postService;

    public ApiPostController(PostResponse postResponse, PostService postService) {
        this.postResponse = postResponse;
        this.postService = postService;
    }

    @GetMapping("/api/post")
    private PostResponse post() {
        return postService.getPostRespose();
    }

    @GetMapping("/api/post/search")
    private PostResponse search() {
        return postResponse;
    }
}