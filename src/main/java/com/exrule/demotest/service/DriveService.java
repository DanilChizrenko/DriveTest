package com.exrule.demotest.service;

import com.exrule.demotest.model.Car;

public interface DriveService {
    Car getbyId(Long id) throws Exception;
    Long createCarName(String name, Integer year);
}
