package id.ac.astra.polytechnic.internakbe.rest;

import id.ac.astra.polytechnic.internakbe.response.DtoResponse;
import id.ac.astra.polytechnic.internakbe.service.ScheduleService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("api/schedule")
public class ScheduleRest {
    private ScheduleService scheduleService;
    public ScheduleRest(ScheduleService scheduleService){this.scheduleService = scheduleService;}
    @GetMapping("/getAll")
    public DtoResponse getCages(){
        return scheduleService.getAllSchedule();
    }
}
