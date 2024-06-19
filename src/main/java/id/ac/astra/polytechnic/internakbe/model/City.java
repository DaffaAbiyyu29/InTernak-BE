package id.ac.astra.polytechnic.internakbe.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ms_city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cty_id")
    private Integer cty_id;

    @Column(name = "cty_name")
    private  String cty_name;

    @Column(name = "prv_id")
    private Integer prvId;

    public City(){

    }

    public City(Integer cty_id, String cty_name, Integer prvId) {
        this.cty_id = cty_id;
        this.cty_name = cty_name;
        this.prvId = prvId;
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
        return prvId;
    }

    public void setPrv_id(Integer prvId) {
        this.prvId = prvId;
    }
}
