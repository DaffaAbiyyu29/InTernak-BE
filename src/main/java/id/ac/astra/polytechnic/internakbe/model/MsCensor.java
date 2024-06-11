package id.ac.astra.polytechnic.internakbe.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ms_censor")
public class MsCensor {
    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cns_id")
    private Integer cns_id;
    @Column(name = "cns_name")
    private String cns_name;
    @Column(name = "cns_description")
    private String cns_description;
    @Column(name = "cns_status")
    private Integer cns_status;

    public MsCensor() {
    }

    public MsCensor(Integer cns_id, String cns_name, String cns_description, Integer cns_status) {
        this.cns_id = cns_id;
        this.cns_name = cns_name;
        this.cns_description = cns_description;
        this.cns_status = cns_status;
    }

    public Integer getCns_id() {
        return cns_id;
    }

    public void setCns_id(Integer cns_id) {
        this.cns_id = cns_id;
    }

    public String getCns_name() {
        return cns_name;
    }

    public void setCns_name(String cns_name) {
        this.cns_name = cns_name;
    }

    public String getCns_description() {
        return cns_description;
    }

    public void setCns_description(String cns_description) {
        this.cns_description = cns_description;
    }

    public Integer getCns_status() {
        return cns_status;
    }

    public void setCns_status(Integer cns_status) {
        this.cns_status = cns_status;
    }
}
