package com.cihan.temperaturesensor.util;

import com.cihan.temperaturesensor.domain.dto.SendTemperatureRequest;
import com.cihan.temperaturesensor.domain.dto.Temperature;
import com.cihan.temperaturesensor.domain.entity.TemperatureEntity;
import org.springframework.stereotype.Component;

@Component
public class TemperatureMapper {
    public TemperatureEntity toTemperatureEntity(Temperature temperature) {
        return TemperatureEntity.builder()
                .sensorId(temperature.getSensorId())
                .temperatureValue(temperature.getTemperatureValue())
                .startDate(temperature.getStartDate())
                .build();
    }

    public Temperature toTemperature(TemperatureEntity temperatureEntity) {
        return Temperature.builder()
                .sensorId(temperatureEntity.getSensorId())
                .temperatureValue(temperatureEntity.getTemperatureValue())
                .startDate(temperatureEntity.getStartDate())
                .build();
    }

    public Temperature toTemperature(SendTemperatureRequest request) {
        return Temperature.builder()
                .sensorId(request.getSensorId())
                .temperatureValue(request.getTemperatureValue())
                .startDate(request.getStartDate())
                .build();
    }
}
