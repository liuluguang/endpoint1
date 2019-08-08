package org.jhipster.endpoints.web.rest;


import org.jhipster.endpoints.domain.TBlogEntity;
import org.jhipster.endpoints.service.BlogService;
import org.jhipster.endpoints.service.BlogServiceImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class BlogController {

    BlogServiceImpl blogService = new BlogServiceImpl();


    @GetMapping("/blogs/{id}")
    public String blogs(@PathVariable Long id){

        TBlogEntity blog= blogService.getBlog(id);
        return blog.toString();
    }
}
