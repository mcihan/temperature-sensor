package com.cihan.temperaturesensor.controller;

import com.cihan.temperaturesensor.controller.dto.PublishTemperatureRequest;
import com.cihan.temperaturesensor.service.SensorService;
import com.cihan.temperaturesensor.util.TemperatureMapper;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sensor")
@AllArgsConstructor
@Tag(name = "sensor", description = "Sensor Controller API")
public class SensorController {

    private final TemperatureMapper temperatureMapper;
    private final SensorService sensorService;

    @ResponseBody
    @PostMapping(value = "/publish")
    public ResponseEntity publishTemperature(@RequestBody PublishTemperatureRequest request) {
        sensorService.publishTemperature(temperatureMapper.toTemperature(request));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
