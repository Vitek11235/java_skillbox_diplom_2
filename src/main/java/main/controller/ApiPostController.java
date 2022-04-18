package main.controller;

import main.api.response.InitResponse;
import main.api.response.PostResponse;
import main.api.response.SettingsRespons;
import main.service.SettingsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiPostController {

    private final PostResponse postResponse;

    public ApiPostController(PostResponse postResponse) {
        this.postResponse = postResponse;
    }

    @GetMapping("/api/post")
    private PostResponse post() {
        return postResponse;
    }

}