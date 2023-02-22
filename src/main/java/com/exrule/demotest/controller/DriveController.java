package com.exrule.demotest.controller;

import com.exrule.demotest.controller.dto.DriveCreateDTO;
import com.exrule.demotest.model.CarName;
import com.exrule.demotest.service.DriveService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class DriveController {
    private final DriveService driveService;

    @GetMapping("/api/carname/{id}")
    public CarName getbyId(@PathVariable Long id) throws Exception {
        return driveService.getbyId(id);
    }

    @PostMapping("/api/carname")
    public Long createCarName(@RequestBody DriveCreateDTO createDTO){
        return driveService.createCarName(createDTO.getName(), createDTO.getYear());
    }
}
