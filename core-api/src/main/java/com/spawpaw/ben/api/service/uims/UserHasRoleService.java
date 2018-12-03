package com.spawpaw.ben.api.service.uims;

import com.spawpaw.ben.api.entity.upms.Role;
import com.spawpaw.ben.api.entity.upms.User;
import com.spawpaw.ben.api.entity.upms.UserHasRole;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
public interface UserHasRoleService{

    @GetMapping("role/{roleId}/user")
    Set<User> findUsersByRoleId(@PathVariable("roleId") Long roleId);

    @GetMapping("user/{userId}/role")
    Set<Role> findRolesByUserId(@PathVariable("userId") Long userId);

    @PostMapping({"user/{userId}/role/{roleId}", "role/{roleId}/user/{userId}"})
    UserHasRole createRelationBetween(@PathVariable("userId") Long userId, @PathVariable("roleId") Long roleId);


    @DeleteMapping({"user/{userId}/role/{roleId}", "role/{roleId}/user/{userId}"})
    void deleteRelationBetween(@PathVariable("userId") Long userId, @PathVariable("roleId") Long roleId);
}
