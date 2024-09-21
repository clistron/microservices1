package com.petrov.companyservice.service;

import com.petrov.companyservice.model.Company;
import com.petrov.companyservice.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompanyService {
    @Autowired
    private CompanyRepository companyRepository;

    public Optional<Company> get(Long id){
        return companyRepository.findById(id);
    }
}
