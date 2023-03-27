package com.exrule.demotest.controller;

import com.exrule.demotest.controller.dto.RatingCreateDTO;
import com.exrule.demotest.model.Rating;
import com.exrule.demotest.service.RatingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RatingController {
    private final RatingService ratingService;

    @PostMapping("api/rating/addrat")
    public ResponseEntity<?> addRating(@RequestBody RatingCreateDTO ratingCreateDTO) throws Exception {
        Double value = ratingService.addRating(ratingCreateDTO).getRatingValue();
        return ResponseEntity.ok().body("Rating is add - " + value);
    }

    @GetMapping("api/rating/getavgrate")
    public Double calculateAverageRating(@PathVariable Long carId) throws Exception {
        return ratingService.calculateAverageRating(carId);
    }

    @DeleteMapping("api/rating/delrat/{id}")
    public ResponseEntity<?> delete(Long id){
        ratingService.delete(id);
        return ResponseEntity.ok().body("Rating del");
    }

    @GetMapping("api/rating/getrating/{id}")
    public List<Rating> getRatingsForEntity(@PathVariable Long carId) throws Exception {
        return ratingService.getRatingsForEntity(carId);
    }
}
