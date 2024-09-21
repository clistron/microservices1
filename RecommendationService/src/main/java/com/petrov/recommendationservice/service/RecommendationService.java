package com.petrov.recommendationservice.service;

import com.petrov.recommendationservice.client.CompanyServiceClient;
import com.petrov.recommendationservice.client.PositionsServiceClient;
import com.petrov.recommendationservice.dto.CompanyResponseDto;
import com.petrov.recommendationservice.dto.PositionResponseDto;
import com.petrov.recommendationservice.dto.RecommendationResponseDto;
import com.petrov.recommendationservice.model.Recommendation;
import com.petrov.recommendationservice.repository.RecommendationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RecommendationService {
    @Autowired
    private RecommendationRepository recommendationRepository;
    @Autowired
    private CompanyServiceClient companyServiceClient;
    @Autowired
    private PositionsServiceClient positionsServiceClient;

    public RecommendationResponseDto get(Long id){
        Optional<Recommendation> recommendation = recommendationRepository.findById(id);

        CompanyResponseDto companyResponseDto = companyServiceClient.getCompanyInfo(recommendation.get().getCompanyId());
        PositionResponseDto positionResponseDto = positionsServiceClient.getPositionInfo(recommendation.get().getPositionId());

        return RecommendationResponseDto.builder()
                .withId(recommendation.get().getId())
                .withFullName(recommendation.get().getFullName())
                .withRecommendation(recommendation.get().getRecommendation())
                .withCompany(companyResponseDto)
                .withPosition(positionResponseDto)
                .build();
    }
}
