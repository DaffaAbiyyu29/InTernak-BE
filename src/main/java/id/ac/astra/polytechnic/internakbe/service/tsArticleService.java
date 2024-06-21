package id.ac.astra.polytechnic.internakbe.service;

import id.ac.astra.polytechnic.internakbe.response.DtoResponse;
import id.ac.astra.polytechnic.internakbe.vo.tsArticleVo;

public interface tsArticleService {
    DtoResponse addArticle(tsArticleVo tsArticle);
    DtoResponse updateArticle(tsArticleVo tsArticle);
    DtoResponse getArticle(Integer id);
    DtoResponse deleteArticle(tsArticleVo tsArticle);
    DtoResponse getOther(Integer id);
    DtoResponse getLatest();
    DtoResponse getAll();
}
