package com.spawpaw.ben.api.service;

import com.spawpaw.ben.api.entity.Group;
import com.spawpaw.ben.api.entity.Privilege;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created By spawpaw@hotmail.com  2018-08-22
 *
 * @author BenBenShang spawpaw@hotmail.com
 */
public interface UserPrivilegeService {
    Privilege createPrivilege(Privilege privilege);

    void deletePrivilege(Long... privilegeIds);

    Privilege updatePrivilege(Privilege privilegeToUpdate);

    List<Privilege> loadPrivilegeByIds(Long... privilegeIds);

    List<Privilege> loadAllPrivilege();


    /**
     * 根据用户组id获取用户权限的id列表
     *
     * @param groups
     * @param usePolicy 是否根据策略进行加载。如选是，则根据这些用户组的策略对结果集进行修剪。否则加载所有权限列表
     * @return
     */
    List<Privilege> loadPrivilegesByGroups(List<Group> groups, boolean usePolicy);

    /**
     * 为指定用户组添加权限
     *
     * @param groupId      用户组id
     * @param privilegeIds 需要添加的权限列表
     * @param expireTime   过期时间，该权限将仅在过期时间之前有效
     */
    void addPrivilegesToGroup(Long groupId, List<Long> privilegeIds, Timestamp expireTime);

    /**
     * 从指定用户组删除指定权限
     *
     * @param groupId      用户组id
     * @param privilegeIds 要删除的权限列表
     */
    void removePrivilegesFromGroup(Long groupId, List<Long> privilegeIds);

    /**
     * 从指定用户组中删除所有权限
     *
     * @param groupId 用户组id
     */
    void removeAllPrivilegeFromGroup(Long groupId);

}
