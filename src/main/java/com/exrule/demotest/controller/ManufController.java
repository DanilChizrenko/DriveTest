package com.exrule.demotest.controller;

import com.exrule.demotest.controller.dto.ManufDto;
import com.exrule.demotest.model.Manufacturer;
import com.exrule.demotest.service.ManufService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ManufController {
    private final ManufService manufService;

    @PostMapping("api/manufacturer/create")
    public ResponseEntity<?> create(@RequestBody ManufDto manufDTO) {
        String name = manufService.create(manufDTO).getManufName();
        return ResponseEntity.ok().body("Manufacturer create - " + name);
    }

    @PutMapping("api/manufacturer/update/{id}")
    public Manufacturer update(@PathVariable Long id, @RequestBody ManufDto manufDTO){
        return manufService.update(id, manufDTO);
    }

    @DeleteMapping("api/manufacturer/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) throws Exception {
         manufService.delete(id);
         return ResponseEntity.ok().body("Manufacturer del");
    }

    @GetMapping("api/manufacturer/{id}")
    public Manufacturer getById(@PathVariable Long id) throws Exception{
        return manufService.getById(id);
    }
}
