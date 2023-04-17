package com.exrule.demotest.repository;

import com.exrule.demotest.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Long> {
    List<Role> findAllByName(String name);
}
