package com.spawpaw.ben.api.service;

import com.spawpaw.ben.api.entity.User;
import com.spawpaw.ben.api.util.PageInfo;

import java.util.List;

/**
 * Created By spawpaw@hotmail.com  2018-08-22
 *
 * @author BenBenShang spawpaw@hotmail.com
 */
public interface UserService {
    /**
     * 创建一个用户
     *
     * @param user 要创建的用户的信息
     * @return 返回持久化在数据库中的信息
     */
    User createUser(User user);

    /**
     * 修改密码
     *
     * @param userId      用户id
     * @param oldPassword 旧密码
     * @param newPassword 要修改的新密码
     */
    User changeUserPassword(Long userId, String oldPassword, String newPassword);

    /**
     * 通过用户名查询用户
     *
     * @param username 用户名
     * @return 如果查询到用户，则返回用户实体，否则返回null
     */
    User loadUserByUserName(String username);

    /**
     * 通过id查询用户
     *
     * @param id 用户id
     * @return 如果查询到用户，则返回用户实体，否则返回null
     */
    User loadUserById(Long id);

    /**
     * 查询所有用户
     *
     * @param pageInfo 分页信息
     * @return 返回指定页数和页大小的用户列表
     */
    List<User> findAllUsers(PageInfo pageInfo);
}
