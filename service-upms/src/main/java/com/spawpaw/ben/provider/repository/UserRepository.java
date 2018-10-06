package com.spawpaw.ben.provider.repository;

import com.spawpaw.ben.api.entity.upms.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByUsername(String username);
}
