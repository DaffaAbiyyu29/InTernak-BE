package id.ac.astra.polytechnic.internakbe.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "ts_article")
public class tsArticle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "atc_id")
    private Integer atc_id;
    @Column(name = "atc_title")
    private String atc_title;
    @Column(name = "atc_content")
    private String atc_content;
    @Column(name = "usr_id")
    private Integer usr_id;
    @Column(name = "atc_date")
    private LocalDateTime atc_date;
    @Column(name = "atc_attachment")
    private String atc_attachment;
    @Column(name = "atc_type")
    private String atc_type;
    @Column(name = "atc_category")
    private String atc_category;
    @Column(name = "atc_status")
    private Integer atc_status;

    public tsArticle() {
    }

    public tsArticle(Integer atc_id, String atc_title, String atc_content, Integer usr_id, LocalDateTime atc_date, String atc_attachment, String atc_type, String atc_category, Integer atc_status) {
        this.atc_id = atc_id;
        this.atc_title = atc_title;
        this.atc_content = atc_content;
        this.usr_id = usr_id;
        this.atc_date = atc_date;
        this.atc_attachment = atc_attachment;
        this.atc_type = atc_type;
        this.atc_category = atc_category;
        this.atc_status = atc_status;
    }

    public Integer getAtc_id() {
        return atc_id;
    }

    public void setAtc_id(Integer atc_id) {
        this.atc_id = atc_id;
    }

    public String getAtc_title() {
        return atc_title;
    }

    public void setAtc_title(String atc_title) {
        this.atc_title = atc_title;
    }

    public String getAtc_content() {
        return atc_content;
    }

    public void setAtc_content(String atc_content) {
        this.atc_content = atc_content;
    }

    public Integer getUsr_id() {
        return usr_id;
    }

    public void setUsr_id(Integer usr_id) {
        this.usr_id = usr_id;
    }

    public LocalDateTime getAtc_date() {
        return atc_date;
    }

    public void setAtc_date(LocalDateTime atc_date) {
        this.atc_date = atc_date;
    }

    public String getAtc_attachment() {
        return atc_attachment;
    }

    public void setAtc_attachment(String atc_attachment) {
        this.atc_attachment = atc_attachment;
    }

    public String getAtc_type() {
        return atc_type;
    }

    public void setAtc_type(String atc_type) {
        this.atc_type = atc_type;
    }

    public String getAtc_category() {
        return atc_category;
    }

    public void setAtc_category(String atc_category) {
        this.atc_category = atc_category;
    }

    public Integer getAtc_status() {
        return atc_status;
    }

    public void setAtc_status(Integer atc_status) {
        this.atc_status = atc_status;
    }
}
