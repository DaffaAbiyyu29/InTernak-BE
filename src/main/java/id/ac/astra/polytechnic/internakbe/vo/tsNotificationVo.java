package id.ac.astra.polytechnic.internakbe.vo;

import id.ac.astra.polytechnic.internakbe.model.tsNotification;

import java.time.LocalDateTime;

public class tsNotificationVo {

    private Integer ntf_id;
    private Integer dtc_id;
    private String ntf_title;
    private String ntf_desc;
    private String ntf_type;
    private int ntf_status;
    private LocalDateTime ntf_timestamp;

    public tsNotificationVo() {
    }  public tsNotificationVo(tsNotification tsNotification) {
        ntf_id=tsNotification.getNtf_id();
        dtc_id=tsNotification.getDtc_id();
        ntf_title=tsNotification.getNtf_title();
        ntf_desc=tsNotification.getNtf_desc();
        ntf_type=tsNotification.getNtf_type();
        ntf_status=tsNotification.getNtf_status();
        ntf_timestamp=tsNotification.getNtf_timestamp();
    }


    public tsNotificationVo(Integer ntf_id, Integer dtc_id, String ntf_title, String ntf_desc, String ntf_type, int ntf_status, LocalDateTime ntf_timestamp) {
        this.ntf_id = ntf_id;
        this.dtc_id = dtc_id;
        this.ntf_title = ntf_title;
        this.ntf_desc = ntf_desc;
        this.ntf_type = ntf_type;
        this.ntf_status = ntf_status;
        this.ntf_timestamp = ntf_timestamp;
    }

    public Integer getNtf_id() {
        return ntf_id;
    }

    public void setNtf_id(Integer ntf_id) {
        this.ntf_id = ntf_id;
    }

    public Integer getDtc_id() {
        return dtc_id;
    }

    public void setDtc_id(Integer dtc_id) {
        this.dtc_id = dtc_id;
    }

    public String getNtf_title() {
        return ntf_title;
    }

    public void setNtf_title(String ntf_title) {
        this.ntf_title = ntf_title;
    }

    public String getNtf_desc() {
        return ntf_desc;
    }

    public void setNtf_desc(String ntf_desc) {
        this.ntf_desc = ntf_desc;
    }

    public String getNtf_type() {
        return ntf_type;
    }

    public void setNtf_type(String ntf_type) {
        this.ntf_type = ntf_type;
    }

    public int getNtf_status() {
        return ntf_status;
    }

    public void setNtf_status(int ntf_status) {
        this.ntf_status = ntf_status;
    }

    public LocalDateTime getNtf_timestamp() {
        return ntf_timestamp;
    }

    public void setNtf_timestamp(LocalDateTime ntf_timestamp) {
        this.ntf_timestamp = ntf_timestamp;
    }
}
