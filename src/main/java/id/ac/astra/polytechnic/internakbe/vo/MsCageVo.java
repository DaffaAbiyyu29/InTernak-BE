package id.ac.astra.polytechnic.internakbe.vo;

import id.ac.astra.polytechnic.internakbe.model.MsCage;

public class MsCageVo {
    private String cns_name;
    private String cns_type;
    private int city_id;
    private int cag_capacity;
    private int cag_status;

    public MsCageVo() {
    }

    public MsCageVo(MsCage msCage) {
        this.cns_name = msCage.getCag_name();
        this.cns_type = msCage.getCag_type();
        this.city_id = msCage.getCty_id();
        this.cag_capacity = msCage.getCag_capacity();
        this.cag_status = msCage.getCag_status();
    }

    public String getCns_name() {
        return cns_name;
    }

    public void setCns_name(String cns_name) {
        this.cns_name = cns_name;
    }

    public String getCns_type() {
        return cns_type;
    }

    public void setCns_type(String cns_type) {
        this.cns_type = cns_type;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
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
