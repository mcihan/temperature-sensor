package com.cihan.temperaturesensor.util;

import com.cihan.temperaturesensor.controller.dto.PublishTemperatureRequest;
import com.cihan.temperaturesensor.domain.Temperature;
import com.cihan.temperaturesensor.domain.model.TemperatureEntity;
import org.springframework.stereotype.Component;

@Component
public class TemperatureMapper {
    public TemperatureEntity toTemperatureEntity(Temperature temperature) {
        return TemperatureEntity.builder()
                .sensorId(temperature.getSensorId())
                .value(temperature.getValue())
                .startDate(temperature.getStartDate())
                .build();
    }

    public Temperature toTemperature(TemperatureEntity temperatureEntity) {
        return Temperature.builder()
                .sensorId(temperatureEntity.getSensorId())
                .value(temperatureEntity.getValue())
                .startDate(temperatureEntity.getStartDate())
                .build();
    }

    public Temperature toTemperature(PublishTemperatureRequest request) {
        return Temperature.builder()
                .sensorId(request.getSensorId())
                .value(request.getValue())
                .startDate(request.getStartDate())
                .build();
    }
}
