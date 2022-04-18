package main.controller;

import main.api.response.auth.CheckResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiAuthController {

    private final CheckResponse checkResponse;

    public ApiAuthController(CheckResponse checkResponse) {
        this.checkResponse = checkResponse;
    }

    @GetMapping("/api/auth/check")
    private CheckResponse check() {
        return checkResponse;
    }

}
