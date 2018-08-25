package com.spawpaw.ben.provider.dao;

import com.spawpaw.ben.api.entity.User;
import com.spawpaw.ben.api.util.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created By spawpaw@hotmail.com  2018-08-24
 *
 * @author BenBenShang spawpaw@hotmail.com
 */
public interface UserMapper {
    Integer insertUser(@Param("user") User user);

    User selectUserByUsername(@Param("username") String username);

    Integer updatePassword(@Param("password") String password);

    User selectUserByUserId(@Param("userId") Long userId);

    List<User> findAllUsers(@Param("pageInfo") PageInfo pageInfo);
}
