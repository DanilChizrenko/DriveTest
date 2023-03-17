package com.exrule.demotest.service.Impl;

import com.exrule.demotest.controller.dto.DriveCreateDTO;
import com.exrule.demotest.controller.dto.RatingCreateDTO;
import com.exrule.demotest.model.Cars;
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
    private final RatingService ratingService;

    @Override
    public Cars createCarName(DriveCreateDTO driveCreateDTO) throws Exception {
        Cars cars = new Cars();
        cars.setName(driveCreateDTO.getName());
        cars.setCarIssue(driveCreateDTO.getYear());
        cars.setManufacturers(manufService.getById(driveCreateDTO.getManufacturerId()));
        return driveRepository.save(cars);
    }

    @Override
    public Cars updateCarName(Long id, DriveCreateDTO driveCreateDTO) throws Exception {
        Cars cars = driveRepository.findById(id).orElseThrow();
        if (id != null) {
            cars.setName(driveCreateDTO.getName());
            cars.setCarIssue(driveCreateDTO.getYear());
            cars.setManufacturers(manufService.getById(driveCreateDTO.getManufacturerId()));
        }
        return driveRepository.save(cars);
    }

    @Override
    public void deleteCarName(Long id){
        driveRepository.deleteById(id);
    }

    @Override
    public Cars getById(Long id) {
        return driveRepository.findById(id).orElseThrow();
    }
}
