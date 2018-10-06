package com.spawpaw.ben.api.service.upms;

import com.spawpaw.ben.api.base.BaseEntityService;
import com.spawpaw.ben.api.entity.upms.User;
import org.springframework.web.bind.annotation.*;

/**
 * 用户实体服务
 *
 * @author BenBenShang spawpaw@hotmail.com 2018.9-2018.9
 * @version v1.0.0
 */
@RestController
@RequestMapping("user")
public interface UserService extends BaseEntityService<User, Long> {

    /**
     * 修改密码
     *
     * @param userId      用户id
     * @param oldPassword 旧密码
     * @param newPassword 要修改的新密码
     */
    @PutMapping("/changePassword")
    void changeUserPassword(Long userId, String oldPassword, String newPassword);

    /**
     * 通过用户名查询用户
     *
     * @param username 用户名
     * @return 如果查询到用户，则返回用户实体，否则返回null
     */
    @GetMapping("/search/byUserName")
    User loadUserByUserName(@RequestParam("userName") String username);
}
