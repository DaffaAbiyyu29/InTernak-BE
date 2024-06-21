package id.ac.astra.polytechnic.internakbe.dao.impl;

import id.ac.astra.polytechnic.internakbe.dao.ScheduleDao;
import id.ac.astra.polytechnic.internakbe.model.Schedule;
import id.ac.astra.polytechnic.internakbe.model.Schedule;
import id.ac.astra.polytechnic.internakbe.repository.MsCageRepository;
import id.ac.astra.polytechnic.internakbe.repository.ScheduleRepository;
import id.ac.astra.polytechnic.internakbe.vo.ScheduleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ScheduleDaoImpl implements ScheduleDao {
    @Autowired
    private ScheduleRepository scheduleRepository;
    @Override
    public List<ScheduleVo> getAllSchedule() {
        Iterable<Schedule> scedules = scheduleRepository.findAll();
        List<ScheduleVo> sceduleVos = new ArrayList<>();
        for (Schedule item : scedules) {
            ScheduleVo sceduleVo = new ScheduleVo(item);
            sceduleVos.add(sceduleVo);
        }
        return sceduleVos;
    }
}
