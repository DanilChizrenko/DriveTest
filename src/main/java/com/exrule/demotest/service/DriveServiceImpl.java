package com.exrule.demotest.service;

import com.exrule.demotest.model.Car;
import com.exrule.demotest.repository.DriveRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DriveServiceImpl implements DriveService {
    private final DriveRepository driveRepository;

    @Override
    public Car getbyId(Long id) throws Exception {
        return driveRepository.findById(id).orElseThrow();
    }

    @Override
    public Long createCarName(String name, Integer year){
        Car car = new Car();
        car.setName(name);
        car.setCreationYear(year);

        return driveRepository.save(car).getId();
    }
}
