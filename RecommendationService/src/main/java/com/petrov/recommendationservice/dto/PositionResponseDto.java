package com.petrov.recommendationservice.dto;

import lombok.Builder;

@Builder(setterPrefix = "with")
public record PositionResponseDto(
        Long id,
        String position){
}