package com.spawpaw.ben.api.entity.upms;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

@Data
@Entity
@Table(name = "user")
public class User implements Serializable {

    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    /**
     * 用户名（登录名）
     */
    @Column(name = "username")
    private String username;

    /**
     * 密码
     */
    @JsonIgnore
    @Column(name = "password")
    private String password;

    /**
     * 昵称（显示名称）
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 电子邮件
     */
    @Column(name = "email")
    private String email;

    /**
     * 创建时间
     */
    @CreatedDate
    @Column(name = "utc_create")
    private Timestamp utcCreate;

    @LastModifiedDate
    @Column(name = "utc_update")
    private Timestamp utcUpdate;


    ////RELATIONS
//
//    @JsonIgnore
//    @OneToMany(mappedBy = "role")
//    Set<UserHasRole> userHasRoles;
}
