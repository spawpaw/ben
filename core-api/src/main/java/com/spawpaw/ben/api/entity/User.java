package com.spawpaw.ben.api.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created By spawpaw@hotmail.com  2018-08-22
 *
 * @author BenBenShang spawpaw@hotmail.com
 */
public class User implements Serializable {
    private Long id;
    private String username;
    private String password;
    private Timestamp createTime;
    private Short status;
    private String nickName;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
}
