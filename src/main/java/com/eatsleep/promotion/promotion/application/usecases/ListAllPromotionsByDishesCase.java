package com.eatsleep.promotion.promotion.application.usecases;

import com.eatsleep.promotion.common.application.annotations.UseCase;
import com.eatsleep.promotion.promotion.application.ports.input.ListAllPromotionByDishesInputPort;
import com.eatsleep.promotion.promotion.application.ports.output.FindingAllPromotionDishesOutputPort;
import com.eatsleep.promotion.promotion.domain.model.PromotionDomainEntity;
import lombok.RequiredArgsConstructor;

import java.util.List;

@UseCase
@RequiredArgsConstructor
public class ListAllPromotionsByDishesCase implements ListAllPromotionByDishesInputPort {

    private final FindingAllPromotionDishesOutputPort outputPort;

    @Override
    public List<PromotionDomainEntity> listAllPromotionByDishes() {
        return outputPort.findAllPromotionByDishes();
    }
}
