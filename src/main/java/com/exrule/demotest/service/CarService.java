package com.exrule.demotest.service;

import com.exrule.demotest.controller.dto.CarDto;
import com.exrule.demotest.model.Car;

public interface CarService {
    Car getById(Long id) throws Exception;
    Car createCarName(CarDto carDTO) throws Exception;
    Car updateCarName(Long id, CarDto carDTO) throws Exception;
    void deleteCarName(Long id);
}
