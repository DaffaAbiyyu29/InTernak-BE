package id.ac.astra.polytechnic.internakbe.dao;

import id.ac.astra.polytechnic.internakbe.model.City;
import id.ac.astra.polytechnic.internakbe.model.Province;
import id.ac.astra.polytechnic.internakbe.vo.CityVo;

import java.util.List;

public interface CityDao {
    List<CityVo> getAllCities();

    List<CityDao> getCityActive();

    City getCityById(Integer cty_id);
    List<CityVo> getCitiesByProvinceId(Integer prv_id);
}
