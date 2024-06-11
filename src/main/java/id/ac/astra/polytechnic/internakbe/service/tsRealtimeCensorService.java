package id.ac.astra.polytechnic.internakbe.service;

import id.ac.astra.polytechnic.internakbe.response.DtoResponse;
import id.ac.astra.polytechnic.internakbe.vo.tsRealtimeCensorVo;

public interface tsRealtimeCensorService {
public DtoResponse saveRealtime(tsRealtimeCensorVo tsRealtimeVo);
public  DtoResponse getLatestData();
}
