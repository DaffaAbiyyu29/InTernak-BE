package id.ac.astra.polytechnic.internakbe.dao.impl;

import id.ac.astra.polytechnic.internakbe.dao.tsArticleDao;
import id.ac.astra.polytechnic.internakbe.model.tsArticleJoined;
import id.ac.astra.polytechnic.internakbe.repository.tsArticleJoinedRepository;
import id.ac.astra.polytechnic.internakbe.vo.tsArticleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class tsArticleDaoImpl implements tsArticleDao {
    @Autowired
     private tsArticleJoinedRepository tsArticleRepository;
    @Override
    public List<tsArticleVo> getOther(int id) {
        List<tsArticleJoined> articles = tsArticleRepository.getOther(id);
        List<tsArticleVo> tsArticleVos = new ArrayList<>();
        for (tsArticleJoined item : articles) {
            tsArticleVo tsArticleVo = new tsArticleVo(item);
            tsArticleVos.add(tsArticleVo);
        }
        return tsArticleVos;
    }

    @Override
    public tsArticleVo getLatest() {
        tsArticleJoined tsArticle = tsArticleRepository.getLatest();
        tsArticleVo tsArticleVo = new tsArticleVo(tsArticle);
        return tsArticleVo;
    }

    @Override
    public tsArticleVo getArticle(int id) {
        List<tsArticleJoined> article = tsArticleRepository.getArticle(id);
        tsArticleVo tsArticleVo = new tsArticleVo(article.get(0));
        return tsArticleVo;
    }
}
