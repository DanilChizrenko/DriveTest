package com.exrule.demotest.service;

import com.exrule.demotest.controller.dto.ManufCreateDTO;
import com.exrule.demotest.model.Manufacturer;

public interface ManufService {
    Manufacturer getById(Long id) throws Exception;
    Manufacturer create(ManufCreateDTO manufCreateDTO);
    Manufacturer update(Long id, ManufCreateDTO manufCreateDTO);
    void delete(Long id);
}
