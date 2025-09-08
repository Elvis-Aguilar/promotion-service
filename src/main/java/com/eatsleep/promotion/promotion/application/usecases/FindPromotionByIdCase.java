package com.eatsleep.promotion.promotion.application.usecases;

import com.eatsleep.promotion.common.application.annotations.UseCase;
import com.eatsleep.promotion.promotion.application.ports.input.FindingPromotionByIdInputPort;
import com.eatsleep.promotion.promotion.application.ports.output.FindingPromotionByIdOutputPort;
import com.eatsleep.promotion.promotion.domain.model.PromotionDomainEntity;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@UseCase
@RequiredArgsConstructor
public class FindPromotionByIdCase implements FindingPromotionByIdInputPort {

    private final FindingPromotionByIdOutputPort findingPromotionByIdOutputPort;

    @Override
    public PromotionDomainEntity findPromotionById(UUID promotionId) {
        return findingPromotionByIdOutputPort.findPromotionById(promotionId);
    }

}
