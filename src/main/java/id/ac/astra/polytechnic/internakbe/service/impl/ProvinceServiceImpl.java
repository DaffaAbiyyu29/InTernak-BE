package id.ac.astra.polytechnic.internakbe.service.impl;

import id.ac.astra.polytechnic.internakbe.dao.ProvinceDao;
import id.ac.astra.polytechnic.internakbe.model.Province;
import id.ac.astra.polytechnic.internakbe.repository.ProvinceRepository;
import id.ac.astra.polytechnic.internakbe.response.DtoResponse;
import id.ac.astra.polytechnic.internakbe.service.ProvinceService;
import id.ac.astra.polytechnic.internakbe.vo.ProvinceVo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@Transactional
public class ProvinceServiceImpl implements ProvinceService {

    @Autowired
    private ProvinceDao provinceDao;
    @Autowired
    private ProvinceRepository provinceRepository;

    @Override
    public DtoResponse getAllProvinces() {
        List<ProvinceVo> provinces = provinceDao.getAllProvinces();
        return provinces != null && !provinces.isEmpty() ?
                new DtoResponse(200, provinces) :
                new DtoResponse(200, null, "No data available");
    }

    @Override
    public DtoResponse getProvinceActive() {
        List<ProvinceVo> activeProvinces = provinceDao.getProvinceActive();
        return activeProvinces != null && !activeProvinces.isEmpty() ?
                new DtoResponse(200, activeProvinces) :
                new DtoResponse(200, null, "No data available");
    }

//    @Override
//    public DtoResponse getProvinceById(Integer prv_id) {
//        Province province = provinceDao.getProvinceById(prv_id);
//        return province != null ?
//                new DtoResponse(200, province) :
//                new DtoResponse(404, null, "Province not found");
//    }

    public DtoResponse getProvinceById(Integer prv_id) {
        List<Province> provinces = Collections.singletonList(this.provinceDao.getProvinceById(prv_id));
        if (provinces != null && !provinces.isEmpty()) {
            return new DtoResponse(200, provinces, "successfully get user.");
        } else {
            return new DtoResponse(200, null, "No data available.");
        }
    }
}
