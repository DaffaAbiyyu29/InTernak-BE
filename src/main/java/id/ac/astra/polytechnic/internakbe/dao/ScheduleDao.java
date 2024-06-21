package id.ac.astra.polytechnic.internakbe.dao;

import id.ac.astra.polytechnic.internakbe.model.Schedule;
import id.ac.astra.polytechnic.internakbe.vo.MsCageVo;
import id.ac.astra.polytechnic.internakbe.vo.ScheduleVo;

import java.util.List;

public interface ScheduleDao {
    List<ScheduleVo> getAllSchedule();
}
