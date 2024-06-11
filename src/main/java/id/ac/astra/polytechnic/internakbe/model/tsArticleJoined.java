package id.ac.astra.polytechnic.internakbe.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
@Entity
public class tsArticleJoined {
    @Id
    private Integer atc_id;
    private String atc_title;
    private String atc_content;
    private LocalDateTime atc_date;
    private String atc_attachment;
    private String atc_type;
    private String atc_category;
    private Integer atc_status;
    private Integer usr_id;
    private String usr_fullname;

    public tsArticleJoined(Integer atc_id, String atc_title, String atc_content, LocalDateTime atc_date, String atc_attachment, String atc_type, String atc_category, Integer atc_status, Integer usr_id, String usr_fullname) {
        this.atc_id = atc_id;
        this.atc_title = atc_title;
        this.atc_content = atc_content;
        this.atc_date = atc_date;
        this.atc_attachment = atc_attachment;
        this.atc_type = atc_type;
        this.atc_category = atc_category;
        this.atc_status = atc_status;
        this.usr_id = usr_id;
        this.usr_fullname = usr_fullname;
    }

    public tsArticleJoined() {
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

    public Integer getUsr_id() {
        return usr_id;
    }

    public void setUsr_id(Integer usr_id) {
        this.usr_id = usr_id;
    }

    public String getUsr_fullname() {
        return usr_fullname;
    }

    public void setUsr_fullname(String usr_fullname) {
        this.usr_fullname = usr_fullname;
    }
}
