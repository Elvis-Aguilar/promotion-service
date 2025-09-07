package com.eatsleep.promotion.promotion.application.usecases;

import com.eatsleep.promotion.common.application.annotations.UseCase;
import com.eatsleep.promotion.promotion.application.ports.input.ListAllPromotionByCustomerIdInputPort;
import com.eatsleep.promotion.promotion.application.ports.output.FindingAllPromotionCustomersIdOutputPort;
import com.eatsleep.promotion.promotion.domain.model.PromotionDomainEntity;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.UUID;


@UseCase
@RequiredArgsConstructor
public class ListAllPromotionsByCustomerIdCase implements ListAllPromotionByCustomerIdInputPort {

    private final FindingAllPromotionCustomersIdOutputPort findingAllPromotionCustomersIdOutputPort;

    @Override
    public List<PromotionDomainEntity> listAllPromotionByCustomerId(UUID customerId) {
        return findingAllPromotionCustomersIdOutputPort.findAllPromotionCustomersId(customerId);
    }
}
