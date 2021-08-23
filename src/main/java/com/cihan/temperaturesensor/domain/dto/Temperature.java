package com.cihan.temperaturesensor.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Temperature {
    private String sensorId;
    private Long temperatureValue;
    private OffsetDateTime startDate;
}
