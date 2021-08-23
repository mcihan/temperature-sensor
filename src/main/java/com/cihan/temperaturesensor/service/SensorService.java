package com.cihan.temperaturesensor.service;

import com.cihan.temperaturesensor.domain.Temperature;
import com.cihan.temperaturesensor.domain.TemperatureConstant;
import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@AllArgsConstructor
public class SensorService {

    KafkaTemplate<String, Temperature> kafkaTemplate;

    public Temperature publishTemperature(@RequestBody Temperature request) {
        kafkaTemplate.send(TemperatureConstant.TOPIC, request);
        return request;
    }
}
