package com.exrule.demotest.service;

import com.exrule.demotest.controller.dto.ManufCreateDTO;
import com.exrule.demotest.model.Manufacturers;
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
        ManufCreateDTO manufCreateDTO = new ManufCreateDTO();
        manufCreateDTO.setName("BMW");

        Manufacturers manufacturers = new Manufacturers();
        manufacturers.setManufName("BMW");
        manufacturers.setId(1L);

        Mockito.when(manufRepository.save(Mockito.any(Manufacturers.class))).thenReturn(manufacturers);

        var res = manufService.create(manufCreateDTO);

        Assertions.assertEquals(res.getManufName(), "BMW");
    }
}
