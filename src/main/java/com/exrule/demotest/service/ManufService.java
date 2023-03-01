package com.exrule.demotest.service;

import com.exrule.demotest.controller.dto.ManufCreateDTO;
import com.exrule.demotest.model.Manufacturer;

public interface ManufService {
    Manufacturer create(ManufCreateDTO manufCreateDTO);
    Manufacturer getById(Long id);
}
