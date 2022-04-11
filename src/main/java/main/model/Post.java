package main.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "is_active", nullable = false)
    private int isActive;
    @Enumerated(EnumType.STRING)
    @Column(name = "moderation_status", nullable = false, columnDefinition = "enum('NEW', 'ACCEPTED', 'DECLINED')")
    private ModStatus moderationStatus;
    @Column(name = "moderator_id")
    private int moderatorId;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    @Column(nullable = false)
    private Date time;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false, columnDefinition = "text")
    private String text;
    @Column(name = "view_count", nullable = false)
    private int viewCount;
    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    private List<PostComments> postComments;
    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    private List<PostVotes> postVotes;
    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    private List<Tag2Post> tag2Posts;

    public Post(int is_active, ModStatus moderation_status, int moderator_id, User user, Date time,
                String title, String text, int view_count) {
        this.isActive = is_active;
        this.moderationStatus = moderation_status;
        this.moderatorId = moderator_id;
        this.user = user;
        this.time = time;
        this.title = title;
        this.text = text;
        this.viewCount = view_count;
    }
    public Post() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIs_active() {
        return isActive;
    }

    public void setIs_active(int is_active) {
        this.isActive = is_active;
    }

    public ModStatus getModeration_status() {
        return moderationStatus;
    }

    public void setModeration_status(ModStatus moderation_status) {
        this.moderationStatus = moderation_status;
    }

    public int getModerator_id() {
        return moderatorId;
    }

    public void setModerator_id(int moderator_id) {
        this.moderatorId = moderator_id;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getView_count() {
        return viewCount;
    }

    public void setView_count(int view_count) {
        this.viewCount = view_count;
    }

    @Override
    public String toString() {
        return "Posts{" +
                "id=" + id +
                ", is_active=" + isActive +
                ", moderation_status=" + moderationStatus +
                ", moderator_id=" + moderatorId +
                ", user=" + user +
                ", time=" + time +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", view_count=" + viewCount +
                '}';
    }
}
