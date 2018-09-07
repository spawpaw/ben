package com.spawpaw.ben.rest.controller;

import com.spawpaw.ben.api.entity.User;
import org.springframework.web.bind.annotation.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

/**
 * 权限实体相关的API
 */
@RestController
@RequestMapping("privilege")
public class PrivilegeRestController {
    @GetMapping("")
    List<User> getList(
            @RequestParam(value = "page", required = false, defaultValue = "1") Long page
            , @RequestParam(value = "pageSize", required = false, defaultValue = "20") Long pageSize
    ) {
        throw new NotImplementedException();
    }

    @PostMapping("")
    User create() {
        throw new NotImplementedException();
    }

    @PutMapping("")
    User update() {
        throw new NotImplementedException();
    }

    @DeleteMapping("/{id}")
    void deleteById(@PathVariable("id") Long id) {
        throw new NotImplementedException();
    }

}
