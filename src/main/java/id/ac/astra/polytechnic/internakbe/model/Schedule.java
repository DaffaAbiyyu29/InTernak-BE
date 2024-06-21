package id.ac.astra.polytechnic.internakbe.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "ts_schedule")
public class Schedule {
    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sch_id")
    private Integer schId;
    @Column(name = "dtc_id")
    private Integer dtcId;
    @Column(name = "sch_status")
    private Integer schStatus;
    @Column(name = "sch_datestart")
    private LocalDateTime schDateStart;
    @Column(name = "sch_dateend")
    private LocalDateTime schDateEnd;
    @Column(name = "sch_name")
    private String schName;
    @Column(name = "sch_jenismakan")
    private String schJenisMakan;

    public Schedule() {

    }

    // Constructor
    public Schedule(Integer schId, Integer dtcId, Integer schStatus, LocalDateTime schDateStart, LocalDateTime schDateEnd, String schName, String schJenisMakan) {
        this.schId = schId;
        this.dtcId = dtcId;
        this.schStatus = schStatus;
        this.schDateStart = schDateStart;
        this.schDateEnd = schDateEnd;
        this.schName = schName;
        this.schJenisMakan = schJenisMakan;
    }

    // Getter and Setter methods
    public Integer getSchId() {
        return schId;
    }

    public void setSchId(Integer schId) {
        this.schId = schId;
    }

    public Integer getDtcId() {
        return dtcId;
    }

    public void setDtcId(Integer dtcId) {
        this.dtcId = dtcId;
    }

    public Integer getSchStatus() {
        return schStatus;
    }

    public void setSchStatus(Integer schStatus) {
        this.schStatus = schStatus;
    }

    public LocalDateTime getSchDateStart() {
        return schDateStart;
    }

    public void setSchDateStart(LocalDateTime schDateStart) {
        this.schDateStart = schDateStart;
    }

    public LocalDateTime getSchDateEnd() {
        return schDateEnd;
    }

    public void setSchDateEnd(LocalDateTime schDateEnd) {
        this.schDateEnd = schDateEnd;
    }

    public String getSchName() {
        return schName;
    }

    public void setSchName(String schName) {
        this.schName = schName;
    }

    public String getSchJenisMakan() {
        return schJenisMakan;
    }

    public void setSchJenisMakan(String schJenisMakan) {
        this.schJenisMakan = schJenisMakan;
    }
}
