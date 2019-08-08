package org.jhipster.endpoints.repository;

import org.jhipster.endpoints.domain.TBlogEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//JpaSpecificationExcutor  == multiple query
public interface BlogRepository extends JpaRepository<TBlogEntity, Long>, JpaSpecificationExecutor<TBlogEntity> {


    @Query("select b from TBlogEntity b where b.recommend = true")
    List<TBlogEntity> findTop(Pageable pageable);

    @Query("select b from TBlogEntity b where b.title like ?1 or b.content like ?1")
    Page<TBlogEntity> findByQuery(String query, Pageable pageable);

    @Query("select b from TBlogEntity b where function('date_format',b.updateTime,'%Y') = ?1")
    List<TBlogEntity> findByYear(String year);


}
