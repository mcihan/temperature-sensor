package com.cihan.temperaturesensor.service;

import com.cihan.temperaturesensor.domain.dto.Temperature;
import com.cihan.temperaturesensor.repository.TemperatureRepository;
import com.cihan.temperaturesensor.util.TemperatureMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ReportService {

    private final TemperatureRepository temperatureRepository;
    private final TemperatureMapper temperatureMapper;

    public List<Temperature> collectTemperatures() {
        return temperatureRepository.findAll().stream()
                .map(temperatureMapper::toTemperature)
                .collect(Collectors.toList());
    }

    public List<Temperature> collectTemperaturesByTime(OffsetDateTime startDate, OffsetDateTime endDate) {
        return temperatureRepository.findAll().stream()
                .filter(t -> t.getStartDate().compareTo(startDate) > 0)
                .filter(t -> t.getStartDate().compareTo(endDate) < 0)
                .map(temperatureMapper::toTemperature)
                .collect(Collectors.toList());
    }
}
