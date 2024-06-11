package id.ac.astra.polytechnic.internakbe.service.impl;

import id.ac.astra.polytechnic.internakbe.model.tsArticleComment;
import id.ac.astra.polytechnic.internakbe.repository.tsArticleCommentRepository;
import id.ac.astra.polytechnic.internakbe.response.DtoResponse;
import id.ac.astra.polytechnic.internakbe.service.tsArticleCommentService;
import id.ac.astra.polytechnic.internakbe.vo.tsArticleCommentVo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

import static id.ac.astra.polytechnic.internakbe.constant.AllConstant.*;
@Service
@Transactional
public class tsArticleCommentServiceImpl implements tsArticleCommentService {
    @Autowired
    private tsArticleCommentRepository tsArticleCommentRepository;

    @Override
    public DtoResponse addComment(tsArticleCommentVo tsArticleComment) {
        try {
            if (tsArticleComment.getCmt_description() == null || tsArticleComment.getCmt_description().isEmpty() ||
                    tsArticleComment.getCmt_datetime() == null) {
                return new DtoResponse(500, null, mCreateFailed);
            }
            LocalDateTime localDateTime = LocalDateTime.now();
            tsArticleComment comment = new tsArticleComment();
            comment.setAtc_id(tsArticleComment.getAtc_id());
            comment.setCmt_id(tsArticleComment.getCmt_id());
            comment.setUsr_id(tsArticleComment.getUsr_id());
            comment.setCmt_datetime(localDateTime);
            comment.setCmt_description(tsArticleComment.getCmt_description());
            tsArticleCommentRepository.save(comment);
            return new DtoResponse(200, null, mCreateSuccess);
        } catch (Exception e) {
            return new DtoResponse(500, null, mCreateFailed);
        }
    }

    @Override
    public DtoResponse deleteComment(tsArticleCommentVo tsArticleComment) {
        try {
            Optional<tsArticleComment> comment = tsArticleCommentRepository.findById(tsArticleComment.getCmt_id());
            if(comment.isPresent()){
            tsArticleCommentRepository.delete(comment.get());
                return new DtoResponse(200, null, DeleteSuccess);
            }
            return null;
        }
        catch (Exception e){
            return new DtoResponse(500, null, DeleteFailed);
        }
    }

}
