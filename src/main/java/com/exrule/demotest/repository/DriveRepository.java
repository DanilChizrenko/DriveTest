package com.exrule.demotest.repository;

import com.exrule.demotest.model.CarName;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriveRepository extends JpaRepository<CarName, Long> {

}
