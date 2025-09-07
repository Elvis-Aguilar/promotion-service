package com.eatsleep.promotion.promotion.application.usecases;

import com.eatsleep.promotion.common.application.annotations.UseCase;
import com.eatsleep.promotion.promotion.application.ports.input.ListAllPromotionByRoomIdInputPort;
import com.eatsleep.promotion.promotion.application.ports.output.FindingAllPromotionRoomIdOutputPort;
import com.eatsleep.promotion.promotion.domain.model.PromotionDomainEntity;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.UUID;

@UseCase
@RequiredArgsConstructor
public class ListAllPromotionsByRoomIdCase implements ListAllPromotionByRoomIdInputPort {

    private final FindingAllPromotionRoomIdOutputPort findingAllPromotionRoomIdOutputPort;

    @Override
    public List<PromotionDomainEntity> listAllPromotionByRoomId(UUID roomId) {
        return findingAllPromotionRoomIdOutputPort.findAllPromotionRoomId(roomId);
    }
}
