package com.spawpaw.ben.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.spawpaw.ben.api.entity.User;
import com.spawpaw.ben.api.service.UserService;
import com.spawpaw.ben.api.util.PageInfo;
import com.spawpaw.ben.provider.dao.UserMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created By spawpaw@hotmail.com  2018-08-24
 *
 * @author BenBenShang spawpaw@hotmail.com
 */
@Component
@Service(version = "1.0")
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public User createUser(User user) {
//        userMapper.insertUser(user);
//        return user;
        return null;
    }


    @Override
    public User changeUserPassword(Long userId, String oldPassword, String newPassword) {
        return null;
//        User userInDb = userMapper.selectUserByUserId(userId);
//        if (userInDb.getPassword().equals(oldPassword)) {
//            userMapper.updatePassword(newPassword);
//            return null;
//        } else
//            throw new ServiceException("更改密码失败，历史密码输入错误", ErrorCode.ERR_OLD_PASSWORD_IS_NOT_EQUALS_TO_CURRENT_IN_DATABASE);
    }

    @Override
    public User loadUserByUserName(String username) {
        return userMapper.selectUserByUsername(username);
    }

    @Override
    public User loadUserById(Long id) {
//        return userMapper.selectUserByUserId(id);
        return null;
    }

    @Override
    public List<User> findAllUsers(PageInfo pageInfo) {
//        return userMapper.findAllUsers(pageInfo);
        return null;
    }
}
