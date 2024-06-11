package id.ac.astra.polytechnic.internakbe.vo;

import id.ac.astra.polytechnic.internakbe.model.DetailCageCensor;

import java.io.Serializable;

public class DetailCageCensorVo implements Serializable {
    private Integer dtc_id;
    private Integer cag_id;
    private String cag_desc;
    private Integer cns_id;
    private String cns_desc;
    private Integer dtc_status;

    public DetailCageCensorVo() {
    }

    public DetailCageCensorVo(DetailCageCensor detailCageCensor) {
        this.dtc_id = detailCageCensor.getDetailCageCensorPK().getDtc_id();
        this.cag_id = detailCageCensor.getDetailCageCensorPK().getCag_id();
        this.cns_id = detailCageCensor.getDetailCageCensorPK().getCns_id();
        this.dtc_status = detailCageCensor.getDtc_status();
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

    public Integer getDtc_status() {
        return dtc_status;
    }

    public void setDtc_status(Integer dtc_status) {
        this.dtc_status = dtc_status;
    }

    public String getCag_desc() {
        return cag_desc;
    }

    public void setCag_desc(String cag_desc) {
        this.cag_desc = cag_desc;
    }

    public String getCns_desc() {
        return cns_desc;
    }

    public void setCns_desc(String cns_desc) {
        this.cns_desc = cns_desc;
    }
}
