package com.spawpaw.ben.api.service;

import com.spawpaw.ben.api.entity.Group;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created By spawpaw@hotmail.com  2018-08-22
 *
 * @author BenBenShang spawpaw@hotmail.com
 */
public interface GroupService {

    /**
     * 通过父用户组Id查询用户组列表
     * 仅查询指定用户组的直属子用户组，不进行递归查询
     * 根用户组id为1
     *
     * @param parentId 父用户组id
     * @return 所属用户组id下的所有用户组
     */
    List<Group> loadGroupsByParentId(Integer parentId);

    /**
     * 获取所有用户组
     *
     * @return 所有用户组
     */
    List<Group> loadAllGroups();

    /**
     * 根据id列表加载用户组列表信息
     *
     * @param groupIds 需要查询的用户组id
     */
    List<Group> loadGroupsIn(List<Long> groupIds);

    List<Group> loadGroupsByUserId(Long userId);


    /**
     * 将指定用户添加到指定用户组列表中
     *
     * @param operatorId 操作者id，操作者需要具备grant权限，并且操作的用户组必须属于其用户组或其子用户组
     * @param userToAdd  想要添加的用户id
     * @param groups     想要将这个用户添加到哪些用户组
     */
    void addUserToGroups(Long operatorId, Long userToAdd, List<Long> groups);

    /**
     * 将指定用户列表添加到指定用户组
     *
     * @param operatorId 操作者id，操作者需要具备grant权限，并且操作的用户组必须属于其用户组或其子用户组
     * @param userIds    要添加的用户列表
     * @param groupId    用户组id
     */
    void addUsersToGroup(Long operatorId, List<Long> userIds, Long groupId);


}
