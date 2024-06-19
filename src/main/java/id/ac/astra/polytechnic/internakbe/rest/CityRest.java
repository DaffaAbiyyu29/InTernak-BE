package id.ac.astra.polytechnic.internakbe.rest;

import id.ac.astra.polytechnic.internakbe.response.DtoResponse;
import id.ac.astra.polytechnic.internakbe.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/cities"})
public class CityRest {
    @Autowired
    private CityService cityService;
    @GetMapping({"/getCity"})
    public DtoResponse getCity() {
        return this.cityService.getAllCities();
    }

    @GetMapping("/getCity/{id}")
    public DtoResponse getCityById(@PathVariable Integer id) {
        return this.cityService.getCityById(id);
    }

    @GetMapping("/getCityByPrv/{id}")
    public DtoResponse getCitiesByProvinceId(@PathVariable Integer id) {
        return this.cityService.getCitiesByProvinceId(id);
    }
}
