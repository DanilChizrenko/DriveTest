package com.exrule.demotest.service.Impl;

import com.exrule.demotest.controller.dto.CarDto;
import com.exrule.demotest.model.Car;
import com.exrule.demotest.repository.CarRepository;
import com.exrule.demotest.service.CarService;
import com.exrule.demotest.service.ManufService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;
    private final ManufService manufService;

    @Override
    public Car createCarName(CarDto carDTO) throws Exception {
        Car car = new Car();
        car.setName(carDTO.getName());
        car.setCarIssue(carDTO.getYear());
        car.setManufacturer(manufService.getById(carDTO.getManufacturerId()));
        return carRepository.save(car);
    }

    @Override
    public Car updateCarName(Long id, CarDto carDTO) throws Exception {
        Car car = carRepository.findById(id).orElseThrow();
        if (id != null) {
            car.setName(carDTO.getName());
            car.setCarIssue(carDTO.getYear());
            car.setManufacturer(manufService.getById(carDTO.getManufacturerId()));
        }
        return carRepository.save(car);
    }

    @Override
    public void deleteCarName(Long id){
        carRepository.deleteById(id);
    }

    @Override
    public Car getById(Long id) {
        return carRepository.findById(id).orElseThrow();
    }
}
