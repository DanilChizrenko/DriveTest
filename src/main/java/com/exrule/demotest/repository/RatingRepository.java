package com.exrule.demotest.repository;

import com.exrule.demotest.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepository extends JpaRepository<Rating, Long> {
    List<Rating> findAllByCar_Id(Long carId);
}
