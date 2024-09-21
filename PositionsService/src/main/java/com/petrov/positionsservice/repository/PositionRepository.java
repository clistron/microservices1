package com.petrov.positionsservice.repository;

import com.petrov.positionsservice.model.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepository  extends JpaRepository<Position, Long> {
}
