package com.spawpaw.ben.api.service.uims;

import com.spawpaw.ben.api.base.BaseEntityService;
import com.spawpaw.ben.api.entity.upms.Role;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("role")
public interface RoleService extends BaseEntityService<Role, Long> {
}
