package id.ac.astra.polytechnic.internakbe.service;

import id.ac.astra.polytechnic.internakbe.response.DtoResponse;
import id.ac.astra.polytechnic.internakbe.vo.tsArticleCommentVo;

public interface tsArticleCommentService {
    DtoResponse addComment(tsArticleCommentVo tsArticleComment);
DtoResponse deleteComment(tsArticleCommentVo tsArticleComment);
}
