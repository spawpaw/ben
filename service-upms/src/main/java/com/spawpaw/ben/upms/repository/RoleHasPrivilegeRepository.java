package com.spawpaw.ben.upms.repository;

import com.spawpaw.ben.api.entity.upms.Privilege;
import com.spawpaw.ben.api.entity.upms.Role;
import com.spawpaw.ben.api.entity.upms.RoleHasPrivilege;
import com.spawpaw.ben.api.entity.upms.RoleHasPrivilegePK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleHasPrivilegeRepository extends JpaRepository<RoleHasPrivilege, RoleHasPrivilegePK> {

    @Query("SELECT role FROM RoleHasPrivilege rhp   LEFT JOIN  Role role ON role.id=rhp.roleId WHERE rhp.privilegeId=?1")
    List<Role> findRolesByPrivilegeId(Long privilegeId);

    @Query("SELECT privilege FROM RoleHasPrivilege rhp   LEFT JOIN  Privilege privilege ON privilege.id=rhp.privilegeId WHERE rhp.roleId=?1")
    List<Privilege> findPrivilegesByRoleId(Long roleId);

}






