package com.cihan.temperaturesensor.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.time.OffsetDateTime;

@Data
@Builder
@Schema(name = "SendTemperatureRequest", description = "Send Temperature Request")
public class SendTemperatureRequest {

    @Valid
    @NotNull
    private String sensorId;

    @Valid
    @NotNull
    private Long temperatureValue;

    @Valid
    @NotNull
    private OffsetDateTime startDate;
}
