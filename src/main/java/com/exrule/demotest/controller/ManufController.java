package com.exrule.demotest.controller;

import com.exrule.demotest.controller.dto.ManufCreateDTO;
import com.exrule.demotest.model.Manufacturer;
import com.exrule.demotest.service.ManufService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ManufController {
    private final ManufService manufService;

    @PostMapping("api/manufacturer")
    public ResponseEntity<?> create(@RequestBody ManufCreateDTO manufCreateDTO) {
        String name = manufService.create(manufCreateDTO).getManufName();
        return ResponseEntity.ok().body("Manufacturer create - " + name);
    }

    @GetMapping("api/manufacturer/{id}")
    public Manufacturer getById(@PathVariable Long id){
        return manufService.getById(id);
    }
}
