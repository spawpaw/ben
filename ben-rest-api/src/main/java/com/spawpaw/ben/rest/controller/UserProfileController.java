package com.spawpaw.ben.rest.controller;

import com.spawpaw.ben.api.entity.Privilege;
import com.spawpaw.ben.api.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

/**
 * 当前已登录用户所调用的API
 *
 * @author BenBenShang spawpaw@hotmail.com
 * @since v1.0.0
 */
@RestController
@RequestMapping(path = "profile")
public class UserProfileController {

    @GetMapping("privileges")
    User getUserProfile() {

        throw new NotImplementedException();
    }

    @GetMapping("privileges")
    List<Privilege> findPrivilegesByCurrentUser() {
        throw new NotImplementedException();
    }
}
