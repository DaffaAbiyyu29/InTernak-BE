package id.ac.astra.polytechnic.internakbe.rest;

import id.ac.astra.polytechnic.internakbe.response.DtoResponse;
import id.ac.astra.polytechnic.internakbe.service.tsArticleCommentService;
import id.ac.astra.polytechnic.internakbe.vo.tsArticleCommentVo;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class tsArticleCommentRest {

    private tsArticleCommentService service;
    public tsArticleCommentRest(tsArticleCommentService Service) {
        this.service = Service;
    }

    @PostMapping("/ts-article-comment/create")
    public DtoResponse create(@RequestBody tsArticleCommentVo tsArticleVo){
        return service.addComment(tsArticleVo);
    }
    @DeleteMapping("/ts-article-comment/delete")
    public DtoResponse delete(@RequestBody tsArticleCommentVo tsArticle){return service.deleteComment(tsArticle);}
}
