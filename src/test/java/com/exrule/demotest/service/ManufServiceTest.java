package com.exrule.demotest.service;

import com.exrule.demotest.controller.dto.ManufDto;
import com.exrule.demotest.model.Manufacturer;
import com.exrule.demotest.repository.ManufRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
@DisplayName("Должно ")
public class ManufServiceTest {
    @Autowired
    private ManufService manufService;
    @MockBean
    private ManufRepository manufRepository;

    @Test
    @DisplayName("вернуть навание произвоодителя")
    void createManufacturerTets(){
        ManufDto manufDTO = new ManufDto();
        manufDTO.setName("BMW");

        Manufacturer manufacturer = new Manufacturer();
        manufacturer.setManufName("BMW");
        manufacturer.setId(1L);

        Mockito.when(manufRepository.save(Mockito.any(Manufacturer.class))).thenReturn(manufacturer);

        var res = manufService.create(manufDTO);

        Assertions.assertEquals(res.getManufName(), "BMW");
    }
}
