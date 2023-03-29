package com.exrule.demotest.service;

import com.exrule.demotest.controller.dto.ManufDTO;
import com.exrule.demotest.model.Manufacturer;

public interface ManufService {
    Manufacturer getById(Long id) throws Exception;
    Manufacturer create(ManufDTO manufDTO);
    Manufacturer update(Long id, ManufDTO manufDTO);
    void delete(Long id);
}
