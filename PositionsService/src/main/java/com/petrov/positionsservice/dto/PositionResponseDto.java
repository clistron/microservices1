package com.petrov.positionsservice.dto;

import lombok.Builder;

@Builder(setterPrefix = "with")
public record PositionResponseDto(
        Long id,
        String position){
}