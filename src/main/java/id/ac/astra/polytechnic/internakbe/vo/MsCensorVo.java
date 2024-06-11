package id.ac.astra.polytechnic.internakbe.vo;

import id.ac.astra.polytechnic.internakbe.model.MsCensor;

public class MsCensorVo {
    private String cns_name;
    private String cns_description;
    private int cns_status;

    public MsCensorVo() {
    }

    public MsCensorVo(MsCensor msCensor) {
        this.cns_name = msCensor.getCns_name();
        this.cns_description = msCensor.getCns_description();
        this.cns_status = msCensor.getCns_status();
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

    public int getCns_status() {
        return cns_status;
    }

    public void setCns_status(int cns_status) {
        this.cns_status = cns_status;
    }
}
