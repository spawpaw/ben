package com.spawpaw.ben.rest.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.spawpaw.ben.api.entity.User;
import com.spawpaw.ben.api.service.GroupService;
import com.spawpaw.ben.api.service.UserPrivilegeService;
import com.spawpaw.ben.api.service.UserService;
import com.spawpaw.ben.api.util.PageInfo;
import org.springframework.web.bind.annotation.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

/**
 * 用户实体相关的API
 *
 * @author BenBenShang spawpaw@hotmail.com
 * @since v1.0.0
 */
@RestController
@RequestMapping("user")
public class UserRestController {
    @Reference(version = "${ben.user-service.version}", registry = "main-registry")
    UserService userService;
    @Reference(version = "${ben.group-service.version}", registry = "main-registry")
    GroupService groupService;
    @Reference(version = "${ben.privilege-service.version}", registry = "main-registry")
    UserPrivilegeService userPrivilegeService;

    @GetMapping("")
    List<User> getList(
            @RequestParam(value = "page", required = false, defaultValue = "1") Long page
            , @RequestParam(value = "pageSize", required = false, defaultValue = "20") Long pageSize
    ) {
        return userService.findAllUsers(new PageInfo(page, pageSize));
    }

    @PostMapping("")
    User create() {
        throw new NotImplementedException();
    }

    @PutMapping("")
    User update() {
        throw new NotImplementedException();
    }

    @DeleteMapping("/{id}")
    void deleteById(@PathVariable("id") Long id) {
        throw new NotImplementedException();
    }

}
