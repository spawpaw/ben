package com.spawpaw.ben.provider.dao;

import com.spawpaw.ben.api.entity.Group;
import com.spawpaw.ben.api.entity.Privilege;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created By spawpaw@hotmail.com  2018-08-25
 *
 * @author BenBenShang spawpaw@hotmail.com
 */
@Mapper
public interface UserPrivilegeMapper {
    List<Privilege> selectPrivilegesByGroups(@Param("groups") List<Group> groups);
}
