package main.api.response.auth;

import main.model.User;
import org.springframework.beans.factory.annotation.Value;

public class CheckResponse {
    private boolean result;
    private User user;
}
