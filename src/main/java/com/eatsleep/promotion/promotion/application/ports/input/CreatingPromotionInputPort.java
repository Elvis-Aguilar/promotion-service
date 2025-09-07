package com.eatsleep.promotion.promotion.application.ports.input;

import com.eatsleep.promotion.promotion.application.usecases.CreatePromotionCaseDto;

public interface CreatingPromotionInputPort {
    void createPromotion(CreatePromotionCaseDto createPromotionCaseDto);
}
