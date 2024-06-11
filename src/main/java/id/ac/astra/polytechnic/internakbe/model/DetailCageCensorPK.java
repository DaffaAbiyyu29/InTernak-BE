package id.ac.astra.polytechnic.internakbe.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class DetailCageCensorPK implements Serializable {
    @Column(name = "dtc_id")
    private Integer dtc_id;
    @Column(name = "cag_id")
    private Integer cag_id;
    @Column(name = "cns_id")
    private Integer cns_id;

    public DetailCageCensorPK() {
    }

    public DetailCageCensorPK(Integer dtc_id, Integer cag_id, Integer cns_id) {
        this.dtc_id = dtc_id;
        this.cag_id = cag_id;
        this.cns_id = cns_id;
    }

    public Integer getDtc_id() {
        return dtc_id;
    }

    public void setDtc_id(Integer dtc_id) {
        this.dtc_id = dtc_id;
    }

    public Integer getCag_id() {
        return cag_id;
    }

    public void setCag_id(Integer cag_id) {
        this.cag_id = cag_id;
    }

    public Integer getCns_id() {
        return cns_id;
    }

    public void setCns_id(Integer cns_id) {
        this.cns_id = cns_id;
    }
}
