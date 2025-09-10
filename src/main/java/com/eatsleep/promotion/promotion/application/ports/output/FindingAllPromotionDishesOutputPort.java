package com.eatsleep.promotion.promotion.application.ports.output;

import com.eatsleep.promotion.promotion.domain.model.PromotionDomainEntity;

import java.util.List;
import java.util.UUID;

public interface FindingAllPromotionDishesOutputPort {
    List<PromotionDomainEntity> findAllPromotionByDishes();
}
