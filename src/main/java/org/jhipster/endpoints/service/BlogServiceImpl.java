package org.jhipster.endpoints.service;


import org.jhipster.endpoints.domain.TBlogEntity;
import org.jhipster.endpoints.repository.BlogRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.*;
import java.util.*;

@Service
public class BlogServiceImpl implements BlogService {


    @Autowired
    private BlogRepository blogRepository;


    @Override
    public TBlogEntity getBlog(Long id) {
        return blogRepository.getOne(id);
    }


    @Override
    public Page<TBlogEntity> listBlog(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @Override
    public Page<TBlogEntity> listBlog(Long tagId, Pageable pageable) {
        return blogRepository.findAll(new Specification<TBlogEntity>() {
            @Override
            public Predicate toPredicate(Root<TBlogEntity> root, CriteriaQuery<?> cq, CriteriaBuilder cb) {
                Join join = root.join("tags");
                return cb.equal(join.get("id"),tagId);
            }
        },pageable);
    }

    @Override
    public Page<TBlogEntity> listBlog(String query, Pageable pageable) {
        return blogRepository.findByQuery(query,pageable);
    }

    @Override
    public List<TBlogEntity> listRecommendBlogTop(Integer size) {
        Sort sort = new Sort(Sort.Direction.DESC,"updateTime");
        Pageable pageable = new PageRequest(0, size, sort);
        return blogRepository.findTop(pageable);
    }


    @Override
    public Long countBlog() {
        return blogRepository.count();
    }


}

