package com.eatsleep.promotion.promotion.infrastructure.inputadapter.dto;

import com.eatsleep.promotion.promotion.application.usecases.CreatePromotionCaseDto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Value;

import java.math.BigDecimal;
import java.util.UUID;

@Value
public class CreatPromotionRequestDto {

    @NotNull
    UUID refenceId;

    @NotBlank
    String typeReference;

    @NotBlank
    String name;

    @NotBlank
    String description;

    @Positive
    BigDecimal discountPercentage;

    public CreatePromotionCaseDto toCase(){
        return new  CreatePromotionCaseDto(name, description, discountPercentage, refenceId, typeReference);
    }
}
