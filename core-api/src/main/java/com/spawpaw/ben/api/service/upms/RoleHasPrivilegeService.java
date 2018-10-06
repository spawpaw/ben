package com.spawpaw.ben.api.service.upms;

import com.spawpaw.ben.api.entity.upms.Privilege;
import com.spawpaw.ben.api.entity.upms.Role;
import com.spawpaw.ben.api.entity.upms.RoleHasPrivilege;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public interface RoleHasPrivilegeService {

    @GetMapping("/role/{roleId}/privilege")
    List<Privilege> findPrivilegesByRoleId(@PathVariable("roleId") Long roleId);

    @GetMapping("/privilege/{privilegeId}/role")
    List<Role> findRolesByPrivilegeId(@PathVariable("privilegeId") Long privilegeId);

    @PostMapping({"/privilege/{privilegeId}/role/{roleId}", "/role/{roleId}/privilege/{privilegeId}"})
    RoleHasPrivilege createRelationBetweenRoleAndPrivilege(@PathVariable("roleId") Long roleId, @PathVariable("privilegeId") Long privilegeId);

    @DeleteMapping({"/privilege/{privilegeId}/role/{roleId}", "/role/{roleId}/privilege/{privilegeId}"})
    void deleteRelationBetweenRoleAndPrivilege(@PathVariable("roleId") Long roleId, @PathVariable("privilegeId") Long privilegeId);
}
