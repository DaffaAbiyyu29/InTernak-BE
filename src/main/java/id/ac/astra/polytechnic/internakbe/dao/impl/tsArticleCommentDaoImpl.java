package id.ac.astra.polytechnic.internakbe.dao.impl;

import id.ac.astra.polytechnic.internakbe.dao.tsArticleCommentDao;
import id.ac.astra.polytechnic.internakbe.repository.tsArticleCommentRepository;
import id.ac.astra.polytechnic.internakbe.repository.tsViewCommentRepository;
import id.ac.astra.polytechnic.internakbe.vo.tsArticleCommentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class tsArticleCommentDaoImpl  implements tsArticleCommentDao {
    @Autowired
    private tsArticleCommentRepository tsArticleCommentRepository;
    @Autowired
    private tsViewCommentRepository tsViewCommentRepository;

    @Override
    public List<tsArticleCommentVo> getAllCommentperAtc(int id) {
        return null;
    }

 /*   @Override
    public List<tsArticleCommentVo> getAllCommentperAtc(int id) {
        Iterable<tsViewComment> comments = tsViewCommentRepository.getAllCommentperArticle();
        List<tsArticleCommentVo> tsArticleCommentVos = new ArrayList<>();
        for (tsViewComment item : comments) {
            tsArticleCommentVo tsArticleCommentVo = new tsArticleCommentVo(item);
            tsArticleCommentVos.add(tsArticleCommentVo);
        }
        return tsArticleCommentVos;
    }*/
}
