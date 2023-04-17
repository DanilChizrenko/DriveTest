package com.exrule.demotest.service;

import com.exrule.demotest.model.Role;

import java.util.List;

public interface RoleService {
    void addRoles() throws Exception;
    List<Role> getRoles() throws Exception;
}
