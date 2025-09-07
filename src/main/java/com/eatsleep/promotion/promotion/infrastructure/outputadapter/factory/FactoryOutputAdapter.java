package com.eatsleep.promotion.promotion.infrastructure.outputadapter.factory;

import com.eatsleep.promotion.common.infrastructure.exception.BadRequestException;
import com.eatsleep.promotion.promotion.application.factory.CreatingPromotionFactory;
import com.eatsleep.promotion.promotion.application.usecases.CreatePromotionCaseDto;
import com.eatsleep.promotion.promotion.domain.model.PromotionDomainEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.UUID;
import java.util.function.BiConsumer;

@Component
@RequiredArgsConstructor
public class FactoryOutputAdapter implements CreatingPromotionFactory {

    private static final Map<String, BiConsumer<PromotionDomainEntity, UUID>> referenceHandlers = Map.of(
            "hotel", PromotionDomainEntity::setHotelId,
            "room", PromotionDomainEntity::setRoomId,
            "restaurant", PromotionDomainEntity::setRestaurantId,
            "dishes", PromotionDomainEntity::setDishId,
            "customer", PromotionDomainEntity::setCustomerId
    );

    @Override
    public PromotionDomainEntity createPromotion(CreatePromotionCaseDto createPromotionCaseDto) {
        PromotionDomainEntity entity = new PromotionDomainEntity(createPromotionCaseDto.getName(), createPromotionCaseDto.getDescription(), createPromotionCaseDto.getDiscountPercentage());

        referenceHandlers
                .getOrDefault(createPromotionCaseDto.getTypeReference().toLowerCase(),
                        (e, id) -> { throw new BadRequestException("Referencia no valida"); })
                .accept(entity, createPromotionCaseDto.getRefenceId());

        return entity;
    }
}
