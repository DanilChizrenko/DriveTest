package com.exrule.demotest.service.Impl;

import com.exrule.demotest.controller.dto.DriveCreateDTO;
import com.exrule.demotest.model.Car;
import com.exrule.demotest.repository.DriveRepository;
import com.exrule.demotest.service.DriveService;
import com.exrule.demotest.service.ManufService;
import com.exrule.demotest.service.RatingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DriveServiceImpl implements DriveService {
    private final DriveRepository driveRepository;
    private final ManufService manufService;

    @Override
    public Car createCarName(DriveCreateDTO driveCreateDTO) throws Exception {
        Car car = new Car();
        car.setName(driveCreateDTO.getName());
        car.setCarIssue(driveCreateDTO.getYear());
        car.setManufacturer(manufService.getById(driveCreateDTO.getManufacturerId()));
        return driveRepository.save(car);
    }

    @Override
    public Car updateCarName(Long id, DriveCreateDTO driveCreateDTO) throws Exception {
        Car car = driveRepository.findById(id).orElseThrow();
        if (id != null) {
            car.setName(driveCreateDTO.getName());
            car.setCarIssue(driveCreateDTO.getYear());
            car.setManufacturer(manufService.getById(driveCreateDTO.getManufacturerId()));
        }
        return driveRepository.save(car);
    }

    @Override
    public void deleteCarName(Long id){
        driveRepository.deleteById(id);
    }

    @Override
    public Car getById(Long id) {
        return driveRepository.findById(id).orElseThrow();
    }
}
