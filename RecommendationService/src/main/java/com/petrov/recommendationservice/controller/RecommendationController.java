package com.petrov.recommendationservice.controller;

import com.petrov.recommendationservice.dto.RecommendationResponseDto;
import com.petrov.recommendationservice.service.RecommendationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/recommendation")
public class RecommendationController {

    @Autowired
    private RecommendationService recommendationService;

    @GetMapping("/{id}")
    public RecommendationResponseDto getRecommendationById(@PathVariable(name = "id") Long id) {
        return recommendationService.get(id);
    }
}