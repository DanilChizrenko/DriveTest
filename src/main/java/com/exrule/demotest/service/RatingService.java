package com.exrule.demotest.service;

import com.exrule.demotest.controller.dto.RatingCreateDTO;
import com.exrule.demotest.model.Ratings;

import java.util.List;

public interface RatingService {
    Ratings addRating(RatingCreateDTO ratingCreateDTO) throws Exception;
    List<Ratings> getRatingsForEntity(Long carId) throws Exception;
    Double calculateAverageRating(Long carId) throws Exception;
    void delete(Long id);
}
