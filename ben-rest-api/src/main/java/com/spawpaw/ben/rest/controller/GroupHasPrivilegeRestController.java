package com.spawpaw.ben.rest.controller;

import com.spawpaw.ben.api.entity.Group;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

/**
 * 用户组-权限关系的API
 *
 * @author BenBenShang spawpaw@hotmail.com
 * @since v1.0.0
 */
@RestController
public class GroupHasPrivilegeRestController {
    @GetMapping("groups/{groupId}/privileges")
    List<Group> findPrivilegeByGroupId() {
        throw new NotImplementedException();
    }

    @GetMapping("privileges/{privilegeId}/groups")
    List<Group> findGroupsByPrivilegeId() {
        throw new NotImplementedException();
    }

    @PostMapping({"groups/{groupId}/privileges/{privilegeId}", "privileges/{privilegeId}/groups/{groupId}"})
    void addPrivilegeToGroup() {
        throw new NotImplementedException();
    }

    @DeleteMapping({"groups/{groupId}/privileges/{privilegeId}", "privileges/{privilegeId}/groups/{groupId}"})
    void removePrivilegeFromGroup() {
        throw new NotImplementedException();
    }

}
