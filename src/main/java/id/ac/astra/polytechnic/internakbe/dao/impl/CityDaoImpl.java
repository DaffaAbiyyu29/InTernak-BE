package id.ac.astra.polytechnic.internakbe.dao.impl;

import id.ac.astra.polytechnic.internakbe.dao.CityDao;
import id.ac.astra.polytechnic.internakbe.model.City;
import id.ac.astra.polytechnic.internakbe.model.Province;
import id.ac.astra.polytechnic.internakbe.repository.CityRepository;
import id.ac.astra.polytechnic.internakbe.vo.CityVo;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Repository
public class CityDaoImpl implements CityDao {

    @Autowired
    private CityRepository cityRepository;

    public CityDaoImpl() {
    }

    public List<CityVo> getAllCities() {
        Iterable<City> cities = this.cityRepository.findAll();
        List<CityVo> cityVos = new ArrayList();
        Iterator var3 = cities.iterator();

        while(var3.hasNext()) {
            City item = (City) var3.next();
            CityVo cityVo = new CityVo(item);
            cityVos.add(cityVo);
        }

        return cityVos;
    }


    @Override
    public List<CityDao> getCityActive() {
        return null;
    }

    @Override
    public City getCityById(Integer cty_id) {
        Optional<City> cityOptional = cityRepository.findById(cty_id);
        if (cityOptional.isPresent()) {
            return cityOptional.get();
        } else {
            throw new EntityNotFoundException("City not found for province id: " + cty_id);
        }
    }

    @Override
    public List<CityVo> getCitiesByProvinceId(Integer prv_id) {
        List<City> cities = cityRepository.findByPrvId(prv_id);
        List<CityVo> cityVos = new ArrayList<>();
        for (City city : cities) {
            cityVos.add(new CityVo(city));
        }
        return cityVos;
    }
}
