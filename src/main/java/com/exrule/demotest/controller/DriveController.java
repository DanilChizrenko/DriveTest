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

    @PostMapping("/api/carname/create")
    public ResponseEntity<?> createCarName(@RequestBody DriveCreateDTO driveCreateDTO) throws Exception {
        String name = driveService.createCarName(driveCreateDTO).getName();
        return ResponseEntity.ok().body("Car create - " + name);
    }

    @PutMapping("/api/carname/update/{id}")
    public Car updateCarName(@PathVariable Long id, @RequestBody DriveCreateDTO driveCreateDTO) throws Exception{
        return driveService.updateCarName(id, driveCreateDTO);
    }

    @DeleteMapping("api/carname/delete/{id}")
    public ResponseEntity<?> deleteCarName(Long id){
        driveService.deleteCarName(id);
        return ResponseEntity.ok().body("Car del");
    }

    @GetMapping("/api/carname/{id}")
    public Car getById(@PathVariable Long id) throws Exception {
        return driveService.getById(id);
    }
}
