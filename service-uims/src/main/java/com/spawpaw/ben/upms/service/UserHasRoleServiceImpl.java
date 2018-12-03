package com.spawpaw.ben.upms.service;

import com.spawpaw.ben.api.entity.upms.Role;
import com.spawpaw.ben.api.entity.upms.User;
import com.spawpaw.ben.api.entity.upms.UserHasRole;
import com.spawpaw.ben.api.entity.upms.UserHasRolePK;
import com.spawpaw.ben.api.service.upms.UserHasRoleService;
import com.spawpaw.ben.upms.repository.UserHasRoleRepository;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.Resource;
import java.util.Set;

@Component
public class UserHasRoleServiceImpl implements UserHasRoleService {
    @Resource
    UserHasRoleRepository userHasRoleRepository;

    @Override
    public Set<User> findUsersByRoleId(@PathVariable("roleId") Long roleId) {
        return userHasRoleRepository.findUsersByRoleId(roleId);
    }

    @Override
    public Set<Role> findRolesByUserId(@PathVariable("userId") Long userId) {
        return userHasRoleRepository.findRolesByUserId(userId);
    }

    @Override
    public UserHasRole createRelationBetween(@PathVariable("userId") Long userId, @PathVariable("roleId") Long roleId) {
        return userHasRoleRepository.saveAndFlush(new UserHasRole(userId, roleId));
    }

    @Override
    public void deleteRelationBetween(@PathVariable("userId") Long userId, @PathVariable("roleId") Long roleId) {
        userHasRoleRepository.deleteById(new UserHasRolePK(userId, roleId));
    }
}
