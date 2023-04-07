package com.exrule.demotest.service;

import com.exrule.demotest.controller.dto.ManufDto;
import com.exrule.demotest.model.Manufacturer;

import java.util.List;

public interface ManufService {
    List<Manufacturer> getAllManufacturer() throws Exception;
    Manufacturer getById(Long id) throws Exception;
    Manufacturer create(ManufDto manufDTO);
    Manufacturer update(Long id, ManufDto manufDTO);
    void delete(Long id);
}
