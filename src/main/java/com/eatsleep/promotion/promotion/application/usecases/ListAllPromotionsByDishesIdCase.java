package com.eatsleep.promotion.promotion.application.usecases;

import com.eatsleep.promotion.common.application.annotations.UseCase;
import com.eatsleep.promotion.promotion.application.ports.input.ListAllPromotionByDishesIdInputPort;
import com.eatsleep.promotion.promotion.application.ports.output.FindingAllPromotionDishesIdOutputPort;
import com.eatsleep.promotion.promotion.domain.model.PromotionDomainEntity;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.UUID;

@UseCase
@RequiredArgsConstructor
public class ListAllPromotionsByDishesIdCase implements ListAllPromotionByDishesIdInputPort {

    private final FindingAllPromotionDishesIdOutputPort findingAllPromotionDishesIdOutputPort;

    @Override
    public List<PromotionDomainEntity> listAllPromotionByDishesId(UUID dishesId) {
        return findingAllPromotionDishesIdOutputPort.findAllPromotionByDishesId(dishesId);
    }
}
