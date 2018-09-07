package com.spawpaw.ben.rest.controller;

import com.spawpaw.ben.api.entity.Group;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

/**
 * 用户-用户组关系相关的API
 *
 * @author BenBenShang spawpaw@hotmail.com
 * @since v1.0.0
 */
@RestController
public class UserInGroupRestController {
    @GetMapping("user/{userId}/groups")
    List<Group> findGroupsByUserId() {
        throw new NotImplementedException();
    }

    @GetMapping("group/{groupId}/users")
    List<Group> findUsersByGroupId() {
        throw new NotImplementedException();
    }

    @PostMapping({"users/{userId}/groups/{groupId}", "groups/{groupId}/users/{userId}"})
    void addUserToGroup() {
        throw new NotImplementedException();
    }

    @DeleteMapping({"users/{userId}/groups/{groupId}", "groups/{groupId}/users/{userId}"})
    void removeUserFromGroup() {
        throw new NotImplementedException();
    }

}
