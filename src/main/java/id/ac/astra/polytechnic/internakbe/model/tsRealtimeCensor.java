package id.ac.astra.polytechnic.internakbe.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name="ts_realtime_censor")
public class tsRealtimeCensor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rlt_id")
    private Integer rlt_id;
    @Column(name = "dtc_id")
    private Integer dtc_id;
    @Column(name="rlt_value")
    private BigDecimal rlt_value;
    @Column(name="rlt_timestamp")
    private LocalDateTime rlt_timestamp;

    public tsRealtimeCensor() {
    }

    public tsRealtimeCensor(Integer rlt_id, Integer dtc_id, BigDecimal rlt_value, LocalDateTime rlt_timestamp) {
        this.rlt_id = rlt_id;
        this.dtc_id = dtc_id;
        this.rlt_value = rlt_value;
        this.rlt_timestamp = rlt_timestamp;
    }

    public Integer getRlt_id() {
        return rlt_id;
    }

    public void setRlt_id(Integer rlt_id) {
        this.rlt_id = rlt_id;
    }

    public Integer getDtc_id() {
        return dtc_id;
    }

    public void setDtc_id(Integer dtc_id) {
        this.dtc_id = dtc_id;
    }

    public BigDecimal getRlt_value() {
        return rlt_value;
    }

    public void setRlt_value(BigDecimal rlt_value) {
        this.rlt_value = rlt_value;
    }

    public LocalDateTime getRlt_timestamp() {
        return rlt_timestamp;
    }

    public void setRlt_timestamp(LocalDateTime rlt_timestamp) {
        this.rlt_timestamp = rlt_timestamp;
    }
}


