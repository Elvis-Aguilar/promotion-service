package com.eatsleep.promotion.promotion.application.usecases;

import com.eatsleep.promotion.common.application.annotations.UseCase;
import com.eatsleep.promotion.promotion.application.ports.input.ListAllPromotionByCustomerInputPort;
import com.eatsleep.promotion.promotion.application.ports.output.FindingAllPromotionCustomersOutputPort;
import com.eatsleep.promotion.promotion.domain.model.PromotionDomainEntity;
import lombok.RequiredArgsConstructor;

import java.util.List;

@UseCase
@RequiredArgsConstructor
public class ListAllPromotionsByCustomerCase implements ListAllPromotionByCustomerInputPort {

    private final FindingAllPromotionCustomersOutputPort outputPort;

    @Override
    public List<PromotionDomainEntity> listAllPromotionByCustomer() {
        return outputPort.findAllPromotionCustomers();
    }
}
