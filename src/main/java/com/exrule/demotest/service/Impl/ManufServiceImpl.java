package com.exrule.demotest.service.Impl;

import com.exrule.demotest.controller.dto.ManufCreateDTO;
import com.exrule.demotest.model.Manufacturers;
import com.exrule.demotest.repository.ManufRepository;
import com.exrule.demotest.service.ManufService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ManufServiceImpl implements ManufService {
    private final ManufRepository manufRepository;

    @Override
    public Manufacturers create(ManufCreateDTO manufCreateDTO) {
        Manufacturers manufacturers = new Manufacturers();
        manufacturers.setManufName(manufCreateDTO.getName());

        return manufRepository.save(manufacturers);
    }

    @Override
    public Manufacturers update(Long id, ManufCreateDTO manufCreateDTO) {
        Manufacturers manufacturers = manufRepository.findById(id).orElseThrow();
        if (id != null) {
            manufacturers.setManufName(manufCreateDTO.getName());
        }
        return manufRepository.save(manufacturers);
    }

    @Override
    public void delete(Long id) {
        manufRepository.deleteById(id);
    }


    @Override
    public Manufacturers getById(Long id) {
        return manufRepository.findById(id).orElseThrow();
    }

}
