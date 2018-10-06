package com.spawpaw.ben.api.service.upms;

import com.spawpaw.ben.api.base.BaseEntityService;
import com.spawpaw.ben.api.entity.upms.Privilege;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("privilege")
public interface PrivilegeService extends BaseEntityService<Privilege, Long> {
}
