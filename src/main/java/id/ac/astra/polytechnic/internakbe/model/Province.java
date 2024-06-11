package id.ac.astra.polytechnic.internakbe.model;

import jakarta.persistence.*;

@Entity
@Table(
        name = "ms_province"
)
public class Province {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Column(
            name = "prv_id"
    )
    private Integer prv_id;

    @Column(
            name = "prv_name"
    )
    private  String prv_name;

    public Province(){

    }

    public Province(Integer prv_id, String prv_name) {
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
