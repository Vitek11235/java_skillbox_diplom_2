package main.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int is_active;
    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "enum('NEW', 'ACCEPTED', 'DECLINED')")
    private ModStatus moderation_status;
    @Column(name = "moderator_id")
    private int moderatorId;
    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
    private User user;
    private Date time;
    private String title;
    private String text;
    @Column(name = "view_count")
    private int viewCount;

    public Post(int is_active, ModStatus moderation_status, int moderator_id, User user, Date time,
                String title, String text, int view_count) {
        this.is_active = is_active;
        this.moderation_status = moderation_status;
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
        return is_active;
    }

    public void setIs_active(int is_active) {
        this.is_active = is_active;
    }

    public ModStatus getModeration_status() {
        return moderation_status;
    }

    public void setModeration_status(ModStatus moderation_status) {
        this.moderation_status = moderation_status;
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
                ", is_active=" + is_active +
                ", moderation_status=" + moderation_status +
                ", moderator_id=" + moderatorId +
                ", user=" + user +
                ", time=" + time +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", view_count=" + viewCount +
                '}';
    }
}
