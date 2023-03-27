package com.exrule.demotest.controller.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RatingCreateDTO {
    private Double ratingValue;
    private Long carId;
}
