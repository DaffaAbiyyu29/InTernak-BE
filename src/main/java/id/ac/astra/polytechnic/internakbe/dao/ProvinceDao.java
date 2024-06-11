package id.ac.astra.polytechnic.internakbe.dao;

import id.ac.astra.polytechnic.internakbe.model.Province;
import id.ac.astra.polytechnic.internakbe.vo.ProvinceVo;

import java.util.List;

public interface ProvinceDao {

    List<ProvinceVo> getAllProvinces();

    List<ProvinceVo> getProvinceActive();

    Province     getProvinceById(Integer prv_id);

}
