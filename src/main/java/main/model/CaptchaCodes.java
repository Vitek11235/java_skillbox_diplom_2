package main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name = "captcha_codes")
public class CaptchaCodes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private Date time;
    @Column(nullable = false, columnDefinition = "tinytext")
    private String code;
    @Column(name = "secret_code", nullable = false, columnDefinition = "tinytext")
    private String secretCode;

    public CaptchaCodes(Date time, String code, String secret_code) {
        this.time = time;
        this.code = code;
        this.secretCode = secret_code;
    }
    public CaptchaCodes() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSecret_code() {
        return secretCode;
    }

    public void setSecret_code(String secret_code) {
        this.secretCode = secret_code;
    }

    @Override
    public String toString() {
        return "CaptchaCodes{" +
                "id=" + id +
                ", time=" + time +
                ", code='" + code + '\'' +
                ", secret_code='" + secretCode + '\'' +
                '}';
    }
}
