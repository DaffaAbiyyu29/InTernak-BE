package id.ac.astra.polytechnic.internakbe.service.impl;

import id.ac.astra.polytechnic.internakbe.dao.MsCageDao;
import id.ac.astra.polytechnic.internakbe.model.MsCage;
import id.ac.astra.polytechnic.internakbe.repository.MsCageRepository;
import id.ac.astra.polytechnic.internakbe.response.DtoResponse;
import id.ac.astra.polytechnic.internakbe.service.MsCageService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import static id.ac.astra.polytechnic.internakbe.constant.MsCageConstant.*;

@Service
@Transactional
public class MsCageServiceImpl implements MsCageService {
    @Autowired
    private MsCageDao msCageDao;
    @Autowired
    private MsCageRepository msCageRepository;
    @Override
    public DtoResponse getAllCages() {
        if(msCageDao.getAllCages() != null){
            return new DtoResponse(200, msCageDao.getAllCages(),mGetSuccess);
        }
        return new DtoResponse(404, null, mEmptyData);
    }

    @Override
    public DtoResponse getCageById(@RequestParam Integer cag_id) {
        MsCage Cage = msCageRepository.findById(cag_id).orElseThrow();
        if(Cage != null){
            return new DtoResponse(200, Cage, mGetSuccess);
        }
        return new DtoResponse(404, null, mEmptyData);
    }

    @Override
    public DtoResponse saveCage(MsCage msCage) {
        if(msCage.getCag_name() == null || msCage.getCag_location() == null || msCage.getCag_type() == null || msCage.getCty_id() == null || msCage.getPrv_id() == null || msCage.getCag_capacity() == null || msCage.getCag_status() == null) {
            return new DtoResponse(500, null, mRequiredData);
        }
        try {
            msCage.setCag_status(1);
            msCageRepository.save(msCage);
            return new DtoResponse(200, msCage, mCreateSuccess);
        }catch (Exception e){
            return new DtoResponse(500, null, mRequiredData);
        }
    }

    @Override
    public DtoResponse updateCage(MsCage msCage) {
        if(msCage.getCag_id() == null || msCage.getCag_name() == null || msCage.getCag_type() == null || msCage.getCty_id() == null || msCage.getCag_capacity() == null || msCage.getCag_status() == null) {
            return new DtoResponse(500, null, mRequiredData);
        }
        try {
            MsCage updateCage = msCageRepository.save(msCage);
            if(updateCage != null){
                return new DtoResponse(200, updateCage, mUpdateSuccess);
            }else {
                return new DtoResponse(404, null, mNotFound);
            }
        }catch (Exception e){
            return new DtoResponse(500, null, mRequiredData);
        }
    }

    @Override
    public DtoResponse deleteCage(MsCage msCage) {
        if(msCage.getCag_id() == null) {
            return new DtoResponse(500, null, mRequiredData);
        }
        MsCage CageData = msCageRepository.findById(msCage.getCag_id()).orElseThrow();
        if(CageData != null){
            try{
                msCageRepository.delete(msCage);
                return new DtoResponse(200, null, mDeleteSuccess);
            }catch (Exception e){
                return new DtoResponse(500, null, mRequiredData);
            }
        }
        return new DtoResponse(404, null, mNotFound);
    }
}
