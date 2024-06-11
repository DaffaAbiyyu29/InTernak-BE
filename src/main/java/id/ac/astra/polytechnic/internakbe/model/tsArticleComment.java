package id.ac.astra.polytechnic.internakbe.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "ts_article_comment")
public class tsArticleComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cmt_id")
    private int cmt_id;
    @Column(name = "usr_id")
    private int usr_id;
    @Column(name = "atc_id")
    private int atc_id;
    @Column(name = "cmt_description")
    private String cmt_description;
    @Column(name = "cmt_datetime")
    private LocalDateTime cmt_datetime;

    public tsArticleComment() {
    }

    public tsArticleComment(int cmt_id, int usr_id, int atc_id, String cmr_description, LocalDateTime cmt_datetime) {
        this.cmt_id = cmt_id;
        this.usr_id = usr_id;
        this.atc_id = atc_id;
        this.cmt_description = cmr_description;
        this.cmt_datetime = cmt_datetime;
    }

    public int getCmt_id() {
        return cmt_id;
    }

    public void setCmt_id(int cmt_id) {
        this.cmt_id = cmt_id;
    }

    public int getUsr_id() {
        return usr_id;
    }

    public void setUsr_id(int usr_id) {
        this.usr_id = usr_id;
    }

    public int getAtc_id() {
        return atc_id;
    }

    public void setAtc_id(int atc_id) {
        this.atc_id = atc_id;
    }

    public String getCmt_description() {
        return cmt_description;
    }

    public void setCmt_description(String cmt_description) {
        this.cmt_description = cmt_description;
    }

    public LocalDateTime getCmt_datetime() {
        return cmt_datetime;
    }

    public void setCmt_datetime(LocalDateTime cmt_datetime) {
        this.cmt_datetime = cmt_datetime;
    }
}
