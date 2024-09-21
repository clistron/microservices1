package com.petrov.recommendationservice.dto;

import lombok.Builder;

@Builder(setterPrefix = "with")
public record RecommendationResponseDto(
        Long id,
        String fullName,
        CompanyResponseDto company,
        PositionResponseDto position,
        String recommendation){
}
