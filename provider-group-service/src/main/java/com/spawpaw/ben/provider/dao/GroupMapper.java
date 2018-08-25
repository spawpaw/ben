package com.spawpaw.ben.provider.dao;

import com.spawpaw.ben.api.entity.Group;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created By spawpaw@hotmail.com  2018-08-25
 *
 * @author BenBenShang spawpaw@hotmail.com
 */
@Mapper
public interface GroupMapper {
    List<Group> selectGroupByUserId(@Param("userId") Long userId);
}
