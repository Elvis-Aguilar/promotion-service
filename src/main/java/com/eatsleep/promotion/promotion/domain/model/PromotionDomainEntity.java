package com.eatsleep.promotion.promotion.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
public class PromotionDomainEntity {

    private UUID id;
    private String name;
    private String description;
    private BigDecimal discountPercentage;
    private boolean active;
    private UUID customerId;
    private UUID hotelId;
    private UUID restaurantId;
    private UUID dishId;
    private UUID roomId;

    public PromotionDomainEntity(String name, String description, BigDecimal discountPercentage) {
        this.name = name;
        this.description = description;
        this.discountPercentage = discountPercentage;
    }

    public PromotionDomainEntity(UUID id, String name, String description, BigDecimal discountPercentage, boolean active, UUID customerId, UUID hotelId, UUID restaurantId, UUID roomId, UUID dishId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.discountPercentage = discountPercentage;
        this.active = active;
        this.customerId = customerId;
        this.hotelId = hotelId;
        this.restaurantId = restaurantId;
        this.roomId = roomId;
        this.dishId = dishId;
    }


    public PromotionDomainEntity(String name, String description, BigDecimal discountPercentage, boolean active, UUID customerId, UUID hotelId, UUID restaurantId, UUID roomId, UUID dishId) {
        this.name = name;
        this.description = description;
        this.discountPercentage = discountPercentage;
        this.active = active;
        this.customerId = customerId;
        this.hotelId = hotelId;
        this.restaurantId = restaurantId;
        this.roomId = roomId;
        this.dishId = dishId;
    }
}
