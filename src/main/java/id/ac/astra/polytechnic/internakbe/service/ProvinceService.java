package id.ac.astra.polytechnic.internakbe.service;

import id.ac.astra.polytechnic.internakbe.response.DtoResponse;

public interface ProvinceService {
    DtoResponse getAllProvinces();

    DtoResponse getProvinceActive();

    DtoResponse getProvinceById(Integer user);
}
