package com.exrule.demotest.repository;

import com.exrule.demotest.model.Manufacturers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManufRepository extends JpaRepository<Manufacturers, Long> {
}
