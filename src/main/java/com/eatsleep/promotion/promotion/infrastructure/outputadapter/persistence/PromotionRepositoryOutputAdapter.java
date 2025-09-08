package com.eatsleep.promotion.promotion.infrastructure.outputadapter.persistence;

import com.eatsleep.promotion.common.infrastructure.annotation.PersistenceAdapter;
import com.eatsleep.promotion.common.infrastructure.exception.BadRequestException;
import com.eatsleep.promotion.promotion.application.ports.output.*;
import com.eatsleep.promotion.promotion.domain.model.PromotionDomainEntity;
import com.eatsleep.promotion.promotion.infrastructure.outputadapter.persistence.entity.PromotionDBEntity;
import com.eatsleep.promotion.promotion.infrastructure.outputadapter.persistence.mapper.PromotionRepositoryMapper;
import com.eatsleep.promotion.promotion.infrastructure.outputadapter.persistence.repository.PromotionDBRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;


@PersistenceAdapter
@RequiredArgsConstructor
public class PromotionRepositoryOutputAdapter implements StoringPromotionOutputPort, FindingAllPromotionRoomIdOutputPort, FindingAllPromotionDishesIdOutputPort,
        FindingAllPromotionCustomersIdOutputPort, FindingPromotionByIdOutputPort {

    private final PromotionDBRepository promotionDBRepository;
    private final PromotionRepositoryMapper mapper;

    @Override
    @Transactional
    public void saveReview(PromotionDomainEntity promotionDomain) {
        PromotionDBEntity dbEntity = mapper.toDBEntity(promotionDomain);
        this.promotionDBRepository.save(dbEntity);
    }

    @Override
    @Transactional(readOnly = true)
    public List<PromotionDomainEntity> findAllPromotionCustomersId(UUID customerId) {
        return promotionDBRepository.findByCustomerIdAndActive(customerId, true)
                .stream()
                .map(mapper::toDomainEntity)
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public List<PromotionDomainEntity> findAllPromotionByDishesId(UUID dishesId) {
        return promotionDBRepository.findByDishIdAndActive(dishesId, true)
                .stream()
                .map(mapper::toDomainEntity)
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public List<PromotionDomainEntity> findAllPromotionRoomId(UUID roomId) {
        return promotionDBRepository.findByRoomIdAndActive(roomId, true)
                .stream()
                .map(mapper::toDomainEntity)
                .toList();
    }

    @Override
    public PromotionDomainEntity findPromotionById(UUID promotionId) {
        PromotionDBEntity dbEntity = promotionDBRepository.findById(promotionId)
                .orElseThrow(() -> new BadRequestException("Promocion no encontrada"));

        return mapper.toDomainEntity(dbEntity);
    }
}
