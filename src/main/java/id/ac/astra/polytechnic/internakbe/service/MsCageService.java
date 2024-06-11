package id.ac.astra.polytechnic.internakbe.service;

import id.ac.astra.polytechnic.internakbe.model.MsCage;
import id.ac.astra.polytechnic.internakbe.response.DtoResponse;

public interface MsCageService {
    DtoResponse getAllCages();
    DtoResponse getCageById(Integer cag_id);
    DtoResponse saveCage(MsCage msCage);
    DtoResponse updateCage(MsCage msCage);
    DtoResponse deleteCage(MsCage msCage);
}
