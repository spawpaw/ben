package com.spawpaw.ben.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.spawpaw.ben.api.entity.Group;
import com.spawpaw.ben.api.entity.Privilege;
import com.spawpaw.ben.api.service.UserPrivilegeService;
import com.spawpaw.ben.provider.dao.UserPrivilegeMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Created By spawpaw@hotmail.com  2018-08-25
 *
 * @author BenBenShang spawpaw@hotmail.com
 */
@Component
@Service(version = "1.0")
public class UserPrivilegeServiceImpl implements UserPrivilegeService {
    @Resource
    UserPrivilegeMapper userPrivilegeMapper;

    @Override
    public Privilege createPrivilege(Privilege privilege) {
        return null;
    }

    @Override
    public void deletePrivilege(Long... privilegeIds) {

    }

    @Override
    public Privilege updatePrivilege(Privilege privilegeToUpdate) {
        return null;
    }

    @Override
    public List<Privilege> loadPrivilegeByIds(Long... privilegeIds) {
        return null;
    }

    @Override
    public List<Privilege> loadAllPrivilege() {
        return null;
    }

    @Override
    public List<Privilege> loadPrivilegesByGroups(List<Group> groups, boolean usePolicy) {
        if (usePolicy) {
            List<Group> groupsWithEnablePolicy = new ArrayList<>();
            List<Group> groupsWithDisablePolicy = new ArrayList<>();
            for (Group group : groups) {
                if (group.getPolicy().equals(Group.POLICY_ENABLE))
                    groupsWithEnablePolicy.add(group);
                else if (group.getPolicy().equals(Group.POLICY_DISABLE))
                    groupsWithDisablePolicy.add(group);
            }

            final List<Privilege> preservedPrivileges = userPrivilegeMapper.selectPrivilegesByGroups(groupsWithEnablePolicy);
            final List<Privilege> evictPrivileges = userPrivilegeMapper.selectPrivilegesByGroups(groupsWithDisablePolicy);
            preservedPrivileges.removeAll(evictPrivileges);

            return preservedPrivileges;
        } else return userPrivilegeMapper.selectPrivilegesByGroups(groups);
    }

    @Override
    public void addPrivilegesToGroup(Long groupId, List<Long> privilegeIds, Timestamp expireTime) {

    }

    @Override
    public void removePrivilegesFromGroup(Long groupId, List<Long> privilegeIds) {

    }

    @Override
    public void removeAllPrivilegeFromGroup(Long groupId) {

    }
}
