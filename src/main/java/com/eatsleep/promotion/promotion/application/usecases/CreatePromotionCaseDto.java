package com.eatsleep.promotion.promotion.application.usecases;

import lombok.AllArgsConstructor;
import lombok.Value;

import java.math.BigDecimal;
import java.util.UUID;

@Value
@AllArgsConstructor
public class CreatePromotionCaseDto {

    String name;
    String description;
    BigDecimal discountPercentage;
    UUID refenceId;
    String typeReference;

}
