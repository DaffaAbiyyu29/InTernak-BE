package id.ac.astra.polytechnic.internakbe.service.impl;

import id.ac.astra.polytechnic.internakbe.dao.CityDao;
import id.ac.astra.polytechnic.internakbe.model.City;
import id.ac.astra.polytechnic.internakbe.model.Province;
import id.ac.astra.polytechnic.internakbe.response.DtoResponse;
import id.ac.astra.polytechnic.internakbe.service.CityService;
import id.ac.astra.polytechnic.internakbe.vo.CityVo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@Transactional
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;


    @Override
    public DtoResponse getAllCities() {
        List<CityVo> cities = cityDao.getAllCities();
        return cities != null && !cities.isEmpty() ?
                new DtoResponse(200, cities) :
                new DtoResponse(200, null, "No data available");
    }

    @Override
    public DtoResponse getCityActive() {
        List<CityDao> activeCities = cityDao.getCityActive();
        return activeCities != null && !activeCities.isEmpty() ?
                new DtoResponse(200, activeCities) :
                new DtoResponse(200, null, "No data available");
    }

    public DtoResponse getCityById(Integer cty_id) {
        City city = this.cityDao.getCityById(cty_id);
        if (city != null) {
            return new DtoResponse(200, city, "Successfully retrieved city.");
        } else {
            return new DtoResponse(404, null, "No data available.");
        }
    }

    public DtoResponse getCitiesByProvinceId(Integer prv_id) {
        List<CityVo> cities = cityDao.getCitiesByProvinceId(prv_id);
        return cities != null && !cities.isEmpty() ?
                new DtoResponse(200, cities) :
                new DtoResponse(200, null, "No data available");
    }
}
