package com.petrov.companyservice.mapper;

import com.petrov.companyservice.dto.CompanyResponseDto;
import com.petrov.companyservice.model.Company;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.Optional;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        builder = @Builder(disableBuilder = true))
public interface CompanyMapper {

    CompanyResponseDto fromEntityToDto(Optional<Company> position);

}