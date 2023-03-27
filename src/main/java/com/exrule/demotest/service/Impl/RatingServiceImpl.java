package com.exrule.demotest.service.Impl;

import com.exrule.demotest.controller.dto.RatingCreateDTO;
import com.exrule.demotest.model.Rating;
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
    public Rating addRating(RatingCreateDTO ratingCreateDTO) throws Exception {
        Rating rating = new Rating();
        rating.setRatingValue(ratingCreateDTO.getRatingValue());
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getRatingsForEntity(Long carId) throws Exception {
        return ratingRepository.findAllByCar_Id(carId);
    }

    @Override
    public Double calculateAverageRating(Long carId) throws Exception {
        List<Rating> ratings = getRatingsForEntity(carId);
        if (ratings.isEmpty()){
            return 0.0;
        }
        double sum = ratings.stream().mapToDouble(Rating::getRatingValue).sum();
        return sum / ratings.size();
    }

    @Override
    public void delete(Long id) {
        ratingRepository.deleteById(id);
    }
}
