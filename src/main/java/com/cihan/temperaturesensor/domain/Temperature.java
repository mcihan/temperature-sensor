package com.cihan.temperaturesensor.domain;

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
    private Long value;
    private OffsetDateTime startDate;
}
