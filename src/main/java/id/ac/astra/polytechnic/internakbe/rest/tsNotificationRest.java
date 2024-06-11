package id.ac.astra.polytechnic.internakbe.rest;

import id.ac.astra.polytechnic.internakbe.response.DtoResponse;
import id.ac.astra.polytechnic.internakbe.service.tsNotificationService;
import id.ac.astra.polytechnic.internakbe.vo.tsNotificationVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class tsNotificationRest {
    @Autowired
private tsNotificationService service;
    public tsNotificationRest(tsNotificationService rltService) {
        this.service = rltService;
    }

    @PostMapping("/ts-notification/add")
    public DtoResponse createTs(@RequestBody tsNotificationVo tsNotificationVo){
        return service.addNotif(tsNotificationVo);
    }
    @GetMapping("/ts-notification/update")
    public DtoResponse updateNotif(@RequestBody tsNotificationVo tsNotificationVo){
        return service.updateNotif(tsNotificationVo);
    }
    @GetMapping("/ts-notification/getall")
    public DtoResponse getAll(){
        return service.getAllNotif();
    }


}
