package com.exrule.demotest.service;

import com.exrule.demotest.controller.dto.DriveCreateDTO;
import com.exrule.demotest.model.Car;
import com.exrule.demotest.model.Manufacturer;
import com.exrule.demotest.repository.DriveRepository;
import com.exrule.demotest.service.DriveService;
import com.exrule.demotest.service.ManufService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
@DisplayName("Должно ")
public class DriveServiceTest {
    @Autowired
    private DriveService driveService;
    @MockBean
    private ManufService manufService;
    @MockBean
    private DriveRepository driveRepository;

    @Test
    @DisplayName("корректно возвращать модель и год машины")
    void createDriveTest(){
        Manufacturer manufacturer = new Manufacturer();
        manufacturer.setId(1L);
        manufacturer.setManufName("BMW");

        DriveCreateDTO driveCreateDTO = new DriveCreateDTO();
        driveCreateDTO.setName("530");
        driveCreateDTO.setYear(2017);
        driveCreateDTO.setManufacturerId(manufacturer.getId());

        Car car = new Car();
        car.setManufacturer(manufacturer);
        car.setName("530");
        car.setCarIssue(2017);
        car.setId(1L);

        Mockito.when(manufService.getById(2L)).thenReturn(manufacturer);
        Mockito.when(driveRepository.save(Mockito.any(Car.class))).thenReturn(car);

        var res = driveService.createCarName(driveCreateDTO);

        Assertions.assertEquals(res.getName(), "530");
        Assertions.assertEquals(res.getCarIssue(), 2017);
        Assertions.assertEquals(res.getManufacturer().getManufName(), "BMW");
    }

}
