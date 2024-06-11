package id.ac.astra.polytechnic.internakbe.rest;

import id.ac.astra.polytechnic.internakbe.response.DtoResponse;
import id.ac.astra.polytechnic.internakbe.service.DetailCageCensorService;
import id.ac.astra.polytechnic.internakbe.vo.DetailCageCensorVoForm;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("api/dt-cage-censor")
public class DetailCageCensorRest {
    private DetailCageCensorService detailCageCensorService;
    public DetailCageCensorRest(DetailCageCensorService detailCageCensorService){this.detailCageCensorService = detailCageCensorService;}
    @GetMapping("/get")
    public DtoResponse getDetailById(@RequestParam("dtc_id") Integer dtc_id){
        return detailCageCensorService.getDetailById(dtc_id);
    }
    @PostMapping("/create")
    public DtoResponse createCage(@RequestBody DetailCageCensorVoForm detailCageCensorVo){
        return detailCageCensorService.saveDetail(detailCageCensorVo);
    }
    @PutMapping("/update")
    public DtoResponse updateCage(@RequestBody DetailCageCensorVoForm detailCageCensorVo){
        return detailCageCensorService.updateDetail(detailCageCensorVo);
    }
}
