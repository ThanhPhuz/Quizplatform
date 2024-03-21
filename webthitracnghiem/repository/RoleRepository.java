package com.tttn.webthitracnghiem.repository;

import com.tttn.webthitracnghiem.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,Integer> {
    Optional<Role> findByRoleName(String roleName);
//    @Query("SELECT r.id FROM Role r WHERE r.role_name = ?1")
//    Long getRoleIdByName(String roleName);
}
