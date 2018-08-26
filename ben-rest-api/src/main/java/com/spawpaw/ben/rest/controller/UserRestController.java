package com.spawpaw.ben.rest.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.spawpaw.ben.api.entity.User;
import com.spawpaw.ben.api.service.GroupService;
import com.spawpaw.ben.api.service.UserPrivilegeService;
import com.spawpaw.ben.api.service.UserService;
import com.spawpaw.ben.api.util.PageInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created By spawpaw@hotmail.com  2018-08-26
 *
 * @author BenBenShang spawpaw@hotmail.com
 */
@RestController
@RequestMapping("user")
public class UserRestController {
    @Reference(version = "${ben.user-service.version}",
            registry = "main-registry"
    )
    UserService userService;
    @Reference(version = "${ben.group-service.version}",
            registry = "main-registry"
    )
    GroupService groupService;
    @Reference(version = "${ben.privilege-service.version}",
            registry = "main-registry"
    )
    UserPrivilegeService userPrivilegeService;

    @GetMapping("")
    List<User> getUserList(@RequestParam("page") Long page, @RequestParam("pageSize") Long pageSize) {
        return userService.findAllUsers(new PageInfo(page, pageSize));
    }
}
