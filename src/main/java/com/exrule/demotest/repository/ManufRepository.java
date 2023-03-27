package com.exrule.demotest.repository;

import com.exrule.demotest.model.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManufRepository extends JpaRepository<Manufacturer, Long> {
}
