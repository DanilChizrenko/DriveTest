package com.exrule.demotest.service;

import com.exrule.demotest.controller.dto.ManufCreateDTO;
import com.exrule.demotest.model.Manufacturer;
import com.exrule.demotest.repository.ManufRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ManufServiceImpl implements ManufService{
    private final ManufRepository manufRepository;

    @Override
    public Manufacturer create(ManufCreateDTO manufCreateDTO){
        Manufacturer manufacturer = new Manufacturer();
        manufacturer.setManufName(manufCreateDTO.getName());

        return manufRepository.save(manufacturer);
    }

    @Override
    public Manufacturer getById(Long id){
        return manufRepository.findById(id).orElseThrow();
    }
}
