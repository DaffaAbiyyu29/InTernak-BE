package id.ac.astra.polytechnic.internakbe.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ms_cage")
public class MsCage {
    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cag_id")
    private Integer cag_id;
    @Column(name = "cag_name")
    private String cag_name;
    @Column(name = "cag_location")
    private String cag_location;
    @Column(name = "cag_type")
    private String cag_type;
    @Column(name = "cty_id")
    private Integer cty_id;

    @Column(name = "prv_id")
    private Integer prv_id;
    @Column(name = "cag_capacity")
    private Integer cag_capacity;
    @Column(name = "cag_status")
    private Integer cag_status;

    public MsCage() {
    }

//    public MsCage(Integer cag_id, String cag_name, String cag_type, Integer cty_id, Integer cag_capacity, Integer cag_status) {
//        this.cag_id = cag_id;
//        this.cag_name = cag_name;
//        this.cag_type = cag_type;
//        this.cty_id = cty_id;
//        this.cag_capacity = cag_capacity;
//        this.cag_status = cag_status;
//    }

    public MsCage(Integer cag_id, String cag_name, String cag_location, String cag_type, Integer cty_id, Integer cag_capacity, Integer cag_status) {
        this.cag_id = cag_id;
        this.cag_name = cag_name;
        this.cag_location = cag_location;
        this.cag_type = cag_type;
        this.cty_id = cty_id;
        this.cag_capacity = cag_capacity;
        this.cag_status = cag_status;
    }

    public MsCage(Integer cag_id, String cag_name, String cag_location, String cag_type, Integer cty_id, Integer prv_id, Integer cag_capacity, Integer cag_status) {
        this.cag_id = cag_id;
        this.cag_name = cag_name;
        this.cag_location = cag_location;
        this.cag_type = cag_type;
        this.cty_id = cty_id;
        this.prv_id = prv_id;
        this.cag_capacity = cag_capacity;
        this.cag_status = cag_status;
    }

    public Integer getCag_id() {
        return cag_id;
    }

    public void setCag_id(Integer cag_id) {
        this.cag_id = cag_id;
    }

    public String getCag_name() {
        return cag_name;
    }

    public void setCag_name(String cag_name) {
        this.cag_name = cag_name;
    }

    public String getCag_location() {
        return cag_location;
    }

    public void setCag_location(String cag_location) {
        this.cag_location = cag_location;
    }

    public String getCag_type() {
        return cag_type;
    }

    public void setCag_type(String cag_type) {
        this.cag_type = cag_type;
    }

    public Integer getCty_id() {
        return cty_id;
    }

    public void setCty_id(Integer cty_id) {
        this.cty_id = cty_id;
    }

    public Integer getPrv_id() {
        return prv_id;
    }

    public void setPrv_id(Integer prv_id) {
        this.prv_id = prv_id;
    }

    public Integer getCag_capacity() {
        return cag_capacity;
    }

    public void setCag_capacity(Integer cag_capacity) {
        this.cag_capacity = cag_capacity;
    }

    public Integer getCag_status() {
        return cag_status;
    }

    public void setCag_status(Integer cag_status) {
        this.cag_status = cag_status;
    }
}
