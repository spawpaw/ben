package com.spawpaw.ben.api.base;

import com.spawpaw.ben.api.dto.PageRequest;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

/**
 * 所有实体都应实现的接口
 *
 * @param <ENTITY> 实体类型
 * @param <ID>     实体主键类型
 * @author BenBenShang spawpaw@hotmail.com 2018.9-2018.9
 * @version 1.0
 */
public interface BaseEntityService<ENTITY, ID> {

    @PostMapping("")
    ENTITY create(ENTITY entity);

    @GetMapping("/{id}")
    ENTITY findById(@PathVariable("id") ID id);

    @GetMapping("")
    Page<ENTITY> findAll(
            @ModelAttribute PageRequest pageRequest
    );

    @PatchMapping("")
    ENTITY updateById(ENTITY entity);

    @DeleteMapping("/{id}")
    void deleteById(@PathVariable("id") ID id);

}
