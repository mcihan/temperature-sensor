package com.cihan.temperaturesensor.controller.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.time.OffsetDateTime;

@Data
@Builder
@Schema(name = "PublishTemperatureRequest", description = "Publish Temperature Request")
public class PublishTemperatureRequest {

    @Valid
    @NotNull
    private String sensorId;

    @Valid
    @NotNull
    private Long value;

    @Valid
    @NotNull
    private OffsetDateTime startDate;
}
