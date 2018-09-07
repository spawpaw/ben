package com.spawpaw.ben.rest.controller;

import com.spawpaw.ben.api.entity.Group;
import org.springframework.web.bind.annotation.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

/**
 * 用户特殊权限规则的API
 *
 * @author BenBenShang spawpaw@hotmail.com
 * @since v1.0.0
 */
@RestController
public class UserHasPrivilegeRestController {
    @GetMapping("users/{userId}/privileges")
    List<Group> findPrivilegeByUserId(@RequestParam("type") String type) {
        throw new NotImplementedException();
    }


    @GetMapping("privileges/{privilegeId}/users")
    List<Group> findUsersByPrivilegeId() {
        throw new NotImplementedException();
    }

    @PostMapping({"users/{userId}/privileges/{privilegeId}", "privileges/{privilegeId}/users/{userId}"})
    void addPrivilegeToUser() {
        throw new NotImplementedException();
    }

    @DeleteMapping({"users/{userId}/privileges/{privilegeId}", "privileges/{privilegeId}/users/{userId}"})
    void removePrivilegeFromUser() {
        throw new NotImplementedException();
    }
}
