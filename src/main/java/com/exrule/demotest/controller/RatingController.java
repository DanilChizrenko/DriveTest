package com.exrule.demotest.controller;

import com.exrule.demotest.controller.dto.RatingCreateDTO;
import com.exrule.demotest.model.Ratings;
import com.exrule.demotest.service.RatingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class RatingController {
    private final RatingService ratingService;

}
