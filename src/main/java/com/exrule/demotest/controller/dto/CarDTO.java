package com.exrule.demotest.controller.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarDTO {
    private String name;
    private Integer year;
    private Long manufacturerId;
    private Double ratingValue;
}
