package org.jhipster.endpoints.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "t_comment", schema = "blog", catalog = "")
public class TCommentEntity {
    private long id;
    private boolean adminComment;
    private String avatar;
    private String content;
    private Timestamp createTime;
    private String email;
    private String nickname;
    private Long blogId;
    private Long parentCommentId;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "admin_comment")
    public boolean isAdminComment() {
        return adminComment;
    }

    public void setAdminComment(boolean adminComment) {
        this.adminComment = adminComment;
    }

    @Basic
    @Column(name = "avatar")
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
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
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "nickname")
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Basic
    @Column(name = "blog_id")
    public Long getBlogId() {
        return blogId;
    }

    public void setBlogId(Long blogId) {
        this.blogId = blogId;
    }

    @Basic
    @Column(name = "parent_comment_id")
    public Long getParentCommentId() {
        return parentCommentId;
    }

    public void setParentCommentId(Long parentCommentId) {
        this.parentCommentId = parentCommentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TCommentEntity that = (TCommentEntity) o;
        return id == that.id &&
            adminComment == that.adminComment &&
            Objects.equals(avatar, that.avatar) &&
            Objects.equals(content, that.content) &&
            Objects.equals(createTime, that.createTime) &&
            Objects.equals(email, that.email) &&
            Objects.equals(nickname, that.nickname) &&
            Objects.equals(blogId, that.blogId) &&
            Objects.equals(parentCommentId, that.parentCommentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, adminComment, avatar, content, createTime, email, nickname, blogId, parentCommentId);
    }
}
