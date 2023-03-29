package com.exrule.demotest.service;

import com.exrule.demotest.controller.dto.CarDTO;
import com.exrule.demotest.model.Car;

public interface CarService {
    Car getById(Long id) throws Exception;
    Car createCarName(CarDTO carDTO) throws Exception;
    Car updateCarName(Long id, CarDTO carDTO) throws Exception;
    void deleteCarName(Long id);
}
