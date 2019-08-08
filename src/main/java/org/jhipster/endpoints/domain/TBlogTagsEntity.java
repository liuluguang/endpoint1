package org.jhipster.endpoints.domain;

import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "t_blog_tags", schema = "blog")
public class TBlogTagsEntity {

    private long blogsId;
    private long tagsId;
    @Id
    @Basic
    @Column(name = "blogs_id")
    public long getBlogsId() {
        return blogsId;
    }

    public void setBlogsId(long blogsId) {
        this.blogsId = blogsId;
    }

    @Basic
    @Column(name = "tags_id")
    public long getTagsId() {
        return tagsId;
    }

    public void setTagsId(long tagsId) {
        this.tagsId = tagsId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TBlogTagsEntity that = (TBlogTagsEntity) o;
        return blogsId == that.blogsId &&
            tagsId == that.tagsId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(blogsId, tagsId);
    }
}
