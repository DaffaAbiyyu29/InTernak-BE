package id.ac.astra.polytechnic.internakbe.dao.impl;

import id.ac.astra.polytechnic.internakbe.dao.tsRealtimeCensorDao;
import id.ac.astra.polytechnic.internakbe.model.tsRealtimeCensor;
import id.ac.astra.polytechnic.internakbe.repository.tsRealtimeCensorRepository;
import id.ac.astra.polytechnic.internakbe.vo.tsRealtimeCensorVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class tsRealtimeCensorDaoImpl implements tsRealtimeCensorDao {
    @Autowired
    tsRealtimeCensorRepository tsRealtimeCensorRepository;

    @Override
    public tsRealtimeCensorVo getLatestData() {
        tsRealtimeCensor tsRealtimeCensor = tsRealtimeCensorRepository.getLatestData();
        tsRealtimeCensorVo tsRealtimeCensorVo = new tsRealtimeCensorVo(tsRealtimeCensor.getRlt_id(), tsRealtimeCensor.getDtc_id(), tsRealtimeCensor.getRlt_value(), tsRealtimeCensor.getRlt_timestamp());
        return tsRealtimeCensorVo;
    }
}

