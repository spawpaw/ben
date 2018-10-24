package com.spawpaw.ben.upms.repository;

import com.spawpaw.ben.api.entity.upms.Privilege;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrivilegeRepository extends JpaRepository<Privilege, Long> {
}
