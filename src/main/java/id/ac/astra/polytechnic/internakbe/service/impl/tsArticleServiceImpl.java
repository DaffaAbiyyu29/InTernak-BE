package id.ac.astra.polytechnic.internakbe.service.impl;

import id.ac.astra.polytechnic.internakbe.dao.tsArticleDao;
import id.ac.astra.polytechnic.internakbe.model.tsArticle;
import id.ac.astra.polytechnic.internakbe.repository.tsArticleRepository;
import id.ac.astra.polytechnic.internakbe.response.DtoResponse;
import id.ac.astra.polytechnic.internakbe.service.tsArticleService;
import id.ac.astra.polytechnic.internakbe.vo.tsArticleVo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

import static id.ac.astra.polytechnic.internakbe.constant.AllConstant.*;
import static id.ac.astra.polytechnic.internakbe.constant.AllConstant.UpdateFailed;

@Service
@Transactional
public class tsArticleServiceImpl implements tsArticleService {
    @Autowired
    private tsArticleDao tsArticleDao;

    @Autowired
    private tsArticleRepository tsArticleRepository;

    @Override
    public DtoResponse addArticle(tsArticleVo tsArticleVo) {
        try {
            if(tsArticleVo.getAtc_category()=="" || tsArticleVo.getAtc_attachment() == "" || tsArticleVo.getAtc_content()=="" || tsArticleVo.getAtc_date()==null || tsArticleVo.getAtc_type() =="" || tsArticleVo.getAtc_title()==""){
                return new DtoResponse(500, null, mCreateFailed);
            }
            tsArticleVo.setAtc_status(1);
            LocalDateTime localDateTime = LocalDateTime.now();
            tsArticle tsArticle = new tsArticle();
          //  tsArticle.setAtc_id(tsArticleVo.getAtc_id());
            tsArticle.setAtc_content(tsArticleVo.getAtc_content());
            tsArticle.setAtc_date(localDateTime);
            tsArticle.setAtc_category(tsArticleVo.getAtc_category());
            tsArticle.setAtc_attachment(tsArticleVo.getAtc_attachment());
            tsArticle.setAtc_type(tsArticleVo.getAtc_type());
            tsArticle.setAtc_title(tsArticleVo.getAtc_title());
            tsArticle.setAtc_status(1);
            tsArticleRepository.save(tsArticle);
            return new DtoResponse(200, null, mCreateSuccess);
        } catch (Exception e) {
            return new DtoResponse(500, null, mCreateFailed);
        }
    }

    @Override
    public DtoResponse updateArticle(tsArticleVo tsArticle) {
        try {
            if(tsArticle.getAtc_category()=="" || tsArticle.getAtc_attachment() == "" || tsArticle.getAtc_content()=="" || tsArticle.getAtc_date()==null || tsArticle.getAtc_type() =="" || tsArticle.getAtc_title()==""){
                return new DtoResponse(500, null, mCreateFailed);
            }
            Optional<tsArticle> existedData = tsArticleRepository.findById(tsArticle.getAtc_id());
            if(existedData.isPresent()){
                tsArticle updatedData = existedData.get();
                updatedData.setAtc_title(tsArticle.getAtc_title());
                updatedData.setAtc_type(tsArticle.getAtc_type());
                updatedData.setUsr_id(tsArticle.getUsr_id());
                updatedData.setAtc_attachment(tsArticle.getAtc_attachment());
                LocalDateTime localDateTime = LocalDateTime.now();
                updatedData.setAtc_date(localDateTime);
                updatedData.setAtc_category(tsArticle.getAtc_category());
                updatedData.setAtc_content(tsArticle.getAtc_content());
            }
            tsArticle updated = tsArticleRepository.save(existedData.get());
            if(tsArticleRepository != null){
                return new DtoResponse(200, null, UpdateSuccess);
            }else {
                return new DtoResponse(404, null, NotFound);
            }
        }catch (Exception e){
            return new DtoResponse(500, null, UpdateFailed);
        }
    }

    @Override
    public DtoResponse getArticle(Integer id) {
            if(tsArticleDao.getArticle(id) != null && tsArticleDao.getArticle(id).getAtc_status()!=0){
                return new DtoResponse(200, tsArticleDao.getArticle(id));
            }
            return new DtoResponse(404, null, mEmptyData);
    }
    @Override
    public DtoResponse deleteArticle(tsArticleVo tsArticle) {
        try {
            Optional<tsArticle> articles = tsArticleRepository.findById(tsArticle.getAtc_id());
            tsArticle getArticle = articles.get();
            getArticle.setAtc_status(0);
            tsArticleRepository.save(getArticle);
            return new DtoResponse(200, null, DeleteSuccess);
        }
        catch (Exception e){
            return new DtoResponse(500, null,DeleteFailed);
        }
    }
    @Override
    public DtoResponse getLatest() {
        if(tsArticleDao.getLatest() != null) {
            return new DtoResponse(200, tsArticleDao.getLatest());
        }
        return new DtoResponse(404, null, mEmptyData);
    }

    @Override
    public DtoResponse getOther(Integer id) {
        if(tsArticleDao.getOther(id) != null) {
            return new DtoResponse(200, tsArticleDao.getOther(id));
        }
        return new DtoResponse(500, null, mEmptyData);
    }

    @Override
    public DtoResponse getAll() {
        if(tsArticleDao.getAll() != null) {
            return new DtoResponse(200, tsArticleDao.getAll());
        }
        return new DtoResponse(404, null, mEmptyData);
    }
}
