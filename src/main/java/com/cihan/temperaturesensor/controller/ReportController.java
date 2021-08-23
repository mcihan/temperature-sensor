package com.cihan.temperaturesensor.controller;

import com.cihan.temperaturesensor.domain.dto.Temperature;
import com.cihan.temperaturesensor.service.ReportService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.OffsetDateTime;
import java.util.List;


@RestController
@RequestMapping("/report")
@AllArgsConstructor
@Tag(name = "report", description = "Report Controller API")
public class ReportController {

    private final ReportService reportService;

    @ResponseBody
    @GetMapping(value = "/temperatures")
    public ResponseEntity<List<Temperature>> collectTemperature() {
        List<Temperature> temperatures = reportService.collectTemperatures();
        return ResponseEntity.status(HttpStatus.OK).body(temperatures);
    }

    @ResponseBody
    @GetMapping(value = "/temperatures/by-time-range")
    public ResponseEntity<List<Temperature>> collectTemperatureByTime(@RequestParam("startDate") OffsetDateTime startDate,
                                                                      @RequestParam("endDate") OffsetDateTime endDate) {
        List<Temperature> temperatures = reportService.collectTemperaturesByTime(startDate, endDate);
        return ResponseEntity.status(HttpStatus.OK).body(temperatures);
    }
}
