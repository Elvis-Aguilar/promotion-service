package com.eatsleep.promotion.promotion.application.ports.input;

import com.eatsleep.promotion.promotion.domain.model.PromotionDomainEntity;

import java.util.UUID;

public interface FindingPromotionByIdInputPort {
    PromotionDomainEntity findPromotionById(UUID promotionId);
}
