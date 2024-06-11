package id.ac.astra.polytechnic.internakbe.service;

import id.ac.astra.polytechnic.internakbe.model.MsCensor;
import id.ac.astra.polytechnic.internakbe.response.DtoResponse;

public interface MsCensorService {
    DtoResponse getAllCensors();
    DtoResponse getCensorById(Integer cns_id);
    DtoResponse saveCensor(MsCensor msCensor);
    DtoResponse updateCensor(MsCensor msCensor);
    DtoResponse deleteCensor(MsCensor msCensor);
}
