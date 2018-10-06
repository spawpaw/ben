package com.spawpaw.ben.api.base;

import com.spawpaw.ben.api.dto.PageRequest;
import lombok.extern.java.Log;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PathVariable;


@Log
public abstract class BaseEntityServiceImpl<ENTITY, ID, REPOSITORY extends JpaRepository<ENTITY, ID>> implements BaseEntityService<ENTITY, ID> {

    public abstract REPOSITORY getRepository();

    @Override
    public ENTITY create(ENTITY entity) {
        return getRepository().saveAndFlush(entity);
    }

    @Override
    public ENTITY findById(@PathVariable("id") ID id) {
        return getRepository().findById(id).orElse(null);
    }

    @Override
    public Page<ENTITY> findAll(PageRequest pageRequest) {
        return getRepository().findAll(pageRequest);
    }

    @Override
    public ENTITY updateById(ENTITY entity) {
        return getRepository().saveAndFlush(entity);
    }

    @Override
    public void deleteById(@PathVariable("id") ID id) {
        getRepository().deleteById(id);
    }
}
