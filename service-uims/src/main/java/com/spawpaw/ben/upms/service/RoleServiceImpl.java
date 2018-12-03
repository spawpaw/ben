package com.spawpaw.ben.upms.service;

import com.spawpaw.ben.api.base.BaseEntityServiceImpl;
import com.spawpaw.ben.api.entity.upms.Role;
import com.spawpaw.ben.api.service.uims.RoleService;
import com.spawpaw.ben.upms.repository.RoleRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class RoleServiceImpl extends BaseEntityServiceImpl<Role, Long, RoleRepository> implements RoleService {
    @Resource
    RoleRepository repository;

    @Override
    public RoleRepository getRepository() {
        return repository;
    }
}
