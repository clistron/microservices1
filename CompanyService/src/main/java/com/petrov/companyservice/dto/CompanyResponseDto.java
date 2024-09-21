package com.petrov.companyservice.dto;

import lombok.Builder;

@Builder(setterPrefix = "with")
public record CompanyResponseDto(
        Long id,
        String position){
}