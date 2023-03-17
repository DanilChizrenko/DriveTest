package com.exrule.demotest.service;

import com.exrule.demotest.controller.dto.DriveCreateDTO;
import com.exrule.demotest.model.Cars;

public interface DriveService {
    Cars getById(Long id) throws Exception;
    Cars createCarName(DriveCreateDTO driveCreateDTO) throws Exception;
    Cars updateCarName(Long id, DriveCreateDTO driveCreateDTO) throws Exception;
    void deleteCarName(Long id);
}
