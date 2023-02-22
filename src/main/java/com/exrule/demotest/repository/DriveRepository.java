package com.exrule.demotest.repository;

import com.exrule.demotest.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriveRepository extends JpaRepository<Car, Long> {

}
