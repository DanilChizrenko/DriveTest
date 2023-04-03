package com.exrule.demotest.service;

import com.exrule.demotest.controller.dto.RatingDto;
import com.exrule.demotest.model.Rating;

import java.util.List;

public interface RatingService {
    Rating addRating(RatingDto ratingDTO) throws Exception;
    List<Rating> getRatingsForEntity(Long carId) throws Exception;
    Double calculateAverageRating(Long carId) throws Exception;
    void delete(Long id);
}
