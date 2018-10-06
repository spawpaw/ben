package com.spawpaw.ben.api.entity.upms;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "role_has_privilege")
@IdClass(RoleHasPrivilegePK.class)
public class RoleHasPrivilege implements Serializable {

    @Id
    @Column(name = "role_id")
    private Long roleId;

    @Id
    @Column(name = "privilege_id")
    private Long privilegeId;

    @CreatedDate
    @Column(name = "utc_create")
    private Timestamp utcCreate;

    @LastModifiedDate
    @Column(name = "utc_update")
    private Timestamp utcUpdate;

    public RoleHasPrivilege(Long roleId, Long privilegeId) {
        this.roleId = roleId;
        this.privilegeId = privilegeId;
    }
}
