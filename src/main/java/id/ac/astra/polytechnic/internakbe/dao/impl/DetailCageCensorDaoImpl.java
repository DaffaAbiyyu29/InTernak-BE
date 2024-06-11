package id.ac.astra.polytechnic.internakbe.dao.impl;

import id.ac.astra.polytechnic.internakbe.dao.DetailCageCensorDao;
import id.ac.astra.polytechnic.internakbe.model.DetailCageCensor;
import id.ac.astra.polytechnic.internakbe.model.MsCage;
import id.ac.astra.polytechnic.internakbe.model.MsCensor;
import id.ac.astra.polytechnic.internakbe.repository.DetailCageCensorRepository;
import id.ac.astra.polytechnic.internakbe.repository.MsCageRepository;
import id.ac.astra.polytechnic.internakbe.repository.MsCensorRepository;
import id.ac.astra.polytechnic.internakbe.vo.DetailCageCensorVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DetailCageCensorDaoImpl implements DetailCageCensorDao {
    @Autowired
    private DetailCageCensorRepository detailCageCensorRepository;
    @Autowired
    private MsCageRepository msCageRepository;
    @Autowired
    private MsCensorRepository msCensorRepository;


    @Override
    public List<DetailCageCensorVo> getAllDetailCageCensors() {
        Iterable<DetailCageCensor> detailCageCensors = detailCageCensorRepository.findAll();
        List<DetailCageCensorVo> detailCageCensorVos = new ArrayList<>();
        for (DetailCageCensor item : detailCageCensors) {
            DetailCageCensorVo detailCageCensorVo = new DetailCageCensorVo(item);

            MsCage msCage = msCageRepository.findById(detailCageCensorVo.getCag_id()).orElseThrow();
            detailCageCensorVo.setCag_desc(msCage.getCag_name());
            MsCensor msCensor = msCensorRepository.findById(detailCageCensorVo.getCns_id()).orElseThrow();
            detailCageCensorVo.setCns_desc(msCensor.getCns_name());

            detailCageCensorVos.add(detailCageCensorVo);
        }
        return detailCageCensorVos;
    }
}
