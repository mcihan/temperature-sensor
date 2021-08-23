package com.cihan.temperaturesensor.repository;

import com.cihan.temperaturesensor.domain.entity.TemperatureEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemperatureRepository extends JpaRepository<TemperatureEntity, Long> {
}
