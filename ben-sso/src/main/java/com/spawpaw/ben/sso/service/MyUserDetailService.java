package com.spawpaw.ben.sso.service;

import com.spawpaw.ben.api.entity.upms.User;
import com.spawpaw.ben.api.service.upms.UserService;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created By spawpaw@hotmail.com  2018-08-24
 *
 * @author BenBenShang spawpaw@hotmail.com
 */
@Service
public class MyUserDetailService implements UserDetailsService {
    @Resource
    UserService userService;
//    @Reference(version = "${ben.group-service.version}",
//            registry = "main-registry"
//    )
//    RoleService roleService;
//    @Reference(version = "${ben.privilege-service.version}",
//            registry = "main-registry"
//    )
//    PrivilegeService userPrivilegeService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //1.查找用户
        final User userInDb = userService.loadUserByUserName(username);
        if (userInDb == null)
            throw new UsernameNotFoundException("不存在此用户");

        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
//        //2.查找用户组
//        final List<Role> groups = roleService.loadGroupsByUserId(userInDb.getId());
//        for (UserGroup group : groups) {
//            System.out.println("用户组：" + group.toString());
//            authorities.add(new SimpleGrantedAuthority("ROLE_" + group.getName().toUpperCase()));
//        }
//        //3.查找权限
        boolean disabled = false;
//        final List<Privilege> privileges = userPrivilegeService.loadPrivilegesByGroups(groups, true);
//        for (UserPrivilege privilege : privileges) {
//            authorities.add(new SimpleGrantedAuthority(privilege.getName().toUpperCase()));
//            System.out.println("privilege: " + privilege.toString());
//            if (privilege.getName().equals("LOGIN"))
//                disabled = false;
//        }
        System.out.printf("user in db" + userInDb.toString());
        return org.springframework.security.core.userdetails.User
                .withUsername(username)
                .authorities(authorities)
                .password(userInDb.getPassword())
                .disabled(disabled)
                .build();
    }
}
