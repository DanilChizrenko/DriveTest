package com.exrule.demotest.service;

import com.exrule.demotest.controller.dto.ManufDto;
import com.exrule.demotest.model.Manufacturer;

public interface ManufService {
    Manufacturer getById(Long id) throws Exception;
    Manufacturer create(ManufDto manufDTO);
    Manufacturer update(Long id, ManufDto manufDTO);
    void delete(Long id);
}
