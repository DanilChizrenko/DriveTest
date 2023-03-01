package com.exrule.demotest.service;

import com.exrule.demotest.controller.dto.DriveCreateDTO;
import com.exrule.demotest.model.Car;
import com.exrule.demotest.repository.DriveRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DriveServiceImpl implements DriveService {
    private final DriveRepository driveRepository;
    private final ManufService manufService;
    @Override
    public Car createCarName(DriveCreateDTO driveCreateDTO){
        Car car = new Car();
        car.setName(driveCreateDTO.getName());
        car.setCarIssue(driveCreateDTO.getYear());
        car.setManufacturer(manufService.getById(driveCreateDTO.getManufacturerId()));
        return driveRepository.save(car);
    }
    @Override
    public Car getById(Long id){
        return driveRepository.findById(id).orElseThrow();
    }
}
