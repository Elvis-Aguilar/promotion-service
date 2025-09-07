package com.eatsleep.promotion.promotion.application.ports.input;

import com.eatsleep.promotion.promotion.domain.model.PromotionDomainEntity;

import java.util.List;
import java.util.UUID;

public interface ListAllPromotionByDishesIdInputPort {
    List<PromotionDomainEntity> listAllPromotionByDishesId(UUID dishesId);
}
