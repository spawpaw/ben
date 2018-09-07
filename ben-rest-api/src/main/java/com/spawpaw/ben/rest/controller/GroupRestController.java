package com.spawpaw.ben.rest.controller;

import com.spawpaw.ben.api.entity.User;
import org.springframework.web.bind.annotation.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

/**
 * 用户组实体相关的API
 *
 * @author BenBenShang spawpaw@hotmail.com
 * @since v1.0.0
 */
@RestController
@RequestMapping("group")
public class GroupRestController {
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
