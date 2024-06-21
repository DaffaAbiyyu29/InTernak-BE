package id.ac.astra.polytechnic.internakbe.rest;

import id.ac.astra.polytechnic.internakbe.response.DtoResponse;
import id.ac.astra.polytechnic.internakbe.service.tsArticleService;
import id.ac.astra.polytechnic.internakbe.vo.tsArticleVo;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class tsArticleRest {
    private tsArticleService service;
    public tsArticleRest(tsArticleService Service) {
        this.service = Service;
    }

    @GetMapping("/ts-article/getAll")
    public DtoResponse getCages(){
        return service.getAll();
    }
    @PostMapping("/ts-article/create")
    public DtoResponse create(@RequestBody tsArticleVo tsArticleVo){
        return service.addArticle(tsArticleVo);
    }
    @PutMapping("/article/update")
    public DtoResponse update(@RequestBody tsArticleVo tsArticle){
        return service.updateArticle(tsArticle);
    }
    @GetMapping("/ts-article/get")
    public DtoResponse get(@RequestParam ("id") Integer id){return service.getArticle(id);}
    @GetMapping("/ts-article/getOthers")
    public DtoResponse getOthers(@RequestParam ("id") Integer id){return service.getOther(id);}
    @DeleteMapping("/ts-article/delete")
    public DtoResponse delete(@RequestBody tsArticleVo tsArticle){return service.deleteArticle(tsArticle);}
}
