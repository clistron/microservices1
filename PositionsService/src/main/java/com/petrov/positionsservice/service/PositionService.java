package com.petrov.positionsservice.service;

import com.petrov.positionsservice.model.Position;
import com.petrov.positionsservice.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PositionService {
    @Autowired
    private PositionRepository positionRepository;

    public Optional<Position> get(Long id){
        return positionRepository.findById(id);
    }
}
