package id.ac.astra.polytechnic.internakbe.service;

import id.ac.astra.polytechnic.internakbe.response.DtoResponse;

public interface CityService {
    DtoResponse getAllCities();

    DtoResponse getCityActive();

    DtoResponse getCityById(Integer cty_id);
    DtoResponse getCitiesByProvinceId(Integer prv_id);
}
