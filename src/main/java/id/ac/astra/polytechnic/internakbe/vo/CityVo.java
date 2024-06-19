package id.ac.astra.polytechnic.internakbe.vo;

import id.ac.astra.polytechnic.internakbe.model.City;

public class CityVo {
    private Integer cty_id;
    private String cty_name;
    private  Integer prv_id;

    public CityVo(City city) {
        this.cty_id = city.getCty_id();
        this.cty_name = city.getCty_name();
        this.prv_id = city.getPrv_id();
    }

    public Integer getCty_id() {
        return cty_id;
    }

    public void setCty_id(Integer cty_id) {
        this.cty_id = cty_id;
    }

    public String getCty_name() {
        return cty_name;
    }

    public void setCty_name(String cty_name) {
        this.cty_name = cty_name;
    }

    public Integer getPrv_id() {
        return prv_id;
    }

    public void setPrv_id(Integer prv_id) {
        this.prv_id = prv_id;
    }
}
