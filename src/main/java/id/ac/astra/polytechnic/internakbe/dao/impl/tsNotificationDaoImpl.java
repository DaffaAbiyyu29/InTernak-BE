package id.ac.astra.polytechnic.internakbe.dao.impl;

import id.ac.astra.polytechnic.internakbe.dao.tsNotificationDao;
import id.ac.astra.polytechnic.internakbe.model.tsNotification;
import id.ac.astra.polytechnic.internakbe.repository.tsNotificationRepository;
import id.ac.astra.polytechnic.internakbe.vo.tsNotificationVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class tsNotificationDaoImpl implements tsNotificationDao {
    @Autowired
    tsNotificationRepository tsNotificationRepository;

    public List<tsNotificationVo> getAllNotif() {
        Iterable<tsNotification> notifications = tsNotificationRepository.findAll();
        List<tsNotificationVo> tsNotificationVos = new ArrayList<>();
        for (tsNotification item : notifications) {
            tsNotificationVo tsNotificationVo= new tsNotificationVo(item);
            tsNotificationVos.add(tsNotificationVo);
        }
        return tsNotificationVos;
    }

    public tsNotificationVo getNotifById(Integer id) {
        Optional<tsNotification> notifications = tsNotificationRepository.findById(id);
        tsNotification notification = notifications.get();
        tsNotificationVo tsNotificationVo = new tsNotificationVo(notification);
        return tsNotificationVo;

    }
}
