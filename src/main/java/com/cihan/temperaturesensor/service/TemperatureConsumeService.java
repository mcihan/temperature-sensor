package com.cihan.temperaturesensor.service;

import com.cihan.temperaturesensor.domain.dto.Temperature;
import com.cihan.temperaturesensor.domain.TemperatureConstant;
import com.cihan.temperaturesensor.repository.TemperatureRepository;
import com.cihan.temperaturesensor.util.TemperatureMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class TemperatureConsumeService {

    private final TemperatureRepository temperatureRepository;
    private final TemperatureMapper temperatureMapper;

    @KafkaListener(topics = TemperatureConstant.TOPIC)
    public void consumeTemperature(Temperature temperature) {
        temperatureRepository.save(temperatureMapper.toTemperatureEntity(temperature));
        log.info("Temperature Consumed and recorded --> {}" + temperature.toString());
    }
}
