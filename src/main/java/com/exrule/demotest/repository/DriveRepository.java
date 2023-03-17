package com.exrule.demotest.repository;

import com.exrule.demotest.model.Cars;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriveRepository extends JpaRepository<Cars, Long> {

}
