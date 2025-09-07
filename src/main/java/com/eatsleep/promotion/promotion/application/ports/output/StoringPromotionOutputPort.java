package com.eatsleep.promotion.promotion.application.ports.output;

import com.eatsleep.promotion.promotion.domain.model.PromotionDomainEntity;

public interface StoringPromotionOutputPort {
    void saveReview(PromotionDomainEntity promotionDomain);
}
