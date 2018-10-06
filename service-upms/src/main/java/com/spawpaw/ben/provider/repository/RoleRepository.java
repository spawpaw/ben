package com.spawpaw.ben.provider.repository;

import com.spawpaw.ben.api.entity.upms.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
