package id.ac.astra.polytechnic.internakbe.model;

import jakarta.persistence.*;

@Entity
@Table(
        name = "ms_city"
)
public class City {
    @Id
    @GeneratedValue(
    strategy = GenerationType.IDENTITY
)
@Column(
        name = "cty_id"
)
private Integer cty_id;

    @Column(
            name = "cty_name"
    )
    private  String cty_name;

    @Column(
            name = "prv_id"
    )
    private Integer prv_id;

    public City(){

    }

    public City(Integer cty_id, String cty_name, Integer prv_id) {
        this.cty_id = cty_id;
        this.cty_name = cty_name;
        this.prv_id = prv_id;
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
