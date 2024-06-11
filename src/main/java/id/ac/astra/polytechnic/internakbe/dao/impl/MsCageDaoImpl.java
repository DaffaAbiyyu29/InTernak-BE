package id.ac.astra.polytechnic.internakbe.dao.impl;

import id.ac.astra.polytechnic.internakbe.dao.MsCageDao;
import id.ac.astra.polytechnic.internakbe.model.MsCage;
import id.ac.astra.polytechnic.internakbe.repository.MsCageRepository;
import id.ac.astra.polytechnic.internakbe.vo.MsCageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MsCageDaoImpl implements MsCageDao {
    @Autowired
    private MsCageRepository msCageRepository;
    @Override
    public List<MsCageVo> getAllCages() {
        Iterable<MsCage> msCages = msCageRepository.findAll();
        List<MsCageVo> msCageVos = new ArrayList<>();
        for (MsCage item : msCages) {
            MsCageVo msCageVo = new MsCageVo(item);
            msCageVos.add(msCageVo);
        }
        return msCageVos;
    }
}
