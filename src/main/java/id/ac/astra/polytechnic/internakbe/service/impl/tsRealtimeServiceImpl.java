package id.ac.astra.polytechnic.internakbe.service.impl;

import id.ac.astra.polytechnic.internakbe.dao.tsRealtimeCensorDao;
import id.ac.astra.polytechnic.internakbe.model.tsRealtimeCensor;
import id.ac.astra.polytechnic.internakbe.repository.tsRealtimeCensorRepository;
import id.ac.astra.polytechnic.internakbe.response.DtoResponse;
import id.ac.astra.polytechnic.internakbe.service.tsRealtimeCensorService;
import id.ac.astra.polytechnic.internakbe.vo.tsRealtimeCensorVo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

import static id.ac.astra.polytechnic.internakbe.constant.AllConstant.*;

@Service
@Transactional
public class tsRealtimeServiceImpl  implements tsRealtimeCensorService {
        @Autowired
        private tsRealtimeCensorDao tsRealtimeCensorDao;

        @Autowired
        private tsRealtimeCensorRepository tsRealtimeCensorRepository;

        @Override
        public DtoResponse getLatestData() {
            if(tsRealtimeCensorDao.getLatestData() != null) {
                return new DtoResponse(200, tsRealtimeCensorDao.getLatestData());
            }
            return new DtoResponse(200, null, mEmptyData);
        }



    @Override
    public DtoResponse saveRealtime(tsRealtimeCensorVo tsRealtime) {
        try {
            if (tsRealtime.getRlt_value() == null ||
                    tsRealtime.getRlt_timestamp() == null) {
                return new DtoResponse(500, null, mCreateFailed);
            }
            tsRealtimeCensor tsRealtimeCensor = new tsRealtimeCensor();
            tsRealtimeCensor.setDtc_id(tsRealtime.getDtc_id());
            tsRealtimeCensor.setRlt_value(tsRealtime.getRlt_value());
            LocalDateTime localDateTime = LocalDateTime.now();
            tsRealtimeCensor.setRlt_timestamp(localDateTime);
            tsRealtimeCensorRepository.save(tsRealtimeCensor);
            return new DtoResponse(200, tsRealtime, mCreateSuccess);
        } catch (Exception e) {
            return new DtoResponse (500, tsRealtime, mCreateFailed);
        }
    }


}
