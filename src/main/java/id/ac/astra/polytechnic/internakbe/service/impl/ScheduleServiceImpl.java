package id.ac.astra.polytechnic.internakbe.service.impl;

import id.ac.astra.polytechnic.internakbe.dao.ScheduleDao;
import id.ac.astra.polytechnic.internakbe.repository.ScheduleRepository;
import id.ac.astra.polytechnic.internakbe.response.DtoResponse;
import id.ac.astra.polytechnic.internakbe.service.ScheduleService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static id.ac.astra.polytechnic.internakbe.constant.AllConstant.mEmptyData;
import static id.ac.astra.polytechnic.internakbe.constant.MsCensorConstant.mGetSuccess;

@Service
@Transactional
public class ScheduleServiceImpl implements ScheduleService {
    @Autowired
    private ScheduleDao scheduleDao;
    @Autowired
    private ScheduleRepository scheduleRepository;
    @Override
    public DtoResponse getAllSchedule() {
        if(scheduleDao.getAllSchedule() != null){
            return new DtoResponse(200, scheduleDao.getAllSchedule(), "Success");
        }
        return new DtoResponse(404, null, mEmptyData);
    }
}
