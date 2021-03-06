package main.api.response;

import main.model.Post;
import main.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PostResponse {
    private int count;
    private List<PostDto> posts;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<PostDto> getPosts() {
        return posts;
    }

    public void setPosts(List<PostDto> posts) {
        this.posts = posts;
    }

}
