package id.ac.astra.polytechnic.internakbe.dao.impl;

import id.ac.astra.polytechnic.internakbe.dao.ProvinceDao;
import id.ac.astra.polytechnic.internakbe.model.Province;
import id.ac.astra.polytechnic.internakbe.repository.ProvinceRepository;
import id.ac.astra.polytechnic.internakbe.vo.ProvinceVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class ProvinceDaoImpl implements ProvinceDao {
    @Autowired
    private ProvinceRepository provinceRepository;

    public ProvinceDaoImpl() {
    }

    public List<ProvinceVo> getAllProvinces() {
        Iterable<Province> provinces = this.provinceRepository.findAll();
        List<ProvinceVo> provinceVos = new ArrayList();
        Iterator var3 = provinces.iterator();

        while(var3.hasNext()) {
            Province item = (Province) var3.next();
            ProvinceVo provinceVo = new ProvinceVo(item);
            provinceVos.add(provinceVo);
        }

        return provinceVos;
    }

    @Override
    public List<ProvinceVo> getProvinceActive() {
        return null;
    }

    @Override
    public Province getProvinceById(Integer prv_id) {
        return null;
    }
}
