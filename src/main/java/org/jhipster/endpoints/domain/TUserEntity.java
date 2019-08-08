package org.jhipster.endpoints.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "t_user", schema = "blog", catalog = "")
public class TUserEntity {
    private long id;
    private String avatar;
    private Timestamp createTime;
    private String email;
    private String nickname;
    private String password;
    private Integer type;
    private Timestamp updateTime;
    private String username;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "type")
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TUserEntity that = (TUserEntity) o;
        return id == that.id &&
            Objects.equals(avatar, that.avatar) &&
            Objects.equals(createTime, that.createTime) &&
            Objects.equals(email, that.email) &&
            Objects.equals(nickname, that.nickname) &&
            Objects.equals(password, that.password) &&
            Objects.equals(type, that.type) &&
            Objects.equals(updateTime, that.updateTime) &&
            Objects.equals(username, that.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, avatar, createTime, email, nickname, password, type, updateTime, username);
    }
}
