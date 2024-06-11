package id.ac.astra.polytechnic.internakbe.service;

import id.ac.astra.polytechnic.internakbe.response.DtoResponse;
import id.ac.astra.polytechnic.internakbe.vo.DetailCageCensorVoForm;

public interface DetailCageCensorService {
    DtoResponse getDetailById(Integer dtc_id);
    DtoResponse saveDetail(DetailCageCensorVoForm detailCageCensorVo);
    DtoResponse updateDetail(DetailCageCensorVoForm detailCageCensorVo);
}
