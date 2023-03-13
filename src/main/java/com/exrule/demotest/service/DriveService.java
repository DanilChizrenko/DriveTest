package com.exrule.demotest.service;

import com.exrule.demotest.controller.dto.DriveCreateDTO;
import com.exrule.demotest.model.Car;

public interface DriveService {
    Car getById(Long id) throws Exception;
    Car createCarName(DriveCreateDTO driveCreateDTO) throws Exception;
    Car updateCarName(Long id, DriveCreateDTO driveCreateDTO) throws Exception;
    void deleteCarName(Long id);
}
