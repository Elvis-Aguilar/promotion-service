package com.eatsleep.promotion.promotion.infrastructure.inputadapter.dto;

import lombok.Builder;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Builder(toBuilder = true)
public record PromotionResponseDto(
        UUID id,
        String name,
        String description,
        BigDecimal discountPercentage
) {
}
