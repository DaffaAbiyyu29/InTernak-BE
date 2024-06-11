package id.ac.astra.polytechnic.internakbe.rest;

import id.ac.astra.polytechnic.internakbe.response.DtoResponse;
import id.ac.astra.polytechnic.internakbe.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/provinces"})
public class ProvinceRest {
    @Autowired
    private ProvinceService provinceService;
    @GetMapping({"/getProvince"})
    public DtoResponse getProvinces() {
        return this.provinceService.getAllProvinces();
    }
}
