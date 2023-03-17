package com.exrule.demotest.repository;

import com.exrule.demotest.model.Ratings;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepository extends JpaRepository<Ratings, Long> {
    List<Ratings> findByEntityId(Long carId);
}
