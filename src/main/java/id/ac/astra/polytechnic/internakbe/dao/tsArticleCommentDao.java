package id.ac.astra.polytechnic.internakbe.dao;

import id.ac.astra.polytechnic.internakbe.vo.tsArticleCommentVo;

import java.util.List;

public interface tsArticleCommentDao {
    List<tsArticleCommentVo> getAllCommentperAtc(int id);

}
