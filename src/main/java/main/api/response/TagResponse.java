package main.api.response;

import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class TagResponse {
    private List<TagDto> tags;

    public List<TagDto> getTags() {
        return tags;
    }

    public void setTags(List<TagDto> tags) {
        this.tags = tags;
    }
}
