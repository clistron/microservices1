package com.petrov.recommendationservice.dto;

import lombok.Builder;

@Builder(setterPrefix = "with")
public record CompanyResponseDto(
        Long id,
        String company){
}
