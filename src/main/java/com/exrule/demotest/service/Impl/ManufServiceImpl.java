package com.exrule.demotest.service.Impl;

import com.exrule.demotest.controller.dto.ManufDTO;
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
    public Manufacturer create(ManufDTO manufDTO) {
        Manufacturer manufacturer = new Manufacturer();
        manufacturer.setManufName(manufDTO.getName());

        return manufRepository.save(manufacturer);
    }

    @Override
    public Manufacturer update(Long id, ManufDTO manufDTO) {
        Manufacturer manufacturer = manufRepository.findById(id).orElseThrow();
        if (id != null) {
            manufacturer.setManufName(manufDTO.getName());
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
