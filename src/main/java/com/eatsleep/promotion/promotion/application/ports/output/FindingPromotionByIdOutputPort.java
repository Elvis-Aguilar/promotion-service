package com.eatsleep.promotion.promotion.application.ports.output;

import com.eatsleep.promotion.promotion.domain.model.PromotionDomainEntity;

import java.util.UUID;

public interface FindingPromotionByIdOutputPort {
    PromotionDomainEntity findPromotionById(UUID promotionId);
}
