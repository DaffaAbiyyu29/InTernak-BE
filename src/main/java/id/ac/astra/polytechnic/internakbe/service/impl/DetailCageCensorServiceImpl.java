package id.ac.astra.polytechnic.internakbe.service.impl;

import id.ac.astra.polytechnic.internakbe.dao.DetailCageCensorDao;
import id.ac.astra.polytechnic.internakbe.model.DetailCageCensor;
import id.ac.astra.polytechnic.internakbe.model.DetailCageCensorPK;
import id.ac.astra.polytechnic.internakbe.model.MsCage;
import id.ac.astra.polytechnic.internakbe.model.MsCensor;
import id.ac.astra.polytechnic.internakbe.repository.DetailCageCensorRepository;
import id.ac.astra.polytechnic.internakbe.repository.MsCageRepository;
import id.ac.astra.polytechnic.internakbe.repository.MsCensorRepository;
import id.ac.astra.polytechnic.internakbe.response.DtoResponse;
import id.ac.astra.polytechnic.internakbe.service.DetailCageCensorService;
import id.ac.astra.polytechnic.internakbe.vo.DetailCageCensorVo;
import id.ac.astra.polytechnic.internakbe.vo.DetailCageCensorVoForm;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static id.ac.astra.polytechnic.internakbe.constant.DetailCageCensorConstant.*;
import static id.ac.astra.polytechnic.internakbe.constant.MsCageConstant.mRequiredData;
import static id.ac.astra.polytechnic.internakbe.constant.MsCensorConstant.mEmptyData;
import static id.ac.astra.polytechnic.internakbe.constant.MsCensorConstant.mGetSuccess;


@Service
@Transactional
public class DetailCageCensorServiceImpl implements DetailCageCensorService {
    @Autowired
    private DetailCageCensorDao detailCageCensorDao;
    @Autowired
    private DetailCageCensorRepository detailCageCensorRepository;
    @Autowired
    private MsCageRepository msCageRepository;
    @Autowired
    private MsCensorRepository msCensorRepository;

    @Override
    public DtoResponse getDetailById(Integer dtc_id) {
        // Menggunakan Stream untuk melakukan pengecekan terhadap seluruh data DetailSkema
        Optional<DetailCageCensor> existingDetail = detailCageCensorRepository.findAll().stream()
                .filter(existing ->
                        existing.getDetailCageCensorPK().getDtc_id().toString().equals(dtc_id.toString()))
                .findFirst();


//        DetailCageCensorPK pk = new DetailCageCensorPK();
//        pk.setDtc_id(dtc_id);
//
//        DetailCageCensor detailCageCensor = detailCageCensorRepository.findById(pk).orElse(null);
        if(existingDetail != null){
            return new DtoResponse(200, existingDetail, mGetSuccess);
        }
        return new DtoResponse(404, null, mEmptyData);
    }

    @Override
    public DtoResponse saveDetail(DetailCageCensorVoForm detailCageCensorVo) {
        if(detailCageCensorVo.getCag_id() == null || detailCageCensorVo.getCns_id() == null || detailCageCensorVo.getDtc_status() == null) {
            return new DtoResponse(500, null, mRequiredData);
        }

        List<MsCage> existingCage = msCageRepository.findAll().stream()
                .filter(existing ->
                        existing.getCag_id().toString().equals(detailCageCensorVo.getCag_id().toString()))
                .collect(Collectors.toList());

        List<MsCensor> existingProdi = msCensorRepository.findAll().stream()
                .filter(existing ->
                        existing.getCns_id().toString().equals(detailCageCensorVo.getCns_id().toString()))
                .collect(Collectors.toList());

        if (!existingCage.isEmpty() && !existingProdi.isEmpty()) {
            try
            {
                detailCageCensorVo.setDtc_status(1);
                DetailCageCensorPK detailCageCensorPK = new DetailCageCensorPK();
                detailCageCensorPK.setCag_id(detailCageCensorVo.getCag_id());
                detailCageCensorPK.setCns_id(detailCageCensorVo.getCns_id());
                System.out.println("ada1");
                List<DetailCageCensorVo> listData = detailCageCensorDao.getAllDetailCageCensors();
                if (listData.isEmpty()) {
                    detailCageCensorPK.setDtc_id(1);
                } else {
                    DetailCageCensorVo lastData = listData.get(listData.size() - 1);
                    detailCageCensorPK.setDtc_id(lastData.getDtc_id() + 1);
                }

                DetailCageCensor Detail = new DetailCageCensor();
                Detail.setDetailCageCensorPK(detailCageCensorPK);

                Detail.setDtc_status(detailCageCensorVo.getDtc_status());

                id.ac.astra.polytechnic.internakbe.model.DetailCageCensor detail = detailCageCensorRepository.save(Detail);
                return new DtoResponse(200, detail, mCreateSuccess);

            } catch (Exception e) {
                return new DtoResponse(500, detailCageCensorVo, mRequiredData);
            }
        }
        else {
            return new DtoResponse(404, null, mEmptyData);
        }
    }

     @Override
     public DtoResponse updateDetail(DetailCageCensorVoForm detailCageCensorVo) {
         if(detailCageCensorVo.getDtc_id() == null || detailCageCensorVo.getCag_id() == null || detailCageCensorVo.getCns_id() == null || detailCageCensorVo.getDtc_status() == null) {
             return new DtoResponse(500, null, mRequiredData);
         }

            try {
                // Menggunakan Stream untuk melakukan pengecekan terhadap seluruh data DetailSkema
                Optional<DetailCageCensor> existingDetail = detailCageCensorRepository.findAll().stream()
                        .filter(existing ->
                                existing.getDetailCageCensorPK().getDtc_id().toString().equals(detailCageCensorVo.getDtc_id().toString()))
                        .findFirst();

                System.out.println(!existingDetail.isPresent());
                if (existingDetail.isPresent()) {
                    // DetailSkema dengan ID yang sesuai ditemukan
                    // Update detail skema dengan data dari view object
                    // detailCageCensorVo diubah menjadi tipe data DetailCageCensor
                    DetailCageCensor detail = existingDetail.get();

                    if(detailCageCensorVo.getDtc_status() != null){
                        detail.setDtc_status(detailCageCensorVo.getDtc_status());
                    }

                    DetailCageCensor updateDetail = detailCageCensorRepository.save(detail);
                    System.out.println(updateDetail);
                    if (updateDetail != null) {
                        return new DtoResponse(200, updateDetail, mUpdateSuccess);
                    } else {
                        return new DtoResponse(404, null, mEmptyData);
                    }
                } else {
                    System.out.println("ga ketemu");
                    // DetailSkema dengan ID yang sesuai tidak ditemukan
                    return new DtoResponse(500, null, mEmptyData);
                }
            } catch (Exception e) {
                System.out.println("catch");
                return new DtoResponse(404, null);
            }
        }

}
