package id.ac.astra.polytechnic.internakbe.vo;

import id.ac.astra.polytechnic.internakbe.model.User;

public class UserVo {
    private Integer usr_id;
    private String usr_fullname;
    private String usr_phone;
    private  String usr_email;
    private String usr_username;
    private String usr_password;
    private String usr_position;
    private Integer usr_status;
    private String cty_name;
    private String prv_name;

    public UserVo(){

    }

    public UserVo(User user) {
        this.usr_id = user.getUsr_id();
        this.usr_fullname = user.getUsr_fullname();
        this.usr_email = user.getUsr_email();
        this.usr_username = user.getUsr_username();
        this.usr_password = user.getUsr_password();
        this.usr_position = user.getUsr_position();
        this.usr_status = user.getUsr_status();
        this.cty_name = getCty_name();
        this.prv_name = getPrv_name();

    }

    public UserVo(Integer usr_id, String usr_fullname, String usr_phone, String usr_email, String usr_username, String usr_password, String usr_position, Integer usr_status, String cty_name, String prv_name) {
        this.usr_id = usr_id;
        this.usr_fullname = usr_fullname;
        this.usr_phone = usr_phone;
        this.usr_email = usr_email;
        this.usr_username = usr_username;
        this.usr_password = usr_password;
        this.usr_position = usr_position;
        this.usr_status = usr_status;
        this.cty_name = cty_name;
        this.prv_name = prv_name;
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
        return usr_username;
    }

    public void setUsr_username(String usr_username) {
        this.usr_username = usr_username;
    }

    public String getUsr_password() {
        return usr_password;
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
        return usr_status;
    }

    public void setUsr_status(Integer usr_status) {
        this.usr_status = usr_status;
    }

    public String getCty_name() {
        return cty_name;
    }

    public void setCty_name(String cty_name) {
        this.cty_name = cty_name;
    }

    public String getPrv_name() {
        return prv_name;
    }

    public void setPrv_name(String prv_name) {
        this.prv_name = prv_name;
    }
}
