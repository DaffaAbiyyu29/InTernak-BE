package id.ac.astra.polytechnic.internakbe.repository;

import id.ac.astra.polytechnic.internakbe.model.tsViewComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

import java.util.List;

public interface tsViewCommentRepository extends JpaRepository<tsViewComment,Integer> {
    //blm jadi
    @Procedure(procedureName = "cmt_getCmt_per_Atc")
    List<tsViewComment> getAllCommentperArticle(int id);
}
