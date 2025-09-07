package com.eatsleep.promotion.promotion.application.usecases;

import com.eatsleep.promotion.common.application.annotations.UseCase;
import com.eatsleep.promotion.promotion.application.factory.CreatingPromotionFactory;
import com.eatsleep.promotion.promotion.application.ports.input.CreatingPromotionInputPort;
import com.eatsleep.promotion.promotion.application.ports.output.StoringPromotionOutputPort;
import com.eatsleep.promotion.promotion.domain.model.PromotionDomainEntity;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;

@UseCase
@Validated
@RequiredArgsConstructor
public class CreatePromotionUseCase implements CreatingPromotionInputPort {

    private final StoringPromotionOutputPort storingPromotionOutputPort;
    private final CreatingPromotionFactory factory;

    @Override
    @Transactional
    public void createPromotion(CreatePromotionCaseDto createPromotionCaseDto) {
        PromotionDomainEntity entity = factory.createPromotion(createPromotionCaseDto);
        storingPromotionOutputPort.saveReview(entity);
    }
}
