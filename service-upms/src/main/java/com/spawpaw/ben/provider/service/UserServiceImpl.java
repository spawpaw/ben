package com.spawpaw.ben.provider.service;

import com.spawpaw.ben.api.base.BaseEntityServiceImpl;
import com.spawpaw.ben.api.entity.upms.User;
import com.spawpaw.ben.api.exception.ServiceException;
import com.spawpaw.ben.api.service.upms.UserService;
import com.spawpaw.ben.provider.repository.UserRepository;
import lombok.extern.java.Log;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Log
@Component
@RestController
public class UserServiceImpl extends BaseEntityServiceImpl<User, Long, UserRepository> implements UserService {

    @Resource
    UserRepository repository;

    @Override
    public UserRepository getRepository() {
        return repository;
    }

    @Override
    public void changeUserPassword(Long userId, String oldPassword, String newPassword) {
        User userInDb = repository.getOne(userId);
        if (userInDb.getPassword().equals(oldPassword))
            userInDb.setPassword(newPassword);
        else throw new ServiceException("原密码输入错误", 400);
    }

    @Override
    public User loadUserByUserName(String username) {
        return repository.findUserByUsername(username);
    }

}
