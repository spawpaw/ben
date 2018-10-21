package com.spawpaw.ben.api.entity.upms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_config")
public class Config {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

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

}
