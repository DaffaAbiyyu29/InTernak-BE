package id.ac.astra.polytechnic.internakbe.dao;

import id.ac.astra.polytechnic.internakbe.model.Province;
import id.ac.astra.polytechnic.internakbe.vo.CityVo;

import java.util.List;

public interface CityDao {
    List<CityVo> getAllCities();

    List<CityDao> getCityActive();

    Province getCityById(Integer cty_id);
}
