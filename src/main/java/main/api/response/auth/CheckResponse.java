package main.api.response.auth;

import main.model.User;
import org.springframework.stereotype.Component;

@Component
public class CheckResponse {
    private boolean result;
//    private User user;
//    private boolean moderation;
//    private int moderationCount;
//    private boolean settings;

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

}
