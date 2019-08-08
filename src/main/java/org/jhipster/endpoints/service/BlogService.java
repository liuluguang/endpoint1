package org.jhipster.endpoints.service;

import org.jhipster.endpoints.domain.TBlogEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

public interface BlogService
{

    TBlogEntity getBlog(Long id);


    Page<TBlogEntity> listBlog(Pageable pageable);

    Page<TBlogEntity> listBlog(Long tagId, Pageable pageable);

    Page<TBlogEntity> listBlog(String query, Pageable pageable);

    List<TBlogEntity> listRecommendBlogTop(Integer size);



    Long countBlog();





}
