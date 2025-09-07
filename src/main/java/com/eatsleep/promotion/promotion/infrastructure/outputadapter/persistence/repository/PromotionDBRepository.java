package com.eatsleep.promotion.promotion.infrastructure.outputadapter.persistence.repository;

import com.eatsleep.promotion.promotion.infrastructure.outputadapter.persistence.entity.PromotionDBEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PromotionDBRepository extends JpaRepository<PromotionDBEntity, UUID> {

    List<PromotionDBEntity> findByRoomIdAndActive(UUID roomId, boolean active);

    List<PromotionDBEntity> findByCustomerIdAndActive(UUID customerId, boolean active);

    List<PromotionDBEntity> findByDishIdAndActive(UUID dishId, boolean active);

}
