package com.spawpaw.ben.api.entity.upms;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "privilege")
public class Privilege implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    /**
     * 权限编码
     */
    @Column(name = "name")
    private String name;

    /**
     * 用于显示的名称
     */
    @Column(name = "title")
    private String title;

    /**
     * 详细描述
     */
    @Column(name = "description")
    private String description;

    @CreatedDate
    @Column(name = "utc_create")
    private Date utcCreate;

    @LastModifiedDate
    @Column(name = "utc_update")
    private Date utcUpdate;


    ////RELATION


//    @JsonIgnore
//    @OneToMany(mappedBy = "privilegeId")
//    Set<RoleHasPrivilege> roleHasPrivileges;
}
