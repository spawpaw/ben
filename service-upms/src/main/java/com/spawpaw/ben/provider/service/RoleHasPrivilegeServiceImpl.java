package com.spawpaw.ben.provider.service;

import com.spawpaw.ben.api.entity.upms.Privilege;
import com.spawpaw.ben.api.entity.upms.Role;
import com.spawpaw.ben.api.entity.upms.RoleHasPrivilege;
import com.spawpaw.ben.api.entity.upms.RoleHasPrivilegePK;
import com.spawpaw.ben.api.service.upms.RoleHasPrivilegeService;
import com.spawpaw.ben.provider.repository.RoleHasPrivilegeRepository;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.Resource;
import java.util.List;

@Component
public class RoleHasPrivilegeServiceImpl implements RoleHasPrivilegeService {
    @Resource
    RoleHasPrivilegeRepository roleHasPrivilegeRepository;


    @Override
    public List<Privilege> findPrivilegesByRoleId(@PathVariable("roleId") Long roleId) {
        return roleHasPrivilegeRepository.findPrivilegesByRoleId(roleId);
    }

    @Override
    public List<Role> findRolesByPrivilegeId(@PathVariable("privilegeId") Long privilegeId) {
        return roleHasPrivilegeRepository.findRolesByPrivilegeId(privilegeId);
    }

    @Override
    public RoleHasPrivilege createRelationBetweenRoleAndPrivilege(@PathVariable("roleId") Long roleId, @PathVariable("privilegeId") Long privilegeId) {
        return roleHasPrivilegeRepository.saveAndFlush(new RoleHasPrivilege(roleId, privilegeId));
    }

    @Override
    public void deleteRelationBetweenRoleAndPrivilege(@PathVariable("roleId") Long roleId, @PathVariable("privilegeId") Long privilegeId) {
        roleHasPrivilegeRepository.deleteById(new RoleHasPrivilegePK(roleId, privilegeId));
    }
}
