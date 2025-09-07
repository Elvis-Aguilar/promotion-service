package com.eatsleep.promotion.promotion.application.factory;

import com.eatsleep.promotion.promotion.application.usecases.CreatePromotionCaseDto;
import com.eatsleep.promotion.promotion.domain.model.PromotionDomainEntity;

public interface CreatingPromotionFactory {
    PromotionDomainEntity createPromotion(CreatePromotionCaseDto createPromotionCaseDto);
}
