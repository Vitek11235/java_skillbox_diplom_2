package main.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "post_votes")
public class PostVotes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private User user;
    @ManyToOne(fetch = FetchType.LAZY)
    private Post post;
    private Date time;
    private int value;

    public PostVotes(User user, Post post, Date time, int value) {
        this.user = user;
        this.post = post;
        this.time = time;
        this.value = value;
    }
    public PostVotes() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "PostVotes{" +
                "id=" + id +
                ", user=" + user +
                ", post=" + post +
                ", time=" + time +
                ", value=" + value +
                '}';
    }
}
