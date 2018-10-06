package com.spawpaw.ben.provider.repository;

import com.spawpaw.ben.api.entity.upms.Role;
import com.spawpaw.ben.api.entity.upms.User;
import com.spawpaw.ben.api.entity.upms.UserHasRole;
import com.spawpaw.ben.api.entity.upms.UserHasRolePK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface UserHasRoleRepository extends JpaRepository<UserHasRole, UserHasRolePK> {

    @Query("SELECT user FROM UserHasRole uhr   LEFT JOIN  User user ON user.id=uhr.userId WHERE uhr.roleId=?1")
    Set<User> findUsersByRoleId(Long roleId);

    @Query("SELECT role FROM UserHasRole uhr   LEFT JOIN  Role role ON role.id=uhr.roleId WHERE uhr.userId=?1")
    Set<Role> findRolesByUserId(Long userId);

}
