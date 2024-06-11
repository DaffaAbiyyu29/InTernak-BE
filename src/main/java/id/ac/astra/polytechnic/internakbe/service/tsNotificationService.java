package id.ac.astra.polytechnic.internakbe.service;

import id.ac.astra.polytechnic.internakbe.response.DtoResponse;
import id.ac.astra.polytechnic.internakbe.vo.tsNotificationVo;

public interface tsNotificationService {
    public DtoResponse addNotif(tsNotificationVo tsNotificationVo);
    public  DtoResponse getAllNotif();
    public  DtoResponse updateNotif(tsNotificationVo tsNotification);
}
