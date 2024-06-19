package id.ac.astra.polytechnic.internakbe.vo;

import id.ac.astra.polytechnic.internakbe.model.MsCage;

public class MsCageVo {
    private String cag_name;
    private String cag_type;
    private String cag_location;
    private int cty_id;
    private int cag_capacity;
    private int cag_status;

    public MsCageVo() {
    }

    public MsCageVo(MsCage cage) {
        this.cag_name = cage.getCag_name();
        this.cag_type = cage.getCag_type();
        this.cag_location = cage.getCag_location();
        this.cty_id = cage.getCty_id();
        this.cag_capacity = cage.getCag_capacity();
        this.cag_status = cage.getCag_status();
    }

    public String getCag_name() {
        return cag_name;
    }

    public void setCag_name(String cag_name) {
        this.cag_name = cag_name;
    }

    public String getCag_type() {
        return cag_type;
    }

    public void setCag_type(String cag_type) {
        this.cag_type = cag_type;
    }

    public String getCag_location() {
        return cag_location;
    }

    public void setCag_location(String cag_location) {
        this.cag_location = cag_location;
    }

    public int getCty_id() {
        return cty_id;
    }

    public void setCty_id(int cty_id) {
        this.cty_id = cty_id;
    }

    public int getCag_capacity() {
        return cag_capacity;
    }

    public void setCag_capacity(int cag_capacity) {
        this.cag_capacity = cag_capacity;
    }

    public int getCag_status() {
        return cag_status;
    }

    public void setCag_status(int cag_status) {
        this.cag_status = cag_status;
    }
}
