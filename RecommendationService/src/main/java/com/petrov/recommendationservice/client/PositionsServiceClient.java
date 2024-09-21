package com.petrov.recommendationservice.client;

import com.petrov.recommendationservice.dto.PositionResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PositionsServiceClient {

    @Autowired
    private RestTemplate template;

    public PositionResponseDto getPositionInfo(Long positionId){
        return template.getForObject("http://POSITIONS-SERVICE/position/" + positionId, PositionResponseDto.class);
    }
}
