package id.ac.astra.polytechnic.internakbe.dao.impl;

import id.ac.astra.polytechnic.internakbe.dao.MsCensorDao;
import id.ac.astra.polytechnic.internakbe.model.MsCensor;
import id.ac.astra.polytechnic.internakbe.repository.MsCensorRepository;
import id.ac.astra.polytechnic.internakbe.vo.MsCensorVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MsCensorDaoImpl implements MsCensorDao {
    @Autowired
    private MsCensorRepository msCensorRepository;
    @Override
    public List<MsCensorVo> getAllCensors() {
        Iterable<MsCensor> msCensors = msCensorRepository.findAll();
        List<MsCensorVo> msCensorVos = new ArrayList<>();
        for (MsCensor item : msCensors) {
            MsCensorVo msCensorVo = new MsCensorVo(item);
            msCensorVos.add(msCensorVo);
        }
        return msCensorVos;
    }
}
