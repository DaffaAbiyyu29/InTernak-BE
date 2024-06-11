package id.ac.astra.polytechnic.internakbe.rest;

import id.ac.astra.polytechnic.internakbe.response.DtoResponse;
import id.ac.astra.polytechnic.internakbe.service.tsRealtimeCensorService;
import id.ac.astra.polytechnic.internakbe.vo.tsRealtimeCensorVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class tsRealtimeCensorRest {
    @Autowired
    private tsRealtimeCensorService rltService;
    public tsRealtimeCensorRest(tsRealtimeCensorService rltService) {
        this.rltService = rltService;
    }

    @PostMapping("/ts-realtime-censor/save")
    public DtoResponse createTs(@RequestBody tsRealtimeCensorVo tsrealtimeCensorVo){
        return rltService.saveRealtime(tsrealtimeCensorVo);
    }
    @GetMapping("/ts-realtime-censor/getlatest")
    public DtoResponse getLatest(){
        return rltService.getLatestData();
    }



}
