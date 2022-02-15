package main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "post_comments")
public class PostComments {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "parent_id")
    private int parentId;
    @ManyToOne(fetch = FetchType.LAZY)
    private Post post;
    private User user;
    private Date time;
    private String text;

    public PostComments(int parent_id, Post post, User user, Date time, String text) {
        this.parentId = parent_id;
        this.post = post;
        this.user = user;
        this.time = time;
        this.text = text;
    }
    public PostComments() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParent_id() {
        return parentId;
    }

    public void setParent_id(int parent_id) {
        this.parentId = parent_id;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "PostComments{" +
                "id=" + id +
                ", parent_id=" + parentId +
                ", post=" + post +
                ", user=" + user +
                ", time=" + time +
                ", text='" + text + '\'' +
                '}';
    }
}
