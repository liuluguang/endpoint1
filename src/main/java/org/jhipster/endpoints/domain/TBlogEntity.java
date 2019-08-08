package org.jhipster.endpoints.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "t_blog", schema = "blog")
public class TBlogEntity {
    private long id;
    private boolean appreciation;
    private boolean commentabled;
    private String content;
    private Timestamp createTime;
    private String description;
    private String firstPicture;
    private String flag;
    private boolean published;
    private boolean recommend;
    private boolean shareStatement;
    private String title;
    private Timestamp updateTime;
    private Integer views;
    private Long typeId;
    private Long userId;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "appreciation")
    public boolean isAppreciation() {
        return appreciation;
    }

    public void setAppreciation(boolean appreciation) {
        this.appreciation = appreciation;
    }

    @Basic
    @Column(name = "commentabled")
    public boolean isCommentabled() {
        return commentabled;
    }

    public void setCommentabled(boolean commentabled) {
        this.commentabled = commentabled;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "first_picture")
    public String getFirstPicture() {
        return firstPicture;
    }

    public void setFirstPicture(String firstPicture) {
        this.firstPicture = firstPicture;
    }

    @Basic
    @Column(name = "flag")
    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Basic
    @Column(name = "published")
    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    @Basic
    @Column(name = "recommend")
    public boolean isRecommend() {
        return recommend;
    }

    public void setRecommend(boolean recommend) {
        this.recommend = recommend;
    }

    @Basic
    @Column(name = "share_statement")
    public boolean isShareStatement() {
        return shareStatement;
    }

    public void setShareStatement(boolean shareStatement) {
        this.shareStatement = shareStatement;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "update_time")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "views")
    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    @Basic
    @Column(name = "type_id")
    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    @Basic
    @Column(name = "user_id")
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TBlogEntity that = (TBlogEntity) o;
        return id == that.id &&
            appreciation == that.appreciation &&
            commentabled == that.commentabled &&
            published == that.published &&
            recommend == that.recommend &&
            shareStatement == that.shareStatement &&
            Objects.equals(content, that.content) &&
            Objects.equals(createTime, that.createTime) &&
            Objects.equals(description, that.description) &&
            Objects.equals(firstPicture, that.firstPicture) &&
            Objects.equals(flag, that.flag) &&
            Objects.equals(title, that.title) &&
            Objects.equals(updateTime, that.updateTime) &&
            Objects.equals(views, that.views) &&
            Objects.equals(typeId, that.typeId) &&
            Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, appreciation, commentabled, content, createTime, description, firstPicture, flag, published, recommend, shareStatement, title, updateTime, views, typeId, userId);
    }
}
