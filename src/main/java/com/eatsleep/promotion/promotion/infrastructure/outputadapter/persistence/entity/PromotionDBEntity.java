package com.eatsleep.promotion.promotion.infrastructure.outputadapter.persistence.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

import static lombok.AccessLevel.PRIVATE;

@Entity(name = "promotion")
@Table(name = "promotion", schema = "promotion")
@Data
@Builder(toBuilder = true)
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor(access = PRIVATE)
public class PromotionDBEntity {

    @Id
    @GeneratedValue
    @Column(columnDefinition = "UUID DEFAULT uuid_generate_v4()")
    private UUID id;

    @NonNull
    @Column(nullable = false)
    private String name;

    @NonNull
    @Column(nullable = false)
    private String description;

    @NonNull
    @Column(nullable = false)
    private BigDecimal discountPercentage;

    @Builder.Default
    private boolean active = true;

    @Column(nullable = true)
    private UUID customerId;

    @Column(nullable = true)
    private UUID hotelId;

    @Column(nullable = true)
    private UUID restaurantId;

    @Column(nullable = true)
    private UUID dishId;

    @Column(nullable = true)
    private UUID roomId;

    @CreationTimestamp
    private Instant createdAt;

    @UpdateTimestamp
    private Instant updatedAt;
}
