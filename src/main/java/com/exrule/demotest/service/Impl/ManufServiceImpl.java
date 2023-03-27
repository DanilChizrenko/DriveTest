package com.exrule.demotest.service.Impl;

import com.exrule.demotest.controller.dto.ManufCreateDTO;
import com.exrule.demotest.model.Manufacturer;
import com.exrule.demotest.repository.ManufRepository;
import com.exrule.demotest.service.ManufService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ManufServiceImpl implements ManufService {
    private final ManufRepository manufRepository;

    @Override
    public Manufacturer create(ManufCreateDTO manufCreateDTO) {
        Manufacturer manufacturer = new Manufacturer();
        manufacturer.setManufName(manufCreateDTO.getName());

        return manufRepository.save(manufacturer);
    }

    @Override
    public Manufacturer update(Long id, ManufCreateDTO manufCreateDTO) {
        Manufacturer manufacturer = manufRepository.findById(id).orElseThrow();
        if (id != null) {
            manufacturer.setManufName(manufCreateDTO.getName());
        }
        return manufRepository.save(manufacturer);
    }

    @Override
    public void delete(Long id) {
        manufRepository.deleteById(id);
    }


    @Override
    public Manufacturer getById(Long id) {
        return manufRepository.findById(id).orElseThrow();
    }

}
