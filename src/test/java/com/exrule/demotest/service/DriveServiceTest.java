package com.exrule.demotest.service;

import com.exrule.demotest.controller.dto.DriveCreateDTO;
import com.exrule.demotest.model.Cars;
import com.exrule.demotest.model.Manufacturers;
import com.exrule.demotest.repository.DriveRepository;
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
    void createDriveTest() throws Exception {
        Manufacturers manufacturers = new Manufacturers();
        manufacturers.setId(1L);
        manufacturers.setManufName("BMW");

        DriveCreateDTO driveCreateDTO = new DriveCreateDTO();
        driveCreateDTO.setName("530");
        driveCreateDTO.setYear(2017);
        driveCreateDTO.setManufacturerId(manufacturers.getId());

        Cars cars = new Cars();
        cars.setManufacturers(manufacturers);
        cars.setName("530");
        cars.setCarIssue(2017);
        cars.setId(1L);

        Mockito.when(manufService.getById(2L)).thenReturn(manufacturers);
        Mockito.when(driveRepository.save(Mockito.any(Cars.class))).thenReturn(cars);

        var res = driveService.createCarName(driveCreateDTO);

        Assertions.assertEquals(res.getName(), "530");
        Assertions.assertEquals(res.getCarIssue(), 2017);
        Assertions.assertEquals(res.getManufacturers().getManufName(), "BMW");
    }

}
