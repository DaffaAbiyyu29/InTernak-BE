package id.ac.astra.polytechnic.internakbe.rest;

import id.ac.astra.polytechnic.internakbe.model.MsCensor;
import id.ac.astra.polytechnic.internakbe.response.DtoResponse;
import id.ac.astra.polytechnic.internakbe.service.MsCensorService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("api/censor")
public class MsCensorRest {
    private MsCensorService msCensorService;
    public MsCensorRest(MsCensorService msCensorService){this.msCensorService = msCensorService;}
    @GetMapping("/getAll")
    public DtoResponse getCensors(){
        return msCensorService.getAllCensors();
    }
    @GetMapping("/get{cns_id}")
    public DtoResponse getCensorById(@RequestParam Integer cns_id){
        return msCensorService.getCensorById(cns_id);
    }
    @PostMapping("/create")
    public DtoResponse createCensor(@RequestBody MsCensor msCensor){
        return msCensorService.saveCensor(msCensor);
    }

    @PutMapping("/update")
    public DtoResponse updateCensor(@RequestBody MsCensor msCensor){
        return msCensorService.updateCensor(msCensor);
    }

    @DeleteMapping("/delete")
    public DtoResponse deleteCensor(@RequestBody MsCensor msCensor){
        return msCensorService.deleteCensor(msCensor);
    }
}
