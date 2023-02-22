package com.exrule.demotest.service;

import com.exrule.demotest.model.CarName;
import com.exrule.demotest.repository.DriveRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DriveServiceImpl implements  DriveService{
    private final DriveRepository driveRepository;

    @Override
    public CarName getbyId(Long id) throws Exception {
        return driveRepository.findById(id).orElseThrow();
    }

    @Override
    public Long createDrive(String name, Integer year){
        CarName carName = new CarName();
        carName.setName(name);
        carName.setYear(year);
    }
}
