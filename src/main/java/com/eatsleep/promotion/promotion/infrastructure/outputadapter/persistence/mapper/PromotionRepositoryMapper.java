package com.eatsleep.promotion.promotion.infrastructure.outputadapter.persistence.mapper;

import com.eatsleep.promotion.promotion.domain.model.PromotionDomainEntity;
import com.eatsleep.promotion.promotion.infrastructure.outputadapter.persistence.entity.PromotionDBEntity;
import org.springframework.stereotype.Component;

@Component
public class PromotionRepositoryMapper {

    public PromotionDBEntity toDBEntity(PromotionDomainEntity domainEntity) {
        return PromotionDBEntity.builder()
                .name(domainEntity.getName())
                .description(domainEntity.getDescription())
                .discountPercentage(domainEntity.getDiscountPercentage())
                .active(true)
                .hotelId(domainEntity.getHotelId())
                .restaurantId(domainEntity.getRestaurantId())
                .dishId(domainEntity.getDishId())
                .roomId(domainEntity.getRoomId())
                .customerId(domainEntity.getCustomerId())
                .build();

    }

    public PromotionDomainEntity toDomainEntity(PromotionDBEntity dbEntity) {
        return new PromotionDomainEntity(dbEntity.getId(),
                dbEntity.getName(),
                dbEntity.getDescription(),
                dbEntity.getDiscountPercentage(),
                dbEntity.isActive(),
                dbEntity.getCustomerId(),
                dbEntity.getHotelId(),
                dbEntity.getRestaurantId(),
                dbEntity.getRoomId(),
                dbEntity.getDishId());
    }

}
