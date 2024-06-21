package id.ac.astra.polytechnic.internakbe.vo;

import id.ac.astra.polytechnic.internakbe.model.Schedule;

import java.time.LocalDateTime;

public class ScheduleVo {
    private Integer dtcId;
    private Integer schStatus;
    private LocalDateTime schDateStart;
    private LocalDateTime schDateEnd;
    private String schName;
    private String schJenisMakan;

    // Constructor
    public ScheduleVo(Schedule schedule) {
        this.dtcId = schedule.getDtcId();
        this.schStatus = schedule.getSchStatus();
        this.schDateStart = schedule.getSchDateStart();
        this.schDateEnd = schedule.getSchDateEnd();
        this.schName = schedule.getSchName();
        this.schJenisMakan = schedule.getSchJenisMakan();
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
