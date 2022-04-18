package main.api.response;

import main.model.Post;
import main.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PostResponse {
//    private User user;
//    private Post post;

    private int count;
    private List<Post> posts;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }



}
