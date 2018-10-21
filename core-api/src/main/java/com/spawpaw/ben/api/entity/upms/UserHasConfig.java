package com.spawpaw.ben.api.entity.upms;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Data
@AllArgsConstructor
@Entity
@Table(name = "user_has_config")
@IdClass(UserHasConfigPK.class)
public class UserHasConfig implements Serializable {

    @Id
    @Column(name = "user_id")
    private Long userId;

    @Id
    @Column(name = "config_id")
    private Long configId;

    @CreatedDate
    @Column(name = "utc_create")
    private Date utcCreate;

    @LastModifiedDate
    @Column(name = "utc_update")
    private Date utcUpdate;

    public UserHasConfig(Long userId, Long configId) {
        this.userId = userId;
        this.configId = configId;
    }
}
