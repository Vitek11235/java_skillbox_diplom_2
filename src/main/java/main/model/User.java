package main.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private int id;
    @Column(name = "is_moderator")
    private String isModerator;
    @Column(name = "reg_time")
    private Date regTime;
    private String name;
    private String email;
    private String password;
    private String code;
    private String photo;

    public User() {
    }

    public User(String is_moderator, Date reg_time, String name, String email, String password) {
        this.isModerator = is_moderator;
        this.regTime = reg_time;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIs_moderator() {
        return isModerator;
    }

    public void setIs_moderator(String is_moderator) {
        this.isModerator = is_moderator;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", is_moderator='" + isModerator + '\'' +
                ", reg_time=" + regTime +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", code='" + code + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }
}
