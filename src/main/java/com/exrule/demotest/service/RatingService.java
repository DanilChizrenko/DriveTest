package com.exrule.demotest.service;

import com.exrule.demotest.controller.dto.RatingDTO;
import com.exrule.demotest.model.Rating;

import java.util.List;

public interface RatingService {
    Rating addRating(RatingDTO ratingDTO) throws Exception;
    List<Rating> getRatingsForEntity(Long carId) throws Exception;
    Double calculateAverageRating(Long carId) throws Exception;
    void delete(Long id);
}
