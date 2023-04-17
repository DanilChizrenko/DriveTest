package com.exrule.demotest.service;

import com.exrule.demotest.model.Role;
import com.exrule.demotest.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService{
    private final RoleRepository roleRepository;
    @Override
    public void addRoles() throws Exception{
        Role user = new Role("User");
        Role admin = new Role("Admin");
        roleRepository.saveAll(List.of(user, admin));
    }

    @Override
    public List<Role> getRoles() throws Exception {
        return roleRepository.findAll();
    }
}
