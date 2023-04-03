package com.exrule.demotest.service;

import com.exrule.demotest.controller.dto.CarDto;
import com.exrule.demotest.model.Car;
import com.exrule.demotest.model.Manufacturer;
import com.exrule.demotest.repository.CarRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
@DisplayName("Должно ")
public class CarServiceTest {
    @Autowired
    private CarService carService;
    @MockBean
    private ManufService manufService;
    @MockBean
    private CarRepository carRepository;

    @Test
    @DisplayName("корректно возвращать модель и год машины")
    void createDriveTest() throws Exception {
        Manufacturer manufacturer = new Manufacturer();
        manufacturer.setId(1L);
        manufacturer.setManufName("BMW");

        CarDto carDTO = new CarDto();
        carDTO.setName("530");
        carDTO.setYear(2017);
        carDTO.setManufacturerId(manufacturer.getId());

        Car car = new Car();
        car.setManufacturer(manufacturer);
        car.setName("530");
        car.setCarIssue(2017);
        car.setId(1L);

        Mockito.when(manufService.getById(2L)).thenReturn(manufacturer);
        Mockito.when(carRepository.save(Mockito.any(Car.class))).thenReturn(car);

        var res = carService.createCarName(carDTO);

        Assertions.assertEquals(res.getName(), "530");
        Assertions.assertEquals(res.getCarIssue(), 2017);
        Assertions.assertEquals(res.getManufacturer().getManufName(), "BMW");
    }

}
