package com.petrov.positionsservice.mapper;

import com.petrov.positionsservice.dto.PositionResponseDto;
import com.petrov.positionsservice.model.Position;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.Optional;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        builder = @Builder(disableBuilder = true))
public interface PositionMapper {

    PositionResponseDto fromEntityToDto(Optional<Position> position);

}