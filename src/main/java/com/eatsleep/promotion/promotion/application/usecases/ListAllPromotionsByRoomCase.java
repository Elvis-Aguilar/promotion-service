package com.eatsleep.promotion.promotion.application.usecases;

import com.eatsleep.promotion.common.application.annotations.UseCase;
import com.eatsleep.promotion.promotion.application.ports.input.ListAllPromotionByRoomInputPort;
import com.eatsleep.promotion.promotion.application.ports.output.FindingAllPromotionRoomOutputPort;
import com.eatsleep.promotion.promotion.domain.model.PromotionDomainEntity;
import lombok.RequiredArgsConstructor;

import java.util.List;

@UseCase
@RequiredArgsConstructor
public class ListAllPromotionsByRoomCase  implements ListAllPromotionByRoomInputPort {

    private final FindingAllPromotionRoomOutputPort outputPort;

    @Override
    public List<PromotionDomainEntity> listAllPromotionByRoom() {
        return outputPort.findAllPromotionRoom();
    }
}
