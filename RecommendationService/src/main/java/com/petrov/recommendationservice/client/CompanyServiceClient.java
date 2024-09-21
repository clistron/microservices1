package com.petrov.recommendationservice.client;

import com.petrov.recommendationservice.dto.CompanyResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CompanyServiceClient {

    @Autowired
    private RestTemplate template;

    public CompanyResponseDto getCompanyInfo(Long companyId){

        return template.getForObject("http://COMPANY-SERVICE/company/" + companyId, CompanyResponseDto.class);
    }

}
