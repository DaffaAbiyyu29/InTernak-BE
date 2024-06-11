package id.ac.astra.polytechnic.internakbe.service.impl;

import id.ac.astra.polytechnic.internakbe.dao.tsNotificationDao;
import id.ac.astra.polytechnic.internakbe.model.tsNotification;
import id.ac.astra.polytechnic.internakbe.repository.tsNotificationRepository;
import id.ac.astra.polytechnic.internakbe.response.DtoResponse;
import id.ac.astra.polytechnic.internakbe.service.tsNotificationService;
import id.ac.astra.polytechnic.internakbe.vo.tsNotificationVo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

import static id.ac.astra.polytechnic.internakbe.constant.AllConstant.*;

@Service
@Transactional
public class tsNotificationServiceImpl  implements tsNotificationService {
    @Autowired
    private tsNotificationDao tsNotificationDao;

    @Autowired
    private tsNotificationRepository tsNotificationRepository;
    @Override
    public DtoResponse addNotif(tsNotificationVo tsNotificationVo) {

        try {
            if (tsNotificationVo.getNtf_title() == null || tsNotificationVo.getNtf_title().isEmpty() ||
                    tsNotificationVo.getNtf_desc() == null || tsNotificationVo.getNtf_desc().isEmpty() ||
                    tsNotificationVo.getNtf_type() == null || tsNotificationVo.getNtf_type().isEmpty() ||
                    tsNotificationVo.getNtf_timestamp() == null) {
                return new DtoResponse(500, null, mCreateFailed);
            }
            tsNotification tsNotification = new tsNotification();

            tsNotification.setDtc_id(tsNotificationVo.getDtc_id());
            tsNotification.setNtf_title(tsNotificationVo.getNtf_title());
            tsNotification.setNtf_desc(tsNotification.getNtf_desc());
            tsNotification.setNtf_type(tsNotification.getNtf_type());
            tsNotification.setNtf_status(tsNotificationVo.getNtf_status());

            LocalDateTime localDateTime = LocalDateTime.now();

            // Convert LocalDateTime to DateTime
            tsNotification.setNtf_timestamp(localDateTime);
            tsNotificationRepository.save(tsNotification);
            return new DtoResponse(200, tsNotificationVo, mCreateSuccess);
        } catch (Exception e) {
            return new DtoResponse (500, tsNotificationVo, mCreateFailed);
        }
    }


    @Override
    public DtoResponse getAllNotif() {
        if(tsNotificationDao.getAllNotif() != null){
            return new DtoResponse(200, tsNotificationDao.getAllNotif());
        }
        return new DtoResponse(200, null, mEmptyData);
    }

    @Override
    public DtoResponse updateNotif(tsNotificationVo tsNotification) {
        try {
            if (tsNotification.getNtf_title() == null || tsNotification.getNtf_title().isEmpty() ||
                    tsNotification.getNtf_desc() == null || tsNotification.getNtf_desc().isEmpty() ||
                    tsNotification.getNtf_type() == null || tsNotification.getNtf_type().isEmpty() ||
                    tsNotification.getNtf_timestamp() == null) {
                return new DtoResponse(500, null, mCreateFailed);
            }
            Optional<tsNotification> existedNotif = tsNotificationRepository.findById(tsNotification.getNtf_id());
            if (existedNotif.isPresent()) {
                existedNotif.get().setNtf_status(2);
                tsNotification existedNot = existedNotif.get();
                existedNot.setNtf_status(2);
                tsNotification updatedNotif = tsNotificationRepository.save(existedNot);
                if (tsNotificationRepository != null) {
                    return new DtoResponse(200, updatedNotif, UpdateSuccess);
                }
                else {
                    return new DtoResponse(404, updatedNotif, UpdateFailed);
                }
            }
        }catch (Exception e){
            return new DtoResponse(500, null, UpdateFailed);
        }
        return  null;
    }
}
