package com.cihan.temperaturesensor.domain.model;

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

    @Column(name = "value", nullable = false)
    private long value;

    @Column(name = "sensorId", nullable = false)
    private String sensorId;

    @Column(name = "start_date", nullable = false)
    private OffsetDateTime startDate;
}
