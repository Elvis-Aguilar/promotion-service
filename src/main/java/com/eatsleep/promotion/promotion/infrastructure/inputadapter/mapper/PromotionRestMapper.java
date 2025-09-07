package com.eatsleep.promotion.promotion.infrastructure.inputadapter.mapper;

import com.eatsleep.promotion.promotion.domain.model.PromotionDomainEntity;
import com.eatsleep.promotion.promotion.infrastructure.inputadapter.dto.PromotionResponseDto;
import org.springframework.stereotype.Component;

@Component
public class PromotionRestMapper {

    public PromotionResponseDto toResponse(PromotionDomainEntity domainEntity) {
        return PromotionResponseDto.builder()
                .id(domainEntity.getId())
                .name(domainEntity.getName())
                .discountPercentage(domainEntity.getDiscountPercentage())
                .description(domainEntity.getDescription())
                .build();
    }

}
