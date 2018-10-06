package com.spawpaw.ben.provider.service;

import com.spawpaw.ben.api.base.BaseEntityServiceImpl;
import com.spawpaw.ben.api.entity.upms.Privilege;
import com.spawpaw.ben.api.service.upms.PrivilegeService;
import com.spawpaw.ben.provider.repository.PrivilegeRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class PrivilegeServiceImpl extends BaseEntityServiceImpl<Privilege, Long, PrivilegeRepository> implements PrivilegeService {
    @Resource
    PrivilegeRepository repository;

    @Override
    public PrivilegeRepository getRepository() {
        return repository;
    }
}
