package com.cihan.temperaturesensor.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table(name = "Temperature")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TemperatureEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "temperatureValue", nullable = false)
    private long temperatureValue;

    @Column(name = "sensorId", nullable = false)
    private String sensorId;

    @Column(name = "start_date", nullable = false)
    private OffsetDateTime startDate;
}
