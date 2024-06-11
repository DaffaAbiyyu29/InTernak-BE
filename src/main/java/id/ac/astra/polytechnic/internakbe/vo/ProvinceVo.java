package id.ac.astra.polytechnic.internakbe.vo;

import id.ac.astra.polytechnic.internakbe.model.Province;


public class ProvinceVo {
    private Integer prv_id;
    private String prv_name;
    public ProvinceVo(Province province) {
        this.prv_id = province.getPrv_id();
        this.prv_name = province.getPrv_name();
    }

    public ProvinceVo(Integer prv_id, String prv_name) {
        this.prv_id = prv_id;
        this.prv_name = prv_name;
    }


    public Integer getPrv_id() {
        return prv_id;
    }

    public void setPrv_id(Integer prv_id) {
        this.prv_id = prv_id;
    }

    public String getPrv_name() {
        return prv_name;
    }

    public void setPrv_name(String prv_name) {
        this.prv_name = prv_name;
    }
}
