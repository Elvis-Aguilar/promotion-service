package com.eatsleep.promotion.promotion.infrastructure.inputadapter.rest;

import com.eatsleep.promotion.common.infrastructure.annotation.WebAdapter;
import com.eatsleep.promotion.promotion.application.ports.input.CreatingPromotionInputPort;
import com.eatsleep.promotion.promotion.application.ports.input.ListAllPromotionByCustomerIdInputPort;
import com.eatsleep.promotion.promotion.application.ports.input.ListAllPromotionByDishesIdInputPort;
import com.eatsleep.promotion.promotion.application.ports.input.ListAllPromotionByRoomIdInputPort;
import com.eatsleep.promotion.promotion.application.usecases.CreatePromotionCaseDto;
import com.eatsleep.promotion.promotion.infrastructure.inputadapter.dto.CreatPromotionRequestDto;
import com.eatsleep.promotion.promotion.infrastructure.inputadapter.dto.PromotionResponseDto;
import com.eatsleep.promotion.promotion.infrastructure.inputadapter.mapper.PromotionRestMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("v1/promotions")
@WebAdapter
@RequiredArgsConstructor
public class PromotionControllerAdapter {

    private final CreatingPromotionInputPort creatingPromotionInputPort;
    private final ListAllPromotionByCustomerIdInputPort listAllPromotionByCustomerIdInputPort;
    private final ListAllPromotionByRoomIdInputPort listAllPromotionByRoomIdInputPort;
    private final ListAllPromotionByDishesIdInputPort listAllPromotionByDishesIdInputPort;
    private final PromotionRestMapper mapper;

    @PostMapping()
    @Transactional
    public ResponseEntity<Void> createPromotion(@RequestBody @Valid CreatPromotionRequestDto dto){
        CreatePromotionCaseDto caseDto = dto.toCase();
        creatingPromotionInputPort.createPromotion(caseDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/customer/{customerId}")
    public ResponseEntity<List<PromotionResponseDto>> getAllPromotionFindByCustomerId(@PathVariable UUID customerId){
        List<PromotionResponseDto> dtoList = listAllPromotionByCustomerIdInputPort.listAllPromotionByCustomerId(customerId)
                .stream()
                .map(mapper::toResponse)
                .toList();

        return ResponseEntity.ok().body(dtoList);
    }

    @GetMapping("/room/{roomId}")
    public ResponseEntity<List<PromotionResponseDto>> getAllPromotionFindByRoomId(@PathVariable UUID roomId){
        List<PromotionResponseDto> dtoList = listAllPromotionByRoomIdInputPort.listAllPromotionByRoomId(roomId)
                .stream()
                .map(mapper::toResponse)
                .toList();

        return ResponseEntity.ok().body(dtoList);
    }

    @GetMapping("/dishes/{dishesID}")
    public ResponseEntity<List<PromotionResponseDto>> getAllPromotionFindByDishesId(@PathVariable UUID dishesID){
        List<PromotionResponseDto> dtoList = listAllPromotionByDishesIdInputPort.listAllPromotionByDishesId(dishesID)
                .stream()
                .map(mapper::toResponse)
                .toList();

        return ResponseEntity.ok().body(dtoList);
    }


}
