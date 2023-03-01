package com.exrule.demotest.controller;

import com.exrule.demotest.controller.dto.DriveCreateDTO;
import com.exrule.demotest.model.Car;
import com.exrule.demotest.service.DriveService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class DriveController {
    private final DriveService driveService;

    @PostMapping("/api/carname")
    public ResponseEntity<?> createCarName(@RequestBody DriveCreateDTO driveCreateDTO){
        String name = driveService.createCarName(driveCreateDTO).getName();
        return ResponseEntity.ok().body("Car create - " + name);
    }

    @GetMapping("/api/carname/{id}")
    public Car getById(@PathVariable Long id) throws Exception {
        return driveService.getById(id);
    }
}
