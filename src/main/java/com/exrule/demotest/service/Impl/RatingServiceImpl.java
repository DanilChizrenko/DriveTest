package com.exrule.demotest.service.Impl;

import com.exrule.demotest.controller.dto.RatingCreateDTO;
import com.exrule.demotest.model.Ratings;
import com.exrule.demotest.repository.RatingRepository;
import com.exrule.demotest.service.RatingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RatingServiceImpl implements RatingService {
    private final RatingRepository ratingRepository;

    @Override
    public Ratings addRating(RatingCreateDTO ratingCreateDTO) throws Exception {
        Ratings ratings = new Ratings();
        ratings.setRatingValue(ratings.getRatingValue());
        return ratingRepository.save(ratings);
    }

    @Override
    public List<Ratings> getRatingsForEntity(Long carId) throws Exception {
        return ratingRepository.findByEntityId(carId);
    }

    @Override
    public Double calculateAverageRating(Long carId) throws Exception {
        return null;
    }

    @Override
    public void delete(Long id) {
        ratingRepository.deleteById(id);
    }
}
