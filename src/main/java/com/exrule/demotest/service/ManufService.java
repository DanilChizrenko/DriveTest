package com.exrule.demotest.service;

import com.exrule.demotest.controller.dto.ManufCreateDTO;
import com.exrule.demotest.model.Manufacturers;

public interface ManufService {
    Manufacturers getById(Long id) throws Exception;
    Manufacturers create(ManufCreateDTO manufCreateDTO);
    Manufacturers update(Long id, ManufCreateDTO manufCreateDTO);
    void delete(Long id);
}
