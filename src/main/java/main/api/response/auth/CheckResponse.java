package main.api.response.auth;

import main.model.User;
import org.springframework.stereotype.Component;

@Component
public class CheckResponse {
    private boolean result;
    private CheckUserDto user;

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public CheckUserDto getUser() {
        return user;
    }

    public void setUser(CheckUserDto user) {
        this.user = user;
    }
}
