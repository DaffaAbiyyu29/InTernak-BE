package id.ac.astra.polytechnic.internakbe.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "dt_cage_censor")
public class DetailCageCensor implements Serializable {
    @EmbeddedId
    private DetailCageCensorPK detailCageCensorPK;
    @Column(name = "dtc_status")
    private Integer dtc_status;


    public DetailCageCensor() {
    }

    public DetailCageCensor(DetailCageCensorPK detailCageCensorPK, Integer dtc_status) {
        this.detailCageCensorPK = detailCageCensorPK;
        this.dtc_status = dtc_status;
    }

    public DetailCageCensorPK getDetailCageCensorPK() {
        return detailCageCensorPK;
    }

    public void setDetailCageCensorPK(DetailCageCensorPK detailCageCensorPK) {
        this.detailCageCensorPK = detailCageCensorPK;
    }

    public Integer getDtc_status() {
        return dtc_status;
    }

    public void setDtc_status(Integer dtc_status) {
        this.dtc_status = dtc_status;
    }
}
