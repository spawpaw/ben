package com.spawpaw.ben.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.spawpaw.ben.api.entity.Group;
import com.spawpaw.ben.api.service.GroupService;
import com.spawpaw.ben.provider.dao.GroupMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created By spawpaw@hotmail.com  2018-08-25
 *
 * @author BenBenShang spawpaw@hotmail.com
 */
@Component
@Service(version = "1.0")
public class GroupServiceImpl implements GroupService {

    @Resource
    GroupMapper groupMapper;

    @Override
    public List<Group> loadGroupsByParentId(Integer parentId) {
        return null;
    }

    @Override
    public List<Group> loadAllGroups() {
        return null;
    }

    @Override
    public List<Group> loadGroupsIn(List<Long> groupIds) {
        return null;
    }

    @Override
    public List<Group> loadGroupsByUserId(Long userId) {
        return groupMapper.selectGroupByUserId(userId);
    }

    @Override
    public void addUserToGroups(Long operatorId, Long userToAdd, List<Long> groups) {

    }

    @Override
    public void addUsersToGroup(Long operatorId, List<Long> userIds, Long groupId) {

    }
}
