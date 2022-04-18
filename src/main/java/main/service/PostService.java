package main.service;

import main.api.response.PostDto;
import main.api.response.PostResponse;
import main.api.response.PostUserDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    public PostResponse getPostRespose() {
        PostResponse postResponse = new PostResponse();
        postResponse.setCount(1);

        PostUserDto user = new PostUserDto();
        user.setId(1);
        user.setName("Иван");

        PostDto post_1 = new PostDto();
        post_1.setId(11);
        post_1.setTimestamp(System.currentTimeMillis());
        post_1.setUser(user);
        post_1.setTitle("Заголовок");
        post_1.setAnnounce("Текст");
        post_1.setLikeCount(1);
        post_1.setDislikeCount(2);
        post_1.setCommentCount(3);
        post_1.setViewCount(4);

        List<PostDto> posts = new ArrayList<>();
        posts.add(post_1);

        postResponse.setPosts(posts);
        return postResponse;
    }
}
