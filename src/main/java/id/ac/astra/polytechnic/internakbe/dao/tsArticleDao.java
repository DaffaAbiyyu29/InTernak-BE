package id.ac.astra.polytechnic.internakbe.dao;

import id.ac.astra.polytechnic.internakbe.vo.tsArticleVo;

import java.util.List;

public interface tsArticleDao {
    List<tsArticleVo> getAll();
    List<tsArticleVo> getOther(int id);
    tsArticleVo getLatest();
    tsArticleVo getArticle(int id);
}
