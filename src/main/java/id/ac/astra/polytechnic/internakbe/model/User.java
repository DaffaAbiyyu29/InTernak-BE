package id.ac.astra.polytechnic.internakbe.model;

import jakarta.persistence.*;

@Entity
@Table(
        name = "ms_user"
)
public class User {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Column(
            name = "usr_id"
    )
    private Integer usr_id;
    @Column(
            name = "usr_fullname"
    )
    private String usr_fullname;

    @Column(
            name = "usr_phone"
    )
    private String usr_phone;

    @Column(
            name = "usr_email"
    )
    private String usr_email;
    @Column(
            name = "usr_username"
    )
    private String usr_username;
    @Column(
            name = "usr_password"
    )
    private String usr_password;
    @Column(
            name = "usr_position"
    )
    private String usr_position;
    @Column(
            name = "usr_status"
    )
    private Integer usr_status;

    @Column(
            name = "cty_id"
    )
    private Integer cty_id;

    public User() {
    }

    public User(Integer usr_id, String usr_fullname, String usr_phone, String usr_email, String usr_username, String usr_password, String usr_position, Integer usr_status, Integer cty_id) {
        this.usr_id = usr_id;
        this.usr_fullname = usr_fullname;
        this.usr_phone = usr_phone;
        this.usr_email = usr_email;
        this.usr_username = usr_username;
        this.usr_password = usr_password;
        this.usr_position = usr_position;
        this.usr_status = usr_status;
        this.cty_id = cty_id;
    }

    public Integer getUsr_id() {
        return this.usr_id;
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

    public String getUsr_phone() {
        return usr_phone;
    }

    public void setUsr_phone(String usr_phone) {
        this.usr_phone = usr_phone;
    }

    public String getUsr_email() {
        return usr_email;
    }

    public void setUsr_email(String usr_email) {
        this.usr_email = usr_email;
    }

    public String getUsr_username() {
        return this.usr_username;
    }

    public void setUsr_username(String usr_username) {
        this.usr_username = usr_username;
    }

    public String getUsr_password() {
        return this.usr_password;
    }

    public void setUsr_password(String usr_password) {
        this.usr_password = usr_password;
    }

    public String getUsr_position() {
        return usr_position;
    }

    public void setUsr_position(String usr_position) {
        this.usr_position = usr_position;
    }

    public Integer getUsr_status() {
        return this.usr_status;
    }

    public void setUsr_status(Integer usr_status) {
        this.usr_status = usr_status;
    }

    public Integer getCty_id() {
        return cty_id;
    }

    public void setCty_id(Integer cty_id) {
        this.cty_id = cty_id;
    }

    public void setId(int id) {
    }
}
