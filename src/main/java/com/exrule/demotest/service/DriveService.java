package com.exrule.demotest.service;

import com.exrule.demotest.model.CarName;

public interface DriveService {
    CarName getbyId(Long id) throws Exception;
    Long createCarName();
}
