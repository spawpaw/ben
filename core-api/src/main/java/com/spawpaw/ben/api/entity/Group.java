package com.spawpaw.ben.api.entity;

import java.io.Serializable;

/**
 * 用户组
 * 系统用户组：
 * 1. ROOT: 根用户组
 * 2. ROOT->DISABLE
 *
 * @author BenBenShang spawpaw@hotmail.com
 */
public class Group implements Serializable {
    private Long id;
    private String name;
    private String title;
    private String description;
    private Long parentId;
    /**
     * 权限计算策略
     * 1. 处于该用户组的用户将被启用该用户组所声明的权限
     * 2. 处于该用户组的用户将被禁用该用户组所声明的权限
     * <p>
     * 如用户同时属于多个用户组，对于单个权限，编号大的策略将覆盖编号小的策略。
     * 如用户U1同时属于G1,G2,G3用户组，
     * G1,G2,G3的策略分别为1,1,2,
     * G1,G2,G3都具有P1权限
     * 那么该用户将不具有P1权限，因为G3的策略导致其他两个组的策略失效
     */
    private Short policy;

    public static final short POLICY_ENABLE = 1;
    public static final short POLICY_DISABLE = 2;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Short getPolicy() {
        return policy;
    }

    public void setPolicy(Short policy) {
        this.policy = policy;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", parentId=" + parentId +
                ", policy=" + policy +
                '}';
    }
}
